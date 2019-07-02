package cn.sasac.cases.sysAdmin;

import cn.sasac.base.BaseCase;
import cn.sasac.business.sysAdmin.LoginBusiness;
import cn.sasac.exception.LoginException;
import cn.sasac.utils.ProUtil;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * @author daixuzhong
 * @title: LoginTest
 * @description: 登录测试
 * @date 2019/7/1
 */
public class LoginTest extends BaseCase {

    private static Logger logger = LoggerFactory.getLogger(LoginTest.class);

    //选择浏览器
    public static WebDriver driver = initDriver("chrome");;

    @Test
    public void loginAdmin() throws LoginException {
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
        } catch (Exception e) {
            logger.error("******login Error!!!!!!!",e);
            logger.error("msg: ", e);
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }




}
