

public class sorting {
    public static void main(String[] args) {
        int [] arr  = {1,2,2,1,3,5,4};
        int n = arr.length;
        int i=0,j=0;
        for (i=0;i<n-1;i++){
          for(j=0;j<n-1-i;j++){
            int temp;
            if(arr[j]>arr[j+1]){
              temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          
           
          }
       
        
    }
    System.out.println("The sorted array is :");
    for(int num:arr){
      System.out.println(num +" ");
    }
  
    
  }
  
}
