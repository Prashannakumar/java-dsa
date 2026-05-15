import java.lang.Math;

public class KadanesAlgorithm {

    static int maxSubarraySum(int[] arr){

        // Stores the result (maximum sum found so far)
        int res = arr[0];

        // Maximum sum of subarray ending at current position
        int maxEnding = res;

        for (int i = 0; i < arr.length; i++){
            // Either extend previous subarray or start new from current element
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            // Update the result if new subarray sum is larger
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}