//package tests.sample;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileBy;
//
//import io.appium.java_client.android.AndroidDriver;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.List;
//
//public class AndroidSampleWithSelenium4Tests {
//    @Test
//    void searchTest() throws MalformedURLException, InterruptedException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        // Set your access credentials
//        caps.setCapability("browserstack.user", "tpuretest_lSVWc2");
//        caps.setCapability("browserstack.key", "Ggd5nW19cyeGseGGn2m6");
//
//        // Set URL of the application under test
//        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
//
//        // Specify device and os_version for testing
//        caps.setCapability("device", "Google Pixel 3");
//        caps.setCapability("os_version", "9.0");
//
//        // Set other BrowserStack capabilities
//        caps.setCapability("project", "First Java Project");
//        caps.setCapability("build", "browserstack-build-1");
//        caps.setCapability("name", "first_test");
//
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        AndroidDriver driver = new AndroidDriver(
//                new URL("http://hub.browserstack.com/wd/hub"), caps);
//
//        // Test case for the BrowserStack sample Android app.
//        // If you have uploaded your app, update the test case here.
//        WebElement searchElement = (WebElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(
//                        AppiumBy.accessibilityId("Search Wikipedia")));
//        searchElement.click();
//        WebElement insertTextElement = (WebElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(
//                        AppiumBy.id("org.wikipedia.alpha:id/search_src_text")));
//        insertTextElement.sendKeys("BrowserStack");
//        Thread.sleep(5000);
////        List<WebElement> allProductsName = driver.findElementsByClassName(
////                "android.widget.TextView");
////        assert(allProductsName.size() > 0);
//
//
//        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//        driver.quit();
//
//    }
//}