package cn.sasac.action.ticketGroup.module;

import cn.sasac.page.ticketGroup.module.ProjectSigningPage;
import cn.sasac.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author daixuzhong
 * @title: ProjectSigningAction
 * @description: TODO
 * @date 2019/7/1
 */
public class ProjectSigningAction {

    private ProjectSigningPage projectSigningPage;

    public ProjectSigningAction(WebDriver driver) {
        projectSigningPage = new ProjectSigningPage(driver);
    }

    /**
     * 选择是否历史项目 0否1是
     * @param i
     */
    public void chooseHistory(int i) {
        Select select = new Select(projectSigningPage.getHistoryProject());
        //0否1是
        if (i == 0) {
            select.selectByVisibleText(Constants.NO);
        }else {
            select.selectByVisibleText(Constants.YES);
        }
    }

    /**
     * 输入项目标题
     * @param title
     */
    public void sendTitle(String title) {
        projectSigningPage.sendKey(projectSigningPage.getTitle(), title);
    }

}
