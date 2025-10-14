package drivers;

public class ChormeDriver implements WebDriver{

    @Override
    public void get() {
        System.out.println("otwieram przeglądarkę chorm");

    }

    @Override
    public void findElementBy() {
        System.out.println("znajduję element ");

    }
}
