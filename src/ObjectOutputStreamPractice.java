import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamPractice {

    /*
    All object wants to use ObjectOutputStream must implements Serializable interface
     */

    public static void main(String[] args) throws IOException {
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("students"));

        // new object
        Student student = new Student("zhangsan", 18);
        Student student1 = new Student("lisi", 20);
        Student student2 = new Student("wangwu", 21);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        ob.writeObject(students);

        ob.flush();

        ob.close();
    }

}


class Student implements Serializable{
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
