import java.lang.Math;

public class SlidingWindow {

    static int maxSum(int arr[], int k){
        int n = arr.length;

        // Edge: if k is invalid
        if(k <= 0 || k > n){
            throw new IllegalArgumentException("Invalid k");
        }

        // Compute sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window from [0, k) to [1, k+1), [2, k+2),..
        for(int i = k; i < n; i++){
            // Remove the leftmost element of old window and add the new right element
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {5, 2, -1, 0, 3};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}