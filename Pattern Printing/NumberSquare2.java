import java.util.Scanner;

public class NumberSquare2 {
    /**
    * * Pattern :-- 
    *                ! 1 1 1 1             A A A A
    *                ! 2 2 2 2             B B B B
    *                ! 3 3 3 3             C C C C
    *                ! 4 4 4 4             D D D D
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows:-- ");
        int num = sc.nextInt();
        printNum(num);
        printAlpha(num);
        sc.close();
    }

    public static void printNum(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            for (int idx = 1; idx <= rowNum; idx++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
    public static void printAlpha(int rowNum) {
        for (int i = 65; i <= 65+rowNum-1; i++) {
            for (int idx = 1; idx <= rowNum; idx++) {
                System.out.print((char)i + " ");
            }
            System.out.println(" ");
        }
    }
}
