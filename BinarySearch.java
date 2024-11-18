import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int i=0,n=5;
    
     System.out.println("Enter the array values ");
   
     int [] arr = new int[n];
     for(i=0;i<n;i++){
      arr[i] = in.nextInt();
     }
     
     
 
     System.out.println("Enter the Element ");
     int ele = in.nextInt();
    
    
    int count=0;
     for(i=0;i<5;i++){
        if(ele == arr[i]){
            System.out.println(i); 
            break;
         
        }
        count++;
        }
        if(count==5){
            
                System.out.println( "Element not found");
                
        }
     }
    }   
        
    


       
     
   


   
    
    
    

