package cn.sasac.action.sysAdmin;

import cn.sasac.page.sysAdmin.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: HomeAction
 * @description: TODO
 * @date 2019/7/1
 */
public class HomeAction {

    private HomePage homePage;

    public HomeAction(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    /**
     * 判断是否登陆成功
     */
    public boolean assertLoginSuccess() {
        return homePage.assertElementExist(homePage.getLogOffBtn());
    }

    /**
     * 点击管控执行
     */
    public void clickTicketGroup() {
        homePage.click(homePage.getTicketGroup());
    }



}
