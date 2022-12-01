import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamPractice {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students"));

        Object obj = in.readObject();
        System.out.println(obj instanceof List);


        List<Student> students = (List<Student>) obj;
        for (Student s: students) {
            System.out.println(s);
        }

        in.close();
    }
}
