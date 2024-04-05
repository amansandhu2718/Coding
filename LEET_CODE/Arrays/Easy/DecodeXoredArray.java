public class DecodeXoredArray {
    public static void main(String[] args) {
        int []arr=new int []{1,2,3};
        int first = 1;
        int []arr2=decode(arr,first);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    public static int[] decode(int[] encoded, int first) {

        int n=encoded.length;
          int arr[]= new int [n+1];
        arr[0]=first;


        for(int i=0;i<n;i++){
            arr[i+1]=encoded[i]^arr[i];
        }
        return arr;
    }
}
