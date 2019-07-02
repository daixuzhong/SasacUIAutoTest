package cn.sasac.page.ticketGroup.module;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author daixuzhong
 * @title: GcxmPage
 * @description: 工程项目页面(默认处于工程项目-住宅项目tab)
 * @date 2019/7/1
 */
public class GcxmPage extends BasePage {

    public GcxmPage(WebDriver driver) {
        super(driver);
    }

    //iframe
    @FindBy(xpath = "//iframe[@frameborder=\"0\"]")
    private WebElement iframe;

    //======================================右上角5个按钮组========================================
    //立项
    @FindBy(xpath = "//button[@action-name=\"createItem\"]")
    private WebElement createItem;

    //批概
    @FindBy(xpath = "//button[@action-name=\"Estimate\"]")
    private WebElement estimate;

    //调概
    @FindBy(xpath = "//button[@action-name=\"Change\"]")
    private WebElement change;

    //竣工
    @FindBy(xpath = "//button[@action-name=\"End\"]")
    private WebElement end;

    //签约
    @FindBy(xpath = "//button[@action-name=\"Sining\"]")
    private WebElement sining;


    //======================================工程项目下的tab========================================
    //住宅项目
    @FindBy(xpath = "//button[contains(text(),\"住宅项目\")]")
    private WebElement zzxm;

    //商办项目
    @FindBy(xpath = "//button[contains(text(),\"商办项目\")]")
    private WebElement sbxm;

    //市政工程
    @FindBy(xpath = "//button[contains(text(),\"市政工程\")]")
    private WebElement szgc;

    //绿化项目
    @FindBy(xpath = "//button[contains(text(),\"绿化项目\")]")
    private WebElement lhxm;

    //道路工程
    @FindBy(xpath = "//button[contains(text(),\"道路工程\")]")
    private WebElement dlgc;


    public WebElement getCreateItem() {
        return createItem;
    }

    public WebElement getEstimate() {
        return estimate;
    }

    public WebElement getChange() {
        return change;
    }

    public WebElement getEnd() {
        return end;
    }

    public WebElement getSining() {
        return sining;
    }

    public WebElement getZzxm() {
        return zzxm;
    }

    public WebElement getSbxm() {
        return sbxm;
    }

    public WebElement getSzgc() {
        return szgc;
    }

    public WebElement getLhxm() {
        return lhxm;
    }

    public WebElement getDlgc() {
        return dlgc;
    }

    public WebElement getIframe() {
        return iframe;
    }
}
