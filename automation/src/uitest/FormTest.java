import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        //write your code here

        driver.get("https://automationexercise.com/contact_us");
        WebElement nameInput = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(2) > input"));
        nameInput.sendKeys("Name");

        WebElement emailInput = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(3) > input"));
        emailInput.sendKeys("test@test.com");

        WebElement subjectInput = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(4) > input"));
        subjectInput.sendKeys("Test");

        WebElement messageInput = driver.findElement(By.cssSelector("#message"));
        messageInput.sendKeys("Please help");

        WebElement submitButton = driver.findElement(By.cssSelector("#contact-us-form > div:nth-child(7) > input"));
        submitButton.click();

        Alert alert = driver.switchTo().alert();
        String alertMessage= alert.getText();
        System.out.println(alertMessage);
        alert.accept();

        WebElement successMessage = driver.findElement((By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success")));

        Assert.assertEquals("Success! Your details have been submitted successfully.", successMessage.getText());
    }
}
