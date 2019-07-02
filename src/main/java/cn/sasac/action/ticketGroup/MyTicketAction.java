package cn.sasac.action.ticketGroup;

import cn.sasac.page.ticketGroup.MyTicketPage;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: MyTicketAction
 * @description: TODO
 * @date 2019/7/1
 */
public class MyTicketAction {

    private MyTicketPage myTicketPage;

    public MyTicketAction(WebDriver driver) {
        myTicketPage = new MyTicketPage(driver);
    }

    /**
     * 点击工程项目
     */
    public void clickGcxm() {
        myTicketPage.click(myTicketPage.getGcxm());
    }




}
