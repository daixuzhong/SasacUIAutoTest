package cn.sasac.action.ticketGroup.module;

import cn.sasac.page.ticketGroup.module.FormBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author daixuzhong
 * @title: FormBaseAction
 * @description: TODO
 * @date 2019/7/2
 */
public class FormBaseAction {

    private FormBasePage formBasePage;

    public FormBaseAction(WebDriver driver) {
        formBasePage = new FormBasePage(driver);
    }

    /**
     * 点击提交
     */
    public void submit() {
        formBasePage.click(formBasePage.getSubmit());
    }

    /**
     * 点击保存
     */
    public void saveAndEdit() {
        formBasePage.click(formBasePage.getSaveAndEdit());
    }

    /**
     * 点击流程图
     */
    public void openFlowchart() {
        formBasePage.click(formBasePage.getOpenFlowchart());
    }

}
