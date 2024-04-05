public class TruncateSentence {
    public static void main(String[] args) {
        
        String s= "Hello how are you Contestant";
        int k=4;
        String str= truncateSentence(s, k);
        System.out.println(str);

    }
    public static String truncateSentence(String s, int k) {
        String res=s;
        int count=0;
        int index=-1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                count++;
                if(count==k){
                    index=i;
                    break;
                }
            }
            
        }
        if(index!=-1){
            res=res.substring(0,index);
        }
        return res;
    }
}
