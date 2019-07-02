package cn.sasac.page.ticketGroup;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author daixuzhong
 * @title: MyTicketPage
 * @description: 管控执行home页（默认为我的工作-我的工作页），展示所有可以创建的单据
 * @date 2019/7/1
 */
public class MyTicketPage extends BasePage {

    public MyTicketPage(WebDriver driver) {
        super(driver);
    }

    //工程项目
    @FindBy(xpath = "//a[text()=\"工程项目\"]")
    private WebElement gcxm;

    public WebElement getGcxm() {
        return gcxm;
    }
}
