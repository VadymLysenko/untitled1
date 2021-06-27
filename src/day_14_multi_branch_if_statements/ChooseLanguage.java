package day_14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language ");
        int selection = 2;
        if (selection ==1){
            System.out.println("Hello thank you for your call");
        }else if(selection == 2){
            System.out.println("Hola, graciaas para llama");
        }else if(selection == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(selection == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (selection == 5){
            System.out.println("Merci, pour vorte appel");
        }else {
            System.out.println("let's talk java in english, hello");
        }



    }
}
