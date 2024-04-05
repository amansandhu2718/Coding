import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberGame {
    public static void main(String[] args) {
        int arr2 [] =new int []{2,5};
        int [] arr= numberGame(arr2);
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
    public static int[] numberGame(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i=i+2) {
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        return nums;
        
    } 
}
