public class RichestCustomerWealth {
    public static void main(String[] args) {
        int arr[][]=new int [][]{{1,2,3},{3,2,1}};
       int a= maximumWealth(arr);
    }


    public static int maximumWealth(int[][] arr) {
        
        int maxWealth=0;

        for(int i=0;i<arr.length;i++ ){
            int wealth=0;
            for(int j=0;j<arr[i].length;j++){
                wealth=wealth+arr[i][j];
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }


        return maxWealth;
    }
}
