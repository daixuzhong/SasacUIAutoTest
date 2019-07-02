package cn.sasac.cases.ticketGroup;

import cn.sasac.base.BaseCase;
import cn.sasac.business.sysAdmin.HomeBusiness;
import cn.sasac.business.sysAdmin.LoginBusiness;
import cn.sasac.business.ticketGroup.MyTicketBusiness;
import cn.sasac.business.ticketGroup.module.GcxmBusiness;
import cn.sasac.business.ticketGroup.module.ProjectSigningBusiness;
import cn.sasac.cases.sysAdmin.LoginTest;
import cn.sasac.entity.ProjectSigning;
import cn.sasac.exception.LoginException;
import cn.sasac.utils.ProUtil;
import org.apache.regexp.RE;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Date;
import java.util.Set;

/**
 * @author daixuzhong
 * @title: ProjectSigningTest
 * @description: 工程项目立项测试
 * @date 2019/7/1
 */
public class ProjectSigningTest extends BaseCase {

    private static Logger logger = LoggerFactory.getLogger(ProjectSigningTest.class);

    public static WebDriver driver = initDriver("chrome");

    public static String title;

    /**
     *  登录
     */
    @BeforeTest
    public void beforeTest() throws LoginException {
        driver.get("http://47.100.40.166:8026");
        LoginBusiness loginBusiness = new LoginBusiness(driver);
        //获取登录参数
        ProUtil proUtil = new ProUtil("sysAdmin/userInfo.properties");
        String[] userInfo = proUtil.formatUserInfo(proUtil.readFile("admin"));
        if (null == userInfo || userInfo.length == 0) {
            logger.error("*****读取账号数据失败!!!");
            throw new LoginException("读取账号数据失败!");
        }
        try {
            //登录
            loginBusiness.login(userInfo[0],userInfo[1]);

            HomeBusiness homeBusiness = new HomeBusiness(driver);
            //判断是否登录
            if (!homeBusiness.isLogin()) {
                logger.error("*****登录失败!!!");
                throw new LoginException("登录失败！");
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            logger.error("******login Error!!!!!!!",e);
            logger.error("msg: ", e);
            driver.quit();
        }

    }

    /**
     * 提交工程项目立项单
     * @throws LoginException
     * @throws InterruptedException
     */
    @Test
    public void a_test() throws LoginException, InterruptedException, AWTException {
        HomeBusiness homeBusiness = new HomeBusiness(driver);
        //点击进入管控执行
        homeBusiness.enterTicketGroup();

        MyTicketBusiness myTicketBusiness = new MyTicketBusiness(driver);
        //点击进入工程项目
        myTicketBusiness.enterGcxm();
        Thread.sleep(5000);

        // 获取当前页面句柄
        String handle = driver.getWindowHandle();
        GcxmBusiness gcxmBusiness = new GcxmBusiness(driver);
        //切换iframe
        driver.switchTo().frame(gcxmBusiness.getIframe());
        //点击立项
        gcxmBusiness.createItem();
        Thread.sleep(2000);
        // 获取所有页面的句柄，并循环判断不是当前的句柄
        for (String handles : driver.getWindowHandles()) {
            if (!handles.equals(handle)){
                //点击立项会弹出新窗口，需要切换浏览器句柄
                driver.switchTo().window(handles);
            }
        }
        Thread.sleep(1000);

        ProjectSigningBusiness projectSigningBusiness = new ProjectSigningBusiness(driver);
        //填写立项单
        projectSigningBusiness.writeProjectSigning(getCreateItemParam());
        Thread.sleep(5000);

        //校验单据数据正确性


    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    /**
     * 获取工程项目立项参数
     * @return
     */
    public ProjectSigning getCreateItemParam() {
        ProUtil proUtil = new ProUtil("ticketGroup/projectSigning.properties");

        ProjectSigning param = new ProjectSigning();
        param.setCrop(proUtil.readFile("crop"));
        param.setRefItem3(proUtil.readFile("refItem3"));
        param.setIsHistoryProject(Integer.valueOf(proUtil.readFile("isHistoryProject")));
        title = proUtil.readFile("title") + new Date().getTime();
        param.setTitle(title);
        param.setRefItem1(proUtil.readFile("refItem1"));
        param.setField01(proUtil.readFile("field01"));
        param.setSubject(proUtil.readFile("subject"));
        param.setBeginTime(proUtil.readFile("beginTime"));
        param.setEndTime(proUtil.readFile("endTime"));

        return param;
    }


}
