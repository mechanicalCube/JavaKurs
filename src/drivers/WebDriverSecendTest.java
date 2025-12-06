package drivers;

public class WebDriverSecendTest {
    public static void main(String[] args) {
        WebDriver chorme = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();


        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();


        WebDriver safari = new WebDriver(){
            @Override
            public void get() {
                System.out.println("Opening page with safari");

            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with safari");
            }
        };

        safari.get();
        safari.findElementBy();

    }
}
