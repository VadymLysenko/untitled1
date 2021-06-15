package OfficeHourss.Practice_06_15_2021;

public class EmailObjects {

    public static void main(String[] args) {

        Email email = new Email("vesioluy@hotmail.com",43);
        // email.ADDRESS = "email"; -> ADDRESS is final, so cannot be changed
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail = new Gmail("Vadym@gmail.com", 133);
        System.out.println(gmail);
        System.out.println(Gmail.domain);
    }
}
