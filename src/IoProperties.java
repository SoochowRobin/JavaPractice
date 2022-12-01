import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IoProperties {

    public static void main(String[] args) throws IOException {
        /*
        Properties is a map collection
         */


        // use stream as input
        FileReader file = new FileReader("src/userinfo");

        Properties pro = new Properties();
        // use load method
        pro.load(file);

        String name = pro.getProperty("user");
        String password = pro.getProperty("password");
        System.out.println(name);
        System.out.println(password);
    }
}
