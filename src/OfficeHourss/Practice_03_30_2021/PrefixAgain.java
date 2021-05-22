package OfficeHourss.Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;

        String prefix = str.substring(0,n);
        String remining = str.substring(n);
        System.out.println(remining.contains(prefix));



    }
}
