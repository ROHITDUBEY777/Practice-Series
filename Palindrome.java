// package javalab;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;
        int rev;
        int temp = num;
        while (num != 0) {
            rev = num % 10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }

   if (sum == temp) {
            System.out.println("it is an palindrome number");

        } else {
            System.out.println("it is not an palindrome number ");
        }
    }

}
