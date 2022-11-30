import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContainsMethod {



    public static void main(String[] args) {

        List c = new ArrayList();  // upper cast
        c.add('a');
        c.add('b');

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }

    }
}
