import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamPractice02 {

    public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("tempfile");
//            byte[] bytes = new byte[4];
////            int readCount = inputStream.read(bytes);  // return the readCount, -1 if it reaches the end
//
//            int readCount;
//            while((readCount = inputStream.read(bytes)) != -1){
//                System.out.print(new String(bytes, 0, readCount));
//            }

//            while (readCount != -1){
//                System.out.print(new String(bytes, 0, readCount));
//                readCount = inputStream.read(bytes);
//            }

            /*
            we could use available method to get the length of readable bytes and then use this length to new bytes[]
            instead of using while loop
             */

            byte[] bytes1 = new byte[inputStream.available()];  // get and new the byte[] by length
            inputStream.read(bytes1);  // read the file once
            System.out.println(new String(bytes1));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
