package day_25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start = scan.nextInt();
        System.out.println("Enter end number: ");
        int end = scan.nextInt();

        for(int i = start; i <= end; i++){
            if(start >end){
                System.out.println("Reverse numbering is nit supported ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
