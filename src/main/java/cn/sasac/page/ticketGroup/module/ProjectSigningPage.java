package cn.sasac.page.ticketGroup.module;

import cn.sasac.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.cert.X509Certificate;

/**
 * @author daixuzhong
 * @title: CreatItemPage
 * @description: 工程项目立项
 * @date 2019/7/1
 */
public class ProjectSigningPage extends FormBasePage {

    public ProjectSigningPage(WebDriver driver) {
        super(driver);
    }

    /**
     * 公司主体相关
     * 这类搜索框的操作流程：点击→输入值→选择结果
     * 所以需要3个元素才能完成这个操作
     */
    //公司主体
    @FindBy(xpath = "//div[@name=\"corp\"]/div/span")
    private WebElement crop;

    //公司主体输入框
    @FindBy(xpath = "//div[@name=\"corp\"]/input[1]")
    private WebElement cropInput;

    //公司主体查询结果
    @FindBy(xpath = "//div[@name=\"corp\"]/ul/li/div[3]/a[1]")
    private WebElement cropRes;

    //前期项目经理
    @FindBy(xpath = "//div[@name=\"refItem3\"]/div/span")
    private WebElement refItem3;

    //前期项目经理输入框
    @FindBy(xpath = "//div[@name=\"refItem3\"]/input[1]")
    private WebElement refItem3Input;

    //前期项目经理查询结果
    @FindBy(xpath = "//div[@name=\"refItem3\"]/ul/li/div[3]/a[1]")
    private WebElement refItem3Res;

    //施工项目经理
    @FindBy(xpath = "//div[@name=\"refItem4\"]/div/span")
    private WebElement refItem4;

    //施工项目经理输入框
    @FindBy(xpath = "//div[@name=\"refItem4\"]/input[1]")
    private WebElement refItem4Input;

    //施工项目经理查询结果
    @FindBy(xpath = "//div[@name=\"refItem4\"]/ul/li/div[3]/a[1]")
    private WebElement refItem4Res;


    //是否历史项目
    @FindBy(name = "field02")
    private WebElement historyProject;

    //项目名称
    @FindBy(name = "title")
    private WebElement title;

    //项目类型
    @FindBy(xpath = "//div[@name=\"refItem1\"]/div/span")
    private WebElement refItem1;

    //项目类型输入框
    @FindBy(xpath = "//div[@name=\"refItem1\"]/input[1]")
    private WebElement refItem1Input;

    //项目类型查询结果
    @FindBy(xpath = "//div[@name=\"refItem1\"]/ul/li/div[3]/a[1]")
    private WebElement refItem1Res;

    //资金来源
    @FindBy(xpath = "//div[@name=\"field01\"]/div/span")
    private WebElement field01;

    //资金来源输入框
    @FindBy(xpath = "//div[@name=\"field01\"]/input[1]")
    private WebElement field01Input;

    //资金来源查询结果
    @FindBy(xpath = "//div[@name=\"field01\"]/ul/li/div[3]/a[1]")
    private WebElement field01Res;

    //项目简述及必要性陈述
    @FindBy(xpath = "//textarea[@name=\"subject\"]")
    private WebElement subject;

    //上传按钮
    @FindBy(xpath = "//a[text()=\"上传\"]")
    private WebElement uploadingBtn;

    //计划开始时间，直接输入值，格式：2019-07-18
    @FindBy(xpath = "//td[@field=\"beginTime\"]/descendant::input")
    private WebElement beginTime;

    //计划结束时间，直接输入值，格式：2019-07-18
    @FindBy(xpath = "//td[@field=\"endTime\"]/descendant::input")
    private WebElement endTime;

    public WebElement getCrop() {
        return crop;
    }

    public WebElement getCropInput() {
        return cropInput;
    }

    public WebElement getCropRes() {
        return cropRes;
    }

    public WebElement getRefItem3() {
        return refItem3;
    }

    public WebElement getRefItem3Input() {
        return refItem3Input;
    }

    public WebElement getRefItem3Res() {
        return refItem3Res;
    }

    public WebElement getRefItem4() {
        return refItem4;
    }

    public WebElement getRefItem4Input() {
        return refItem4Input;
    }

    public WebElement getRefItem4Res() {
        return refItem4Res;
    }

    public WebElement getRefItem1() {
        return refItem1;
    }

    public WebElement getRefItem1Input() {
        return refItem1Input;
    }

    public WebElement getRefItem1Res() {
        return refItem1Res;
    }

    public WebElement getField01() {
        return field01;
    }

    public WebElement getField01Input() {
        return field01Input;
    }

    public WebElement getField01Res() {
        return field01Res;
    }

    public WebElement getSubject() {
        return subject;
    }

    public WebElement getBeginTime() {
        return beginTime;
    }

    public WebElement getEndTime() {
        return endTime;
    }

    public WebElement getUploadingBtn() {
        return uploadingBtn;
    }

    public WebElement getHistoryProject() {
        return historyProject;
    }

    public WebElement getTitle() {
        return title;
    }
}
