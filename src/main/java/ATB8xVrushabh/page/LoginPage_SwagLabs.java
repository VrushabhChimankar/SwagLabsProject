package ATB8xVrushabh.page;

import ATB8xVrushabh.base.CommonToAllPage;
import ATB8xVrushabh.driver.DriverManager;
import ATB8xVrushabh.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;

public class LoginPage_SwagLabs extends CommonToAllPage {

    WebDriver driver;
    //create constructor
    public LoginPage_SwagLabs(WebDriver driver){
        this.driver = driver;

    }

    //page locators
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By login_button = By.id("login-button");
    private By error_message = By.xpath("//h3[@data-test='error']");

    //page actions

    public String login_invalid_swag_labs(String user, String pass){

        driver.get(PropertyReader.readKey("url"));
        enterInput(username, user);
        enterInput(password, pass);
        clickElement(login_button);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String message = driver.findElement(error_message).getText();

        return message;

    }

    public void login_valid_swag_labs(String user, String pass){

        driver.get(PropertyReader.readKey("url"));
        enterInput(username, user);
        enterInput(password, pass);
        clickElement(login_button);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
