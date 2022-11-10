public class PrimitiveDataType {
    /*
    Primitive data type: byte, short, int, long, float, double, boolean, char
     */
    public static void main(String[] args) {

        /*
        like C and C++, you could treat character as an integer, when you init
        char x = 'a';  ==  char x = 97;
         */

        char d = 'd';
        System.out.println("d in unicode is " + (int)d);
        // you could do that because you could treat character as integer
        char x = 97;
        System.out.println(x);

        /*
        This code make me feel amazing
         */
        int[] count = new int[100];
        count[x] ++;
        System.out.println(count[97]);

        /*
        logical operator: &&, ||, !
         */


        String str = "";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("The time String consuming " + time);

        // compare with StringBuilder
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("The time StringBuilder comsuming " + time);
    }
}
