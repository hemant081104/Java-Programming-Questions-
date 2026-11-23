import java.util.Scanner;

/**
 * * Pattern :--                        
 *              ! A B C D                 a b c d
 *              ! A B C D                 a b c d 
 *              ! A B C D                 a b c d 
 *              ! A B C D                 a b c d                                
 * 
 */

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows:-- ");
        int num = sc.nextInt();
        System.out.println("You want Capital Letter or Small Letter");
        System.out.print("For Capital type C and for Small type S:--- ");
        char letter = sc.next().charAt(0);
        int convertedLetter = (int) letter;
        if (convertedLetter >= 65 && convertedLetter < 97) {
            printCapitalAlpha(num);
        } else {
            printSmallAlpha(num);
        }
        sc.close();
    }

    public static void printCapitalAlpha(int rowAlpha) {
        for (int i = 1; i <= rowAlpha; i++) {
            for (int idx = 65; idx <= 65 + rowAlpha-1; idx++) {
                System.out.print(" " + ((char) idx));
            }
            System.out.println(" ");
        }
    }

    public static void printSmallAlpha(int rowAlpha) {
        for (int i = 1; i <= rowAlpha; i++) {
            for (int idx = 97; idx <= 97 + rowAlpha-1; idx++) {
                System.out.print(" " + ((char) idx));
            }
            System.out.println(" ");
        }
    }
    
}
