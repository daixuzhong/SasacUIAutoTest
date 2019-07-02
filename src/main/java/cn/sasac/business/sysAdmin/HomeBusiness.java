package cn.sasac.business.sysAdmin;

import cn.sasac.action.sysAdmin.HomeAction;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: HomeBusiness
 * @description: TODO
 * @date 2019/7/1
 */
public class HomeBusiness {

    private HomeAction homeAction;

    public HomeBusiness(WebDriver driver) {
        homeAction = new HomeAction(driver);
    }

    /**
     * 判断是否登陆成功
     * @return
     */
    public boolean isLogin() {
        return homeAction.assertLoginSuccess();
    }

    /**
     * 点击进入管控执行
     */
    public void enterTicketGroup() {
        homeAction.clickTicketGroup();
    }




}
