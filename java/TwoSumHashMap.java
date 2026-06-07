import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/**
 * time complexity : O(N) - we traverse the array once, and each lookup/insert in the hash map is O(1) on average.
 * space complexity : O(N) - in the worst case, we might store all elements in the hash map if no two numbers sum up to the target.
 */
public class TwoSumHashMap {

    static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.print(Arrays.toString(twoSum(arr, target)));
    }
}