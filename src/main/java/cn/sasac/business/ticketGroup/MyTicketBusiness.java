package cn.sasac.business.ticketGroup;

import cn.sasac.action.ticketGroup.MyTicketAction;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: MyTicketBusiness
 * @description: TODO
 * @date 2019/7/1
 */
public class MyTicketBusiness {

    private MyTicketAction myTicketAction;

    public MyTicketBusiness(WebDriver driver) {
        myTicketAction = new MyTicketAction(driver);
    }

    /**
     * 点击进入工程项目
     */
    public void enterGcxm() {
        myTicketAction.clickGcxm();
    }



}
