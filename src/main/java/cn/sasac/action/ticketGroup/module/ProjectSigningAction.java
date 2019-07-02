package cn.sasac.action.ticketGroup.module;

import cn.sasac.page.ticketGroup.module.ProjectSigningPage;
import cn.sasac.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * @author daixuzhong
 * @title: ProjectSigningAction
 * @description: TODO
 * @date 2019/7/1
 */
public class ProjectSigningAction extends FormBaseAction {

    private WebDriver driver;
    private ProjectSigningPage projectSigningPage;

    public ProjectSigningAction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        projectSigningPage = new ProjectSigningPage(driver);
    }

    /**
     * 选择公司主体
     * @param crop
     * @throws InterruptedException
     */
    public void chooseCrop(String crop) throws InterruptedException {
        //点击公司主体
        projectSigningPage.click(projectSigningPage.getCrop());
        //输入值
        projectSigningPage.sendKey(projectSigningPage.getCropInput(), crop);
        Thread.sleep(1000);
        //点击查询结果
        projectSigningPage.click(projectSigningPage.getCropRes());
    }

    /**
     * 选择前期项目经理
     * @param refItem3
     * @throws InterruptedException
     */
    public void chooseRefItem3(String refItem3) throws InterruptedException {
        //点击前期项目经理
        projectSigningPage.click(projectSigningPage.getRefItem3());
        //输入值
        projectSigningPage.sendKey(projectSigningPage.getRefItem3Input(), refItem3);
        Thread.sleep(1000);
        //点击查询结果
        projectSigningPage.click(projectSigningPage.getRefItem3Res());
    }

    /**
     * 选择项目类型
     * @param refItem1
     * @throws InterruptedException
     */
    public void chooseRefItem1(String refItem1) throws InterruptedException {
        //点击项目类型
        projectSigningPage.click(projectSigningPage.getRefItem1());
        //输入值
        projectSigningPage.sendKey(projectSigningPage.getRefItem1Input(), refItem1);
        Thread.sleep(1000);
        //点击查询结果
        projectSigningPage.click(projectSigningPage.getRefItem1Res());
    }

    /**
     * 选择资金来源
     * @param field01
     * @throws InterruptedException
     */
    public void chooseField01(String field01) throws InterruptedException {
        //点击资金来源
        projectSigningPage.click(projectSigningPage.getField01());
        //输入值
        projectSigningPage.sendKey(projectSigningPage.getField01Input(), field01);
        Thread.sleep(1000);
        //点击查询结果
        projectSigningPage.click(projectSigningPage.getField01Res());
    }


    /**
     * 选择是否历史项目 0否1是
     * @param i
     */
    public void chooseHistory(int i) {
        Select select = new Select(projectSigningPage.getHistoryProject());
        //0否1是
        if (i == 0) {
            select.selectByVisibleText(Constants.NO);
        }else {
            select.selectByVisibleText(Constants.YES);
        }
    }

    /**
     * 输入项目简述及必要性陈述
     * @param subject
     */
    public void sendSubject(String subject) {
        projectSigningPage.sendKey(projectSigningPage.getSubject(), subject);
    }

    /**
     * 输入项目标题
     * @param title
     */
    public void sendTitle(String title) {
        projectSigningPage.sendKey(projectSigningPage.getTitle(), title);
    }

    /**
     * 选择计划开始时间，格式：2019-07-18
     * @param beginTime
     */
    public void chooseBeginTime(String beginTime) {
        projectSigningPage.sendKey(projectSigningPage.getBeginTime(),beginTime);
    }

    /**
     * 选择计划结束时间，格式：2019-07-19
     * @param endTime
     */
    public void chooseEndTime(String endTime) {
        projectSigningPage.sendKey(projectSigningPage.getEndTime(), endTime);
    }

    /**
     * 点击上传按钮
     */
    public void clickUploading() throws InterruptedException {

        WebElement e = driver.findElement(By.name("file1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('type', arguments[1])", e, "hidden");
        Thread.sleep(3000);
        projectSigningPage.click(projectSigningPage.getUploadingBtn());

    }


}
