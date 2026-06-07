import java.lang.Math;

/**
 * Time Complexity: O(N*K) - Two nested loops where outer loop runs N-K+1 times and inner loop runs K times
 * Space Complexity: O(1) - Only a few variables used for tracking sums and results
 */
public class MaxSum{

    // returns maximum sum in a subarray of size k
    static int maxSum(int arr[], int k){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i < n-k+1; i++){
            int currentSum = 0;

            for(int j=0; j < k; j++)
                currentSum += arr[i+j];
//            for(int j=i; j < i+k; j++ )
//                currentSum = currentSum + arr[j];

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        int arr[] = {5, 2, -1, 0, 3};
        System.out.println(maxSum(arr, 3));
    }
}