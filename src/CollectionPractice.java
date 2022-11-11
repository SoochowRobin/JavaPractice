import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("01", "Mr Chen");
        map.put("02", "Mr Li");
        map.put("03", "Mr Gu");

        // HashMap has several common use method: keySet(),  values(), containsKey(), get(), put()
        Set<String> set = map.keySet();
        // iterator has hasNext() and next() method
        Iterator<String> it = set.iterator();
        System.out.println("There are some keys in map:");
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("There are some values in the map: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
