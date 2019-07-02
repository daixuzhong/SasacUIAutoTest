package cn.sasac.action.sysAdmin;

import cn.sasac.page.sysAdmin.LoginPage;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: LoginAction
 * @description: TODO
 * @date 2019/7/1
 */
public class LoginAction {

    private LoginPage loginPage;

    public LoginAction(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    /**
     * 输入用户名
     * @param loginName
     */
    public void sendLoginName(String loginName) {
        loginPage.sendKey(loginPage.getLoginName(), loginName);
    }

    /**
     * 输入密码
     * @param password
     */
    public void sendPassword(String password) {
        loginPage.sendKey(loginPage.getPassword(), password);
    }

    /**
     * 点击登录按钮
     */
    public void clickBtnLogin() {
        loginPage.click(loginPage.getBtnLogin());
    }

}
