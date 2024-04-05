import java.util.ArrayList;
import java.util.List;


public class ItemsMatchingARule {
 public static void main(String[] args) {
    List<List<String> > aList =  new ArrayList<List<String>>(); 
    String ruleKey="";
    String ruleVal="";
    int n= countMatches(aList,ruleKey,ruleVal);
    
 }  

   public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int i=-1;
    switch (ruleKey) {
        case "color":
            i=1;
            break;
        case "type":
            i=0;
            break;
        case "name":
            i=2;
            break;
        default:
            break;
    }

    int count=0;
    for (int j = 0; j < items.size(); j++) {
        List<String> singleItem = items.get(i);
        if(singleItem.get(i).equals(ruleValue)){
            count++;
        }
    }
    return count;
    } 
}
