import java.util.HashSet;

public class HashSetPractice {
    /*
    HashSet is a collection of items where every item is unique
    And HashSet has method like add(), to check whether an item exists contains()
    remove an item, remove("")
     */

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("BMW");
        // set size is 1
        System.out.println(hashSet.size());

        hashSet.add("Lexus");
        hashSet.add("Benz");
        System.out.println(hashSet.size());

        boolean result = hashSet.contains("Lexus");
        System.out.println(result);

    }
}
