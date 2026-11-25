import java.util.Scanner;

/**
 * * Pattern :--
 *                ! a a a a 
 *                ! B B B B 
 *                ! c c c c 
 *                ! D D D D
 *
 */

public class AlphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows:-- ");
        int num = sc.nextInt();
        printAlpha(num);
        sc.close();
    }

    public static void printAlpha(int rownum) {
        int small = 97;
        int large = 65;
        for (int i = 1; i <= rownum; i++) {
            if (i % 2 != 0) {
                for (int idx = 0; idx < rownum; idx++) {
                    System.out.print((char) small + " ");
                }
            } else {
                for (int idx = 0; idx < rownum; idx++) {
                    System.out.print((char) large + " ");
                }
            }
            large += 1;
            small += 1;
            System.out.println(" ");
        }
    }
}
