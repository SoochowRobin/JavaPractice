import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetPractice {

    /*
    HashMap has a method called entrySet(), and it returns a set of Map.Entry()
    And we could use it when there are large amount of data
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "liliu");

        // the first method to iterator the hashmap is to get the keySet and then iterate the keyset and use key to get value
        Set<Integer> keys = map.keySet();

        // use iterator
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.print("Key: "+ key +" Value: " + map.get(key));
        }
        System.out.println();
        System.out.println("==================");
        // use for-each
        for(Integer key: keys){
            System.out.print("Key: "+ key +" Value: " + map.get(key));
        }
        System.out.println();
        System.out.println("Use Map.Entry Object: ");

        // use EntrySet
        Set<Map.Entry<Integer, String>> nodes = map.entrySet();
        for (Map.Entry<Integer, String> node: nodes) {
            System.out.println(node.getKey() + " " + node.getValue());
        }

        System.out.println();
        System.out.println("use iterator to iterate the Map.Entry ");
        Iterator<Map.Entry<Integer, String>> it2 = nodes.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            System.out.print("key: " + node.getKey() + "+ Value :" + node.getValue() + " ");
        }

        // use

    }
}
