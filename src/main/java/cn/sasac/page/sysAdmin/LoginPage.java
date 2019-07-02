package cn.sasac.page.sysAdmin;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author daixuzhong
 * @title: LoginPage
 * @description: 门户登录页
 * @date 2019/7/1
 */
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //用户名
    @FindBy(id = "LoginName")
    private WebElement loginName;

    //密码
    @FindBy(id = "Password")
    private WebElement password;

    //登录按钮
    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    public WebElement getLoginName() {
        return loginName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }
}
