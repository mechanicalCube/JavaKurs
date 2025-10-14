package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChormeDriver chrom = new ChormeDriver();
        chrom.get();
        chrom.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}
