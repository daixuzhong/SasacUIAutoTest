package cn.sasac.business.sysAdmin;

import cn.sasac.action.sysAdmin.LoginAction;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: LoginBusiness
 * @description: TODO
 * @date 2019/7/1
 */
public class LoginBusiness {

    private LoginAction loginAction;

    public LoginBusiness(WebDriver driver) {
        loginAction = new LoginAction(driver);
    }

    /**
     * 登录
     * @param loginName
     * @param password
     * @throws InterruptedException
     */
    public void login(String loginName, String password) throws InterruptedException {
        loginAction.sendLoginName(loginName);
        loginAction.sendPassword(password);
        Thread.sleep(1000);
        loginAction.clickBtnLogin();
    }

}
