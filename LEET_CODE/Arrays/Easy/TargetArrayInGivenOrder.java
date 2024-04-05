import java.util.ArrayList;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int arr[]=new int[]{10,4,8,3};
        int arr2[]=new int[]{10,4,8,3};
        int arr3[]=createTargetArray(arr,arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr3[i]);
        }
       
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
}
