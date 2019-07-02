package cn.sasac.base;

import cn.sasac.utils.SelectDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * @author daixuzhong
 * @title: BaseCase
 * @description: TODO
 * @date 2019/7/1
 */
public class BaseCase {

    public static WebDriver initDriver(String browserName) {
        WebDriver driver = SelectDriverUtil.driverName(browserName);
        driver.manage().window().maximize();
        return driver;
    }

    public void login(String name, String password, boolean rememberMe) {

    }

}
