package day_38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        printNum(0);
        start();
        continues();
        end();

    }
    public static void printNum(int num){
        System.out.print(num);
        num++;
        if(num <= 100){
            printNum(num);

        }
    }
    public static void start(){
        System.out.println("Start");
        continues();
    }
    public static void continues(){
        System.out.println("continues");
        end();
    }
    public static void end(){
        System.out.println("end");
    }



}
