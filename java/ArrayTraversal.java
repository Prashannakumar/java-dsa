import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayTraversal{
    public static void main(String[] args){
        // Linear traversal

        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        System.out.print("Linear Traversal: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Reverse traversal
        System.out.print("Reverse Traversal: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Methods of array traversal

        System.out.print("For loop: ");
        int[] arr2 = {10, 20, 30, 40, 50};
        int n2 = arr2.length;
        String output;
        for (int i = 0; i < n2; i++){
            output = arr2[i] + " ";
            System.out.print(output);
        }
        System.out.println();

        System.out.print("While loop: ");
        int i2 = 0;
        while(i2 < n2){
            System.out.print(arr2[i2] + " ");
            i2++;
        }
        System.out.println();

        System.out.print("For each loop: ");
        System.out.println(array);
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();

        // Searching elements

        int target = 1;
        boolean found = false;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found!");
        }else {
            System.out.println("Element not found!");
        }

        // Modifying elements

        for(int i = 0; i<n2; i++){
            arr2[i] += 5;
        }
        System.out.print("Modified Array: ");
        for(int i = 0; i<n2; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        ///   /////////////

        System.out.println(Arrays.toString(arr2));

        // arrays to list
        System.out.println("Arrays to List");
        List<int> listArr = Arrays.asList(arr2);

        System.out.print(listArr);

    }
}