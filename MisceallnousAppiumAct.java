package SELMOB;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MisceallnousAppiumAct  extends BaseTest{
    @Test
    public void MisceallnousDemo(){
        Activity activity= new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        driver.startActivity(activity);
        //driver.findElement(AppiumBy.accessibilityId("Preference")).click();
       // driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(By.id("android:id/checkbox")).click();

        DeviceRotation landScape =new DeviceRotation(0,0,90);
        driver.rotate((landScape));
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTittle= driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTittle,"WiFi settings");

        driver.setClipboardText("NON");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }
}
