package daily_questions;
import java.util.Scanner;
public class CurrencyChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        float  mul = (float)(a / 84.37);
        System.out.println("The Currency in the USD is : " + mul );
    }
}
