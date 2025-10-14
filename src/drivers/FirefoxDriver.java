package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("otwieram przeglądarkę firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajduję element");
    }
}
