
import java.util.Scanner;

/**
 * * Pattern:-
 *             ! * * * *
 *             ! * * *
 *             ! * * 
 *             ! * 
 */
class Reverse_Right_Half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Star you want to print:-- ");
        int num = sc.nextInt();
        int num2 = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            num2-- ;
        }
        sc.close();
       
    }
}