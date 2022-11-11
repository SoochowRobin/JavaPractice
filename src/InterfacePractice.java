public class InterfacePractice {

    public static void main(String[] args) {
        ImplementMyMath test = new ImplementMyMath();
        int results = test.doSub(1, 2);
        System.out.println(results);
    }
}

interface InterfaceA {

}

interface InterfaceB {

}

/*
interface could extends many interfaces at the same time
 */
interface InterfaceC extends InterfaceA, InterfaceB{

}


interface MyMath {

    int doSum(int a, int b);
    int doSub(int a, int b);
}


class ImplementMyMath implements MyMath{

    @Override
    public int doSum(int a, int b) {
        return a + b;
    }

    @Override
    public int doSub(int a, int b) {
        return a - b;
    }
}
