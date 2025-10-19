package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("otwieram przeglądarkę Chrom");

    }

    @Override
    public void findElementBy() {
        System.out.println("znajduję element ");

    }
}
