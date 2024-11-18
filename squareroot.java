import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        double  d = Math.sqrt(n);
        int x = (int)(d);
        if(d == x){
            System.out.println(d);
        }
        else{
            System.out.println("it is not a perfect square");
        }
        
    }
       
}
