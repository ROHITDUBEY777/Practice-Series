package daily_questions;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr = {23, 4, 0, -12, 6, 99};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}
