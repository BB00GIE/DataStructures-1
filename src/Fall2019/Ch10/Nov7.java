package Fall2019.Ch10;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Nov7 {

    static public void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("apple","it is red or green");
        map.put("orange","it is a fruit and a color");
        map.put("lemon", "It is sour");

        String key = "apple";
        String value = map.get(key);
        System.out.printf(" 1.   %s ===> %s\n", key, value);

        key = "orange";
        value = map.get(key);
        System.out.printf(" 2.   %s ===> %s\n", key, value);

        key = "cherry";
        value = map.get(key);
        System.out.printf(" 3.   %s ===> %s\n", key, value);

        key = "apple";
        String mystery = map.put(key, "I like apple pie");
        System.out.printf(" 4.   mystery ===> %s\n", mystery);
        value = map.get(key);
        System.out.printf(" 5.   %s ===> %s\n", key, value);

        key = "apple";
        System.out.printf(" 6.   map contains key '%s'? %s\n",key,map.containsKey(key));

        key = "banana";
        System.out.printf(" 7.   map contains key '%s'? %s\n",key,map.containsKey(key));

        value = map.get("apple");
        System.out.printf(" 8.   map contains value '%s'? %s\n",value,map.containsValue(value));

        value = "2";
        System.out.printf(" 9.   map contains value '%s'? %s\n",value,map.containsValue(value));

        /*
        key = "apple";
        System.out.printf(" 10.   map contains key '%s'? %s\n",key,map.containsKey(key));
        map.remove(key);
        System.out.printf(" 11.   map contains key '%s'? %s\n",key,map.containsKey(key));


         */
        System.out.println("ALL THE KEY VALUE PAIRS:");
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String k = iter.next();
            System.out.printf("    %s -----> %s\n",k,map.get(k));
        }
    }
}
