package cn.sasac.business.ticketGroup.module;

import cn.sasac.action.ticketGroup.module.ProjectSigningAction;
import cn.sasac.entity.ProjectSigning;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
     * @param entity
     * @throws InterruptedException
     */
    public void writeProjectSigning(ProjectSigning entity) throws InterruptedException, AWTException {
        //选择公司主体
        projectSigningAction.chooseCrop(entity.getCrop());
        Thread.sleep(1000);
        //选择前期项目经理
        projectSigningAction.chooseRefItem3(entity.getRefItem3());
        Thread.sleep(1000);
        //选择历史项目0否1是
        projectSigningAction.chooseHistory(entity.getIsHistoryProject());
        Thread.sleep(1000);
        //输入项目标题
        projectSigningAction.sendTitle(entity.getTitle());
        Thread.sleep(1000);
        //选择项目类型
        projectSigningAction.chooseRefItem1(entity.getRefItem1());
        Thread.sleep(1000);
        //选择资金来源
        projectSigningAction.chooseField01(entity.getField01());
        Thread.sleep(1000);
        //输入项目简述及必要性陈述
        projectSigningAction.sendSubject(entity.getSubject());
        Thread.sleep(5000);
        //点击上传附件按钮
        projectSigningAction.clickUploading();
        Thread.sleep(1000);
        //上传附件
        uploadingFiles();
        Thread.sleep(2000);

        //选择计划开始时间
        projectSigningAction.chooseBeginTime(entity.getBeginTime());
        Thread.sleep(1000);
        //选择计划结束时间
        projectSigningAction.chooseEndTime(entity.getEndTime());
        Thread.sleep(1000);
        //点击提交
        projectSigningAction.submit();
    }

    private void uploadingFiles() throws InterruptedException, AWTException {
        // 指定附件的路径
        StringSelection sel = new StringSelection("\"D:\\Future\\TestFiles\\附件测试数据.doc\" \"D:\\Future\\TestFiles\\附件测试数据.xlsx\" \"D:\\Future\\TestFiles\\Picture.png\"");

        // 把图片文件路径复制到剪贴板
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
        System.out.println("selection" +sel);

        // 新建一个Robot类的对象
        Robot robot = new Robot();
        Thread.sleep(1000);

        // 按下 CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // 释放 CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);

        // 点击回车 Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

}
