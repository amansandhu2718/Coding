public class MaxWordsInStrArr {
    public static void main(String[] args) {
        String []arr=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int s=mostWordsFound(arr);
        System.out.println(s);
    }
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String singleSentence=sentences[i];
            String[]arr=singleSentence.split(" ");
            if(arr.length>max){
                max=arr.length;
            }
        }
        return max;
    }
}
