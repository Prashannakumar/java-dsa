import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        List<Integer> prefixSumList = new ArrayList<>();

        prefixSumList.add(arr[0]);

//        System.out.print(arr);
//        System.out.print(Arrays.toString(arr));
//        System.out.print(Arrays.toString(prefixSumList));
//        System.out.print(prefixSumList);

        for(int i = 1; i<arr.length; i++){
            prefixSumList.add(prefixSumList.get(i-1)+arr[i]); //1=10+20, 4=100+50
        }
        System.out.print(prefixSumList);

    }
}