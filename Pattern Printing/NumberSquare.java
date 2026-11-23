
import java.util.Scanner;

/**
 * * Pattern :-- 
 *                ! 1 2 3 4
 *                ! 1 2 3 4
 *                ! 1 2 3 4
 *                ! 1 2 3 4

  **/
public class NumberSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows:-- ");
        int num = sc.nextInt();
        printStar(num);
        sc.close();
    }

    public static void printStar(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            for (int idx = 1; idx <= rowNum; idx++) {
                System.out.print(" "+idx);
            }
            System.out.println(" ");
        }

    }

}
