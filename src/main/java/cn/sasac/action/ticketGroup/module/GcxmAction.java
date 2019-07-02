package cn.sasac.action.ticketGroup.module;

import cn.sasac.page.ticketGroup.module.GcxmPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author daixuzhong
 * @title: GcxmAction
 * @description: TODO
 * @date 2019/7/1
 */
public class GcxmAction {

    private GcxmPage gcxmPage;

    public GcxmAction(WebDriver driver) {
        gcxmPage = new GcxmPage(driver);
    }

    /**
     * 获取iframe
     */
    public WebElement getIframe() {
        return gcxmPage.getIframe();
    }

    /**
     * 点击立项
     */
    public void clickCreatItem() {
        gcxmPage.click(gcxmPage.getCreateItem());
    }



}
