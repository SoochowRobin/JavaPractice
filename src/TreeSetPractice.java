import java.util.TreeSet;

public class TreeSetPractice {



    public static void main(String[] args) {

        TreeSet<Customer> treeSet = new TreeSet<>();

        treeSet.add(new Customer("zhangsan", 100));
        treeSet.add(new Customer("lisi", 18));
        treeSet.add(new Customer("zhangsan", 8));
        treeSet.add(new Customer("zhangsan", 65));

        for (Customer c: treeSet) {
            System.out.println(c);
        }

    }
}

class Customer implements Comparable<Customer>{
    private String name;
    private int age;

    public Customer(){}

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
            implement compareTo method
             */
    @Override
    public int compareTo(Customer o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
