package ATB8xVrushabh.tests.PageObjectModel;

import ATB8xVrushabh.base.CommonToAllTest;
import ATB8xVrushabh.driver.DriverManager;
import ATB8xVrushabh.page.LoginPage_SwagLabs;
import ATB8xVrushabh.utils.PropertyReader;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SwagLabsPOM_Test extends CommonToAllTest {


    @Description("Verify that invalid login shows error message")
    @Test
    public void test_invalid_login_swag_labs(){

        LoginPage_SwagLabs loginPageSwagLabs = new LoginPage_SwagLabs(DriverManager.getDriver());
        String errormessage = loginPageSwagLabs.login_invalid_swag_labs(PropertyReader.readKey("invalid_username"), PropertyReader.readKey("invalid_password"));

        assertThat(errormessage).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(errormessage, PropertyReader.readKey("error_message"));
    }

    @Description("Verify that dashboard page should show with login inputs")
    @Test
    public void test_valid_login_swag_labs(){

        LoginPage_SwagLabs labs = new LoginPage_SwagLabs(DriverManager.getDriver());
        labs.login_valid_swag_labs(PropertyReader.readKey("username"), PropertyReader.readKey("password"));




    }



}
