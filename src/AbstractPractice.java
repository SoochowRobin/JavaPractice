public class AbstractPractice {
    public static void main(String[] args) {
        Animal bird = new Bird(); // we face abstraction code, decouple the code
        bird.move();
    }

}

abstract class Animal{
    public abstract void move();
}


/*
Subclass which extends super class needs to implement abstract method in abstract class.
 */
class Bird extends Animal{

    @Override
    public void move() {
        System.out.println("The bird is flying");
    }
}