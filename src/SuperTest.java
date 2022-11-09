public class SuperTest {
    /*
     *No matter how, the superclass's constructor will be executed
     */

    public static void main(String[] args) {
        new B();
    }
}
    class A {
//        public A() {
//            System.out.println("This is a constructor method for A.");
//        }
        public A(int i){
            System.out.println("This is a constructor method for A.");
        }
    }

    class B extends A {
        public B(){
            super(123);
            System.out.println("This is a constructor method for B.");
        }
    }

