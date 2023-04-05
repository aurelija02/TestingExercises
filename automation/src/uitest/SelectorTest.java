import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {
        //write your code here
        WebElement signInElement = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"));
        Assert.assertEquals("Signup / Login", signInElement.getText());
    }

    @Test
    public void verifyLastProductPrice() {
        WebElement signInElement = driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(36) > div > div.single-products > div.productinfo.text-center > h2"));
        Assert.assertEquals("Rs. 1389", signInElement.getText());
    }
    @Test
    public void verifyLastProductPriceWithList() {
        List<WebElement> list = driver.findElements(By.cssSelector(".col-sm-4"));
        for (WebElement element : list) {
            if (true){}
        }

//        Assert.assertEquals("Rs. 1389", signInElement.getText());
    }

    @Test
    public void verifyContactEmail() {
        driver.get("https://automationexercise.com/contact_us");
        WebElement contactEmailElement = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[2]/div/address/p[2]/a/u"));
        Assert.assertEquals("feedback@automationexercise.com", contactEmailElement.getText());


    }


}
