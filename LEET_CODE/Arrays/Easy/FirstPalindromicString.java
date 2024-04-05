public class FirstPalindromicString {
    public static void main(String[] args) {
        String s []= new String[]{"abc","car","ada","racecar","cool"};   

        String str=firstPalindrome(s);
        System.out.println(str);
    }
    public static String firstPalindrome(String[] words) {
        String res="";

        for (int i = 0; i < words.length; i++) {
             StringBuilder sb= new StringBuilder();
             sb.append(words[i]);
             if(words[i].equals(sb.reverse().toString())){
                res=words[i];
                break;
             }
        }

        return res;
    }
    
}
