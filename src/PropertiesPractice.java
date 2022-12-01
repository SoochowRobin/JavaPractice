import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) {
        Properties pro = new Properties();

        /*
        Properties extends from HashTable and it is thread-safe,
        use setProperty(key, value) and getProperty(key)
         */

        pro.setProperty("url","http:google.com");
        pro.setProperty("name", "Google");
        pro.setProperty("value", "100000");

        // use getProperty
        System.out.println(pro.getProperty("url"));
        System.out.println(pro.getProperty("name"));
    }
}
