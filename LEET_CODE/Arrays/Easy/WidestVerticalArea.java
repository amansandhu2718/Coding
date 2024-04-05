import java.lang.reflect.Array;
import java.util.Arrays;

public class WidestVerticalArea {
    public static void main(String[] args) {
        
        int arr[][]=new int [][]{{8,7},{9,9},{7,4},{9,7} };
        int z= maxWidthOfVerticalArea(arr);
        System.out.println("ans: "+z);
    }

    public static int maxWidthOfVerticalArea(int[][] arr) {

        int arrSort[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arrSort[i]=arr[i][0];
        }
        Arrays.sort(arrSort);

        int max=0;
        if(arrSort.length>0){
            for(int i=1;i<arrSort.length;i++){
                
                if((arrSort[i]-arrSort[i-1]) > max){
                    max=arrSort[i]-arrSort[i-1];
                }
            }
        }

        return max;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(""+ arr[i]);
        }
        System.out.println();
    }
}
