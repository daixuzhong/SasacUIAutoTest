package cn.sasac.page.sysAdmin;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author daixuzhong
 * @title: HomePage
 * @description: 主页
 * @date 2019/7/1
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //注销按钮
    @FindBy(xpath = "//a[@title=\"注销:admin\"]")
    private WebElement logOffBtn;

//    //预算编制
//    @FindBy(xpath = "//a[text()=\"预算编制\"]")
//    private WebElement ticketGroup;

    //管控执行
    @FindBy(xpath = "//a[text()=\"管控执行\"]")
    private WebElement ticketGroup;

    //决策分析
    @FindBy(xpath = "//a[text()=\"决策分析\"]")
    private WebElement analysisReport;

    //管理设置
    @FindBy(xpath = "//a[text()=\"管理设置\"]")
    private WebElement sysAdmin;

    public WebElement getLogOffBtn() {
        return logOffBtn;
    }

    public WebElement getTicketGroup() {
        return ticketGroup;
    }

    public WebElement getAnalysisReport() {
        return analysisReport;
    }

    public WebElement getSysAdmin() {
        return sysAdmin;
    }
}
