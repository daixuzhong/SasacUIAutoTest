package cn.sasac.business.ticketGroup.module;

import cn.sasac.action.ticketGroup.module.ProjectSigningAction;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: ProjectSigningBusiness
 * @description: TODO
 * @date 2019/7/1
 */
public class ProjectSigningBusiness {

    private ProjectSigningAction projectSigningAction;

    public ProjectSigningBusiness(WebDriver driver) {
        projectSigningAction = new ProjectSigningAction(driver);
    }

    /**
     * 填写立项单
     */
    public void writeProjectSigning() {
        //选择历史项目0否1是
        projectSigningAction.chooseHistory(1);
        //输入项目标题
        projectSigningAction.sendTitle("ceshiyixia");
    }

}
