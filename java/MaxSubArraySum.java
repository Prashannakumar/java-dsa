import java.lang.Math;

public class MaxSubArraySum {

   static int maxSubArraySum(int[] arr){
       int res = arr[0];

       // Outer loop for starting point of subarray
       for(int i = 0; i < arr.length; i++) {
           int currSum = 0;
            // innner loop for ending point of subarray
           for(int j = i; j < arr.length; j++){
               currSum += arr[j];

               res = Math.max(res, currSum);
           }
       }
       return res;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(arr));
    }
}