package SELMOB;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;

public class Practice {
    @Test
    public void PracticeDemo() throws MalformedURLException , InterruptedException{

        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("RZ8N80Z86XT");
        options.setApp("D:\\TODO\\automation\\src\\main\\java\\resources\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));


        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='SINGLE CHOICE LIST']")).click();
        Thread.sleep(2000);
      driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Traffic']")).click();
driver.findElement(By.id("android:id/button1")).click();

driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
driver.findElement(By.xpath("//android.widget.EditText[1]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[1]")).sendKeys("eilomilo");

        driver.findElement(By.id("io.appium.android.apis:id/password_edit")).click();
        driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("makiuoknksjk");

        driver.findElement(By.id("android:id/button1")).click();










    }
}