package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStepdefs {
    WebDriver driver = Hooks.driver;
    private final String LOGINPAGE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private final String HOMEPAGE_URL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    @When("user is on login page")
    public void user_is_on_login_page() {
        driver.get(LOGINPAGE_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertEquals("user is not on the login screen",LOGINPAGE_URL,driver.getCurrentUrl());
    }
    @When("enters username and password")
    public void enters_username_and_password() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    }
    @When("clicks on submit")
    public void clicks_on_submit() {
        driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
    }
    @Then("user navigates to homepage")
    public void user_navigates_to_homepage() {
        wait.until(ExpectedConditions.urlToBe(HOMEPAGE_URL));
        Assert.assertEquals("User is not on home page", HOMEPAGE_URL,driver.getCurrentUrl());
    }
}

