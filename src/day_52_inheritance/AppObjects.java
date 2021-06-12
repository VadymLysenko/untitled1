package day_52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(5.3);
        instagram.useTheApp(20);
        instagram.download();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.setVersion(6.234);
        discord.useTheApp(90);
        discord.download();
        System.out.println(discord.getName());
    }
}
