
import java.util.Scanner;

/**
 * * Pattern:-
 *             ! *
 *             ! * *
 *             ! * * *
 *             ! * * * *
 *
 */
class Right_Half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Star you want to print:-- ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
};
