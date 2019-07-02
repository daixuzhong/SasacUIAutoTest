package cn.sasac.utils;

/**
 * @author daixuzhong
 * @title: Constants
 * @description: 常用常量
 * @date 2019/7/9
 */
public class Constants {

    /**
     * 浏览器
     */
    public enum browser {
        IE("ie"), CHROME("chrome"), FIRFOX("fireFox")

        ;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        private String text;

        private browser(String text) {
            this.text=text;
        }

    }

    /**
     * 数字
     */
    public enum Numbers {
        ZERO(0),ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),
        EIGHT(8),NINE(9),TEN(10)
        ;

               public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        private int code;

        private Numbers(int code) {
            this.code = code;
        }
    }

    /**
     * 状态
     */
    public enum Status {

        SUCCESS("成功"), FAIL("失败"),
        FINISHED("已完成"),UN_FINISHED("未处理"),
        SUBMITTED("已提交"),UN_SUBMITTED("未提交")
        ;
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        private String text;

        private Status(String text) {
            this.text=text;
        }
    }

    /**
     * 按钮组
     */
    public enum Buttons {

        EDIT("编辑"),SUBMIT("提交"),SAVE("保存"),
        APPROVE("审批"),ENTRUST("委托"),CONSULT("征询"),RETURN_BACK("退回"),CLOSE("关闭"),
        CONFIRM("确认"),CANCEL("取消"), XCLOSE("×"), ENSURE("确定")
        ;
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        private String text;

        private Buttons(String text) {
            this.text=text;
        }
    }

    //===========================判断是否=============================
    public static final String YES = "是";
    public static final String NO = "否";





}
