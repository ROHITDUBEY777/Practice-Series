package daily_questions;
// this is a code to check for prime numbers within  a sepcific range
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int LL = in.nextInt();
        System.out.println("ENter the second number ");
       int UL = in.nextInt();
       in.close();
        for(int i=LL;i<=UL;i++){
        if(checkPrimeNumber(i) == true){
            System.out.println(i + " ");
        }
      }
    }
    static boolean checkPrimeNumber(int x)
    { 
        if(x==0 || x ==1){
            System.out.println("false");
        }
        for(int i=2;i<x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
       
      }
    
}

