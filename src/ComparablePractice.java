import java.util.TreeSet;

public class ComparablePractice {

    public static void main(String[] args) {

        TreeSet<Vip> treeSet = new TreeSet<>();

        treeSet.add(new Vip("zhangsan", 20));
        treeSet.add(new Vip("lisi", 10));
        treeSet.add(new Vip("wangliu", 7));
        treeSet.add(new Vip("zhangai", 20));
        treeSet.add(new Vip("zhangsan", 40));

        for (Vip v: treeSet) {
            System.out.println(v);
        }
    }


}


/*
Vip class has name(String), age(int), and our comparable rule wants
firstly we based on age and if age are the same, we based on name String
 */
class Vip implements Comparable<Vip>{

    private String name;
    private int age;

    public Vip(){}

    public Vip(String name, int age) {
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

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip o) {
        if(this.age == o.age){
            // string has implemented the compareTo method
            return name.compareTo(o.name);
        }else{
            return age - o.age;
        }
    }
}

