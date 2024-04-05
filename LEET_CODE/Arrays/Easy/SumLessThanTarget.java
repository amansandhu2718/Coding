import java.util.List;

public class SumLessThanTarget {
    public static void main(String[] args) {
        
    }
    public static int countPairs(List<Integer> nums, int target) {
        
        int res=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && (nums.get(i)-nums.get(j)==target)){
                        res++;
                }
            }
        }
        return res;
    }
}
