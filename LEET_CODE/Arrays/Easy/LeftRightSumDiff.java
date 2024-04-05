public class LeftRightSumDiff {
    
    public static void main(String[] args) {
        
        int arr[]=new int[]{10,4,8,3};
        int arr2[]=leftRightDifference(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    public static int[] leftRightDifference(int[] nums) {

        int n=nums.length;
        int left=0;
        int total=0;
        int right=0;
        
        for (int i = 0; i < n; i++) {
            total=total+nums[i];
        }
        for(int i=0;i<n;i++){
            right=findRight(total, left, nums[i]);
            int res=Math.abs(left-right);
            left=left+nums[i];
            nums[i]=res;
        }

        return nums;
    }

    public static int findRight(int total,int left, int curr ){
        return total-left-curr;
    }
}
