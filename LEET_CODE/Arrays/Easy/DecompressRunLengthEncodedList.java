import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        
        int arr[] = new int[]{2,3};
       int arr2[]= decompressRLElist(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
       int s=0;
        for(int i=0;i<nums.length;i=i+2){
            s=s+nums[i];
        }
        int res[]=new int[s];

       int i=0;
       int j=1;
       int k=0;


       while (j<nums.length) {    

        Arrays.fill(res, k, k+nums[i],nums[j]);

        k=k+nums[i];
        j=j+2;
        i=i+2;   
       }

        return res;
    }
}
