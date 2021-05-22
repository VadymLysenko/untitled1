package day_24_loops;

public class WhileDoForLoopsComparison {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(i<=10);

        for(int sum=0; sum <= 10; sum++){
            System.out.println(sum);
        }
    }
}
