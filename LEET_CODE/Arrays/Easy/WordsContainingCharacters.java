import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacters {
    public static void main(String[] args) {
        String[] words =new String[]{"abc","bcd","aaaa","cbc"};
        char x='a';  
        List <Integer> arr=findWordsContaining(words,x);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<words.length;i++){
           if(words[i].indexOf(x)!=-1){
            arr.add(i);
           }
        }
        return arr;
    }
}
