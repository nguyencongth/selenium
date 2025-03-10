import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main(String[] args){
        /*
        String chromeTitle = chromeTest("https://www.google.com/");
        System.out.println(chromeTitle);

        String firefoxTitle = firefoxTest("https://www.facebook.com/");
        System.out.println(firefoxTitle);

         */
        WebDriver driver = new ChromeDriver();
        findLoginPageElements(driver);
        driver.quit();
    }

    private static void findExceptionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
    }

    private static void findLoginPageElements(WebDriver driver) {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        // WebElement locator will be added here
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("TestUser");
        //WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));
        //WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("input[id='username']"));

        WebElement passwordInputField = driver.findElement(By.name("password"));
        passwordInputField.sendKeys("TestPassword");
        //WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@name='password']"));
        //WebElement passwordInputFieldCss = driver.findElement(By.cssSelector("input[name='password']"));

        WebElement submitButton = driver.findElement(By.className("btn"));
        submitButton.isDisplayed();
        submitButton.click();
        //WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id='submit']"));
        //WebElement submitButtonCss = driver.findElement(By.cssSelector("button[id='submit']"));

        /*List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Test Automation"));

        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));*/


    }

    private static String chromeTest(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

    private static String firefoxTest(String url) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}
