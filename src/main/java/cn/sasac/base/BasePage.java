package cn.sasac.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * @author daixuzhong
 * @title: BasePage
 * @description:  页面基类，所有page页面都要继承这个类
 * @date 2019/7/1
 */
public class BasePage {

    private static Logger logger = LoggerFactory.getLogger(BasePage.class);

    private WebDriver driver;

    //最大超时时间，单位：秒
    private final int timeOut = 10;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeOut) , this);
    }

    BasePage(WebDriver driver, final String title) {
        this.driver = driver;

        //如果不进行判断，
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        try{
            boolean flag = wait.until(new ExpectedCondition<Boolean>(){
                @Override
                public Boolean apply(WebDriver arg0) {
                    String acttitle = arg0.getTitle();
                    return acttitle.equals(title);
                }});
        }catch(TimeoutException te) {
            throw new IllegalStateException("当前不是预期页面，当前页面title是：" + driver.getTitle());
        }

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeOut) , this);

    }

    /**
     * 点击方法
     * @param element
     */
    public void click(WebElement element) {
        // 显式等待
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * 输入
     * @param element
     * @param s
     */
    public void sendKey(WebElement element, String s) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
        // 先清空输入框
        element.clear();
        // 输入数据
        element.sendKeys(s);
    }

    /**
     * 获取文本
     * @param element
     * @return
     */
    public String getText(WebElement element) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }


    /**
     * 判断元素是否存在
     * @param element
     * @return
     */
    public boolean assertElementExist(WebElement element) {
        boolean flag = false;
        if (element != null) {
            flag = true;
        }
        return flag;
    }

    /**
     * 切换窗口
     * @param title
     */
    public void switchWindow(String title) {
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (handle.equals(driver.getWindowHandle())) {
                continue;
            } else {
                driver.switchTo().window(handle);
                if (title.contains(driver.getTitle())) {
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    /**
     * 模拟键盘-回车
     */
    public void keyEnter() {
        Actions action = new Actions(driver);
        action .sendKeys(Keys.ENTER).perform();
    }


    /**
     * 层级定位
     * @param element
     * @param by
     * @return
     */
    public WebElement nodeElement(WebElement element, By by){
        return element.findElement(by);
    }

    /**
     * 浏览器滚动条托到直到该元素可见
     */
    public void scrolltoBottom(WebElement e) {
        //创建一个javascript 执行实例
        JavascriptExecutor je = (JavascriptExecutor) driver;
        //执行js语句，拖拽浏览器滚动条，直到该元素到底部，马上就不可以见
        je.executeScript("arguments[0].scrollIntoView(true);",e);

    }

    /**
     * 截图保存
     */
    public void saveScreenshot(String fileName, String moduleName) {
        File scrFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        //图片保存目录
        String tempPath =  "D:\\BMAutoTest\\screenshoot\\" + moduleName + "\\";
        try {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件对象。
            FileUtils.copyFile(scrFile, new File( tempPath + fileName + ".png"));
        } catch (IOException e) {
            // 异常处理
            logger.error("******saveScreenshot error: " + e);
        }
    }

    /**
     * 注销
     */
    public void logOff() {
        click((new WebDriverWait(driver, 6))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class=\"ti-power-off\"]"))));
    }

    /**
     * 导航栏提示框，“×”关闭按钮
     */
    public void closeTopNaviTip() {
        click((new WebDriverWait(driver, 6))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"×\"]"))));
    }

}
