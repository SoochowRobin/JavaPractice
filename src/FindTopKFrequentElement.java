import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class FindTopKFrequentElement {

    public static void main(String[] args) {
        int[] test = new int[] {1, 1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 2, 2, 2, 2, 2};
        System.out.println(findTopK(2, test));

    }


    public static int findTopK(int k, int[] nums){
        // use hashmap to record each elements frequent
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        // find all values()
        ArrayList<Integer> values = new ArrayList<>(map.values());
        // sort
        Collections.sort(values, Collections.reverseOrder());
        // get frequency
        int freq = values.get(k-1);

        // iterate to find freq = freq
        for(int key: map.keySet()){
            if (map.get(key) == freq){
                return key;
            }
        }

        return -1;
    }
}
