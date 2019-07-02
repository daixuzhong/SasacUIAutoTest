package cn.sasac.business.ticketGroup.module;

import cn.sasac.action.ticketGroup.module.GcxmAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author daixuzhong
 * @title: GcxmBusiness
 * @description: TODO
 * @date 2019/7/1
 */
public class GcxmBusiness {

    private GcxmAction gcxmAction;

    public GcxmBusiness(WebDriver driver) {
        gcxmAction = new GcxmAction(driver);
    }

    /**
     * 获取iframe
     */
    public WebElement getIframe() {
        return gcxmAction.getIframe();
    }

    /**
     * 立项
     */
    public void creatItem() {
        gcxmAction.clickCreatItem();
    }
}
