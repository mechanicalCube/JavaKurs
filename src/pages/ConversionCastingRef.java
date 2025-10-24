package pages;

import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCastingRef {
    public static void main(String[] args) {

        int a = 2;
        double b = 3.3d;
        double c = b/a;
         int d = (int)b/a;

        //WebDriver driver = new (FirefoxDriver)driver;
    }
}
