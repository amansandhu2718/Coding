public class KthLargestElement {

    public static void main(String[] args) {
        int arr[]=new int []{ 1,2,3,4,5,6,7,8};
        int k=2;
        MyCustomClass m = new MyCustomClass(k);

        for(int i=0;i<arr.length;i++){

        }


    }

 
}
 class MyCustomClass{
    int [] arr;
    int PointerToarray=0;

    MyCustomClass(int n) {
        this.arr=new int[n];
    }

    public void AddToArray(int n){
        this.arr[this.PointerToarray]=n;
        this.PointerToarray++;
    }


   
}
