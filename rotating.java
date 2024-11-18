import java.util.Arrays;
import java.util.Scanner;
public class rotating {
    public static void main(String[] args) {
      int [] arr ={1,2,3,4,5};
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the K value:");
      int k =in.nextInt();
      for(int i=0;i<k;i++){
        int temp = arr[arr.length-1];
        for(int j=arr.length-1;j>0;j--){
          arr[j] = arr[j-1];
        }
        arr[0] = temp;

      }
      System.out.println(Arrays.toString(arr));
       
      
    }

}
