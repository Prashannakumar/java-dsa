/**
 *Sum of Pair Equal to Target:
 * Given a sorted array arr (sorted in ascending order) and a target,
 * find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.
 */

public class twoSum {

    static boolean twoSum(int[] arr, int target){
        int n = arr.length;

        for(int i=0; i< n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    System.out.println("" + sum +' '+ target +' '+ arr[i] +' '+ arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int target = 10;

        if(twoSum(arr, target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}