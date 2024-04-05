import java.util.ArrayList;

public class ShuffleString {
    public static void main(String[] args) {
        
        String s="codeleet";
        int arr[]=new int[]{4,5,6,7,0,2,1,3};
        String str=restoreString(s,arr);
        System.out.println(str);
    }
    public static String restoreString(String s, int[] indices) {
       char [] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            ch[indices[i]]=s.charAt(i);
        }

        s="";
        for (int i = 0; i < ch.length; i++) {
            s=s+ch[i];
        }
        
        return s;
    }
}
