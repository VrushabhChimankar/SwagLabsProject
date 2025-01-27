package ATB8xVrushabh.base;

import ATB8xVrushabh.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;

import static ATB8xVrushabh.driver.DriverManager.driver;
import static ATB8xVrushabh.driver.DriverManager.getDriver;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.init();
    }
    @AfterMethod
    public void tearDown(){
        DriverManager.tearDown();
    }


}
