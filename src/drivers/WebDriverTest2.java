package drivers;

public class WebDriverTest2 {

    public static void main(String[] args) {
        WebDriver driver = getDriver( "chrome33");
        driver.get();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw  new NoValidBrowserName("no valid brower name");
    }
}



