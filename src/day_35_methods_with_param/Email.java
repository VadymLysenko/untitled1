package day_35_methods_with_param;

import java.util.Locale;

public class Email {

    public static void main(String[] args) {
        buildEmail("VL", "hotmail");
        buildEmail("Myshketior", "google");
        buildEmail("John Ward II", "verizon");
    }
    public static void buildEmail(String name, String domain){
        String email = name.toLowerCase().replace(" ","_") + "@" + domain + ".com";
        domain = domain.toLowerCase(Locale.ROOT);
        System.out.println(email);
    }
}
