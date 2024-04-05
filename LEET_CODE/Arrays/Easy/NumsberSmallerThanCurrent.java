import java.util.Arrays;
import java.util.HashMap;

public class NumsberSmallerThanCurrent {
    public static void main(String[] args) {
     int arr[]=new int []{8,1,2,2,3};   
     int res[]=smallerNumbersThanCurrent(arr);
     for(int i=0;i<res[i];i++){
        System.out.println(res[i]);
     }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        Arrays.sort(nums);

        
      int count=0;
      int prev=0;
      nums[0]=prev;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[prev]){
                count++;
            }
            prev=i;
            nums[i]=count;
        }
        return nums;
    }
}


// 1 2 2 3 3 8