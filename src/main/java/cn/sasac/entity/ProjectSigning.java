package cn.sasac.entity;

/**
 * @author daixuzhong
 * @title: ProjectSigning
 * @description: TODO
 * @date 2019/7/2
 */
public class ProjectSigning {

    //公司主体
    private String crop;

    //前期项目经理
    private String refItem3;

    //施工项目经理
    private String refItem4;

    //是否历史项目0否1是
    private int isHistoryProject;

    //项目名称
    private String title;

    //项目类型
    private String refItem1;

    //资金来源
    private String field01;

    //项目简述及必要性陈述
    private String subject;

    //计划开始时间，直接输入值，格式：2019-07-18
    private String beginTime;

    //计划结束时间，直接输入值，格式：2019-07-18
    private String endTime;

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getRefItem3() {
        return refItem3;
    }

    public void setRefItem3(String refItem3) {
        this.refItem3 = refItem3;
    }

    public String getRefItem4() {
        return refItem4;
    }

    public void setRefItem4(String refItem4) {
        this.refItem4 = refItem4;
    }

    public int getIsHistoryProject() {
        return isHistoryProject;
    }

    public void setIsHistoryProject(int isHistoryProject) {
        this.isHistoryProject = isHistoryProject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRefItem1() {
        return refItem1;
    }

    public void setRefItem1(String refItem1) {
        this.refItem1 = refItem1;
    }

    public String getField01() {
        return field01;
    }

    public void setField01(String field01) {
        this.field01 = field01;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
