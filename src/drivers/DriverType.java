package drivers;

public enum DriverType {
    CHROME("chrome", "/src/chormedriver.exe"),
    FIREFOX("firefox", "/src/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path){
        this.name = name;
        this.path = path;
    }
}
