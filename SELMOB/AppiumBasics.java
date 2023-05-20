package SELMOB;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AppiumBasics extends BaseTest {

    @Test
    public void WifiSettingsName()  {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
       String alertTittle= driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTittle,"WiFi settings");
       driver.findElement(By.id("android:id/edit")).sendKeys("NON");
        driver.findElement(By.id("android:id/button1")).click();




    }
}



























