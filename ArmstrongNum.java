import java.util.Scanner;

public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        System.out.println("is armstrong number "+ CheckArmstrong(n));
    }
    static boolean CheckArmstrong(int n ){
        int digits = 0,temp;
        temp = n;
        while(temp > 0){
            temp = temp / 10;
            digits++;
        }
        System.out.println("number of digits are"+" "+digits);
        temp = n;
        int sum = 0;
        while(temp > 0){
            int lastDigit = temp % 10;
            sum = (int)(sum + Math.pow(lastDigit, digits));
            temp = temp / 10;

        
        } 
        if(sum == n){
          return true;
        }
        else{
           return false;
        }
    }
}
    
