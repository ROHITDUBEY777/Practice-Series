
public class ReverseArray{
    
    static void change(int []arr){
       
      
        int n = arr.length;
        int [] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {

        int [] arr = {1,4,3,2,6,5};
        int n =arr.length;
        change(arr);
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+"");
        }
    }
}
