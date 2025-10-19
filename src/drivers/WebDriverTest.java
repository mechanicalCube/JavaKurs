package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chrom = new ChromeDriver();
        chrom.get();
        chrom.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}
