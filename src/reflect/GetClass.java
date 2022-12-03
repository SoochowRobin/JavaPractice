package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        
        Class c1 = null;
        // first method to get Class, use static method in Class
        try {
            c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // second method to get Class, use getClass() method in Object
        String s = "abc";
        Class c2 = s.getClass();

        // The result would be true, because they have the same memory location
        System.out.println(c1 == c2);

        // Each type in java has .class property
        Class c3 = String.class;
        System.out.println(c1 == c3);


        System.out.println(c3.newInstance());

        String path = Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();  // this method will get absolute path
        System.out.println(path);

        // improve use inputStream as return
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String name = pro.getProperty("className");
        System.out.println(name);
        Class stringClass = Class.forName(name);
    }
}
