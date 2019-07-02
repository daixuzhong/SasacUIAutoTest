package cn.sasac.page.ticketGroup.module;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @author daixuzhong
 * @title: CreatItemPage
 * @description: 工程项目立项
 * @date 2019/7/1
 */
public class ProjectSigningPage extends BasePage {

    public ProjectSigningPage(WebDriver driver) {
        super(driver);
    }

    //是否历史项目
    @FindBy(name = "field02")
    private WebElement historyProject;

    //项目名称
    @FindBy(name = "title")
    private WebElement title;

    public WebElement getHistoryProject() {
        return historyProject;
    }

    public WebElement getTitle() {
        return title;
    }
}
