import java.util.HashMap;

public class StringArraysEquivalent {
    public static void main(String[] args) {
        String arr1[]=new String[]{"abc", "d", "defg"};
        String arr2[]=new String[]{"abcddefg"};
        boolean b= arrayStringsAreEqual(arr1,arr2);
        System.out.println(b);

        
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder SB1= new StringBuilder();
        StringBuilder SB2= new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            SB1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            SB2.append(word2[i]);
        }

        System.out.println(SB1.toString() +" -> " + SB2.toString());
        if(SB1.toString().equals(SB2.toString()) ){
            return true;
        }else{
            return false;
        }
    
    }
}


