package drivers;

public class WebDriverTest2 {


    public static void main(String[] args) {

        DriverType[] driverTypes = DriverType.values();
        for (int i=0; i<driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getDriver(DriverType.FIREFOX);
        driver.get();
        driver.findElementBy();
    }


    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        } else if (type.name.equals("firefox")) {
            System.out.println(type.path);
            return new FirefoxDriver();
        }
        return null;
    }
}



