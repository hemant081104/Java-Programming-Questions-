
import java.util.Scanner;

public class oddSumTill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A number = ");
        int num = sc.nextInt();
        int result = oddSum(num);
        System.out.println(result);
        System.out.println("odd sum till " + num + " is " + result);
        sc.close();
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum;

    }
;
}
