package day_34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("-----Starting ETSY search smoke tests-----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy smoke test complete--");

    }

    public static void openBrowser() {
        System.out.println("1. Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("2. Navigating to https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("3. Verify Etsy home page is displayed");
        System.out.println("4. Type 'Wooden Spoon' in search field and click search" );
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("5. Pass: Search results successfully passed " );
    }

}
