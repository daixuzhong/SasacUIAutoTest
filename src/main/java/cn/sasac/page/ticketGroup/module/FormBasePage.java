package cn.sasac.page.ticketGroup.module;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author daixuzhong
 * @title: FormBasePage
 * @description: 单据基类，一些通用的元素定位
 * @date 2019/7/2
 */
public class FormBasePage extends BasePage {

    public FormBasePage(WebDriver driver) {
        super(driver);
    }

    //提交按钮
    @FindBy(xpath = "//button[@ng-click=\"vm.submit()\"]")
    private WebElement submit;

    //保存按钮
    @FindBy(xpath = "//button[@ng-click=\"vm.saveAndEdit()\"]")
    private WebElement saveAndEdit;

    //流程图按钮
    @FindBy(xpath = "//button[@ng-click=\"vm.openFlowchart()\"]")
    private WebElement openFlowchart;


    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getSaveAndEdit() {
        return saveAndEdit;
    }

    public WebElement getOpenFlowchart() {
        return openFlowchart;
    }
}
