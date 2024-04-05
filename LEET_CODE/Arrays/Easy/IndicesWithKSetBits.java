import java.util.ArrayList;
import java.util.List;

public class IndicesWithKSetBits {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(); 

        arr.add(5);
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        int k=1;

        int a = sumIndicesWithKSetBits(arr,k);
        System.out.println(a);

    }

     public static int sumIndicesWithKSetBits(ArrayList<Integer> nums, int k) {
        int res=0;
        
        for(int i=0;i<nums.size();i++){
           
            if(Integer.bitCount(i)==k){
                res=res+nums.get(i);
            }

        }



        return res;
    }
}




// import java.util.ArrayList;
// import java.util.List;

// public class IndicesWithKSetBits {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr= new ArrayList<>(); 

//         arr.add(5);
//         // arr.add(10);
//         // arr.add(1);
//         // arr.add(5);
//         // arr.add(2);
//         int k=1;

//         int a = sumIndicesWithKSetBits(arr,k);
//         System.out.println(a);

//     }

//      public static int sumIndicesWithKSetBits(ArrayList<Integer> nums, int k) {
//         int res=0;
//         for(int i=0;i<nums.size();i++){
//            int num= nums.get(i);
//             int setBitCount=0;
//             int a=1;
//             while (num!=0) {
//                 int rem =num%2;
//                 setBitCount=rem*a+setBitCount;
//                 a=a*10;
//                 num = num/2;

//             }
//             System.out.println(setBitCount);
//         }



//         return res;
//     }
// }
