package day_52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Youtube";
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.useTheApp(20);
    }
}
