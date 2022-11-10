import java.util.HashMap;

public class HashMapPractice {
    /*
    The hashmap class has many useful methods. For example, to add item to it,
    use put() method to add elements into hashmap, use get(key) method to extract
    element from hashmap
     */
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


        // to access an item, we use get() method
        System.out.println(capitalCities.get("USA"));

        // to get a size of the hashmap
        System.out.println("The size of the hashmap " + capitalCities.size());

        // loop through a hashmap  -- use keyset
        for (String nation: capitalCities.keySet()){
            System.out.print(nation + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        // values() to get all values
        System.out.println(capitalCities.values());


    }
}
