package OfficeHourss.Practice_03_23_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = "";

        if(wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()){
            biggestWordWithA = wordOne;
        }
        if(wordOne.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;

        }
        if(wordOne.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }
        if(biggestWordWithA.isEmpty()){
            System.out.println("No words contained A");
        }else{

        }
        System.out.println("Longest word with A: " + biggestWordWithA);
        }
}
