package day_19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }
        String word = "uk";
        String uWord = word.toUpperCase();

        if(word.equals(uWord)){

        }else{
            System.out.println("print caseMatch");
        }

        System.out.println(word);
        System.out.println(uWord);
    }
}
