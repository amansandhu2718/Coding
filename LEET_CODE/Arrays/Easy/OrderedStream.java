import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    String []s;
    int ptr=0;

    public OrderedStream(int n) {
        s=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        s[idKey-1]=value;
        List<String> str= new ArrayList<String>();
        while(ptr < s.length && s[ptr]!=null){
            str.add(s[ptr]);
            ptr++;
        }
        return str;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
