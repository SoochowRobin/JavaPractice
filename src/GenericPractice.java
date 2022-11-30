import java.util.ArrayList;
import java.util.List;

public class GenericPractice {

    /*
    Generic comes out after JDK 5, and it could make sure each element in the container belongs to the
    same data type
     */

    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>(); // use Generic here
        zoo.add(new Cat());
        zoo.add(new Dog());

        for (int i = 0; i < zoo.size(); i++) {
            Animal a = zoo.get(i);
            a.move();
        }

    }
}

class Cat extends Animal {

    @Override
    public void move() {
        System.out.println("Cat is moving!");
    }
}


class Dog extends Animal{

    @Override
    public void move() {
        System.out.println("Dog is moving!");
    }
}

