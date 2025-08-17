public class AppChecker {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Kalkulator");
        android.iAndroidInfo();
        android.appInfo();

        IPhoneApp iphone = new IPhoneApp("Kalkulator");
        iphone.iPhoneInfo();
        iphone.appInfo();
    }
}
