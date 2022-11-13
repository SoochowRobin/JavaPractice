import java.util.*;

public class FindTopKElements {
    public static List<Integer> findTopK(List<Integer> input, int k){

        // heap is based on pq
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // if we want to find Nth smallest element?
        // pass Collections.reverseOrder() when calling the constructor
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num: input){
            pq.add(num);

            // all elements in pq are in ascending order
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
        List<Integer> topKList = new ArrayList<>(pq);
//        Collections.reverse(topKList);

        return topKList;

    }


    public static void main(String[] args) {
        Integer[] input = new Integer[]{-10, -100, -152, 70, 2, 35, 40 };
        List<Integer> integersList = Arrays.asList(input);
        System.out.println(findTopK(integersList, 2));
    }
}
