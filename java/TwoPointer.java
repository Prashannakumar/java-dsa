/**
 * traverse a data structure - such as an array, list, or string - either toward each other or in the same direction
 * When to Use Two Pointers:
 * Sorted Input : If the array or list is already sorted (or can be sorted), two pointers can efficiently find pairs or ranges. Example: Find two numbers in a sorted array that add up to a target.
 * Pairs or Subarrays : When the problem asks about two elements, subarrays, or ranges instead of working with single elements. Example: Longest substring without repeating characters, maximum consecutive ones, checking if a string is palindrome.
 * Sliding Window Problems : When you need to maintain a window of elements that grows/shrinks based on conditions. Example: Find smallest subarray with sum ≥ K, move all zeros to end while maintaining order.
 * Linked Lists (Slow–Fast pointers) : Detecting cycles, finding the middle node, or checking palindrome property. Example: Floyd’s Cycle Detection Algorithm (Tortoise and Hare).
 */
import java.util.Arrays;

public class TwoPointer {

    static boolean twoPointer(int[] arr, int target){
        // Sort the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int left = 0, right = arr.length-1;
        while (left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println("" + sum + ' ' + target + ' ' + arr[left] + ' ' + arr[right]);
                return true;
            } else if (sum<target) {
                left++; // Move left pointer to right
            } else right--; // Move right pointer to left
        }
        // If no pair is found
        return false;
    }

    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int target = 1;

        if(twoPointer(arr, target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}