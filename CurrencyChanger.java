package daily_questions;
import java.util.Scanner;
public class CurrencyChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float a = sc.nextFloat();
        float  Div  =(float)(a / 84.37);
        System.out.println("The Currency in the USD is : " + Div );
        sc.close();
    }
}
