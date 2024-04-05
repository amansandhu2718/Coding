
import java.util.HashMap;

public class One {
    public static void main(String[] args) {
      
        int arr[]=new int[]{2,5,1,3,4,7};
        int nums[]=new int [arr.length];
        int n=3;
  
        int i=0;
        int j=arr.length/2;
        int k=0;
   

        while(i<arr.length/2){
            nums[k]=arr[i];
            nums[k+1]=arr[j];
            i++;
            j++;
            k=k+2;
        }
        for (int k2 = 0; k2 < nums.length; k2++) {
            System.out.println(nums[k2]);
        }

    }
}

