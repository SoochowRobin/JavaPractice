import java.util.Vector;

public class VectorPractice {

    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        for (int i = 0; i < vector.size(); i++) {
            // print out all elements in vector
            System.out.println(vector.get(i));
        }


    }
}
