public class AppChecker {
    public static void main(String[] args) {
        AppAndroid android = new AppAndroid("CobotANDRID");
        android.appInfo();
        android.runAndroidUp();

        AppIphone iphone = new AppIphone("CobotIOS");
        iphone.appInfo();
        iphone.runAndroidUp();
    }
}

