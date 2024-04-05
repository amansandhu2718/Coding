import java.util.ArrayList;
import java.util.List;

public class KidsGreatestCandies {
    public static void main(String[] args) {
        
    }

     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr=new ArrayList<>();

        int max=0;
        int n=candies.length;

        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max){
                arr.add(true);
            }
        }
        return arr;
    }
}
