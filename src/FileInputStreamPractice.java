import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamPractice {


    public static void main(String[] args) {
        /*
        framework, new object firstly
         */
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("tempfile");

//            int readData = inputStream.read();
//            System.out.println(readData);
//
//            int readData1 = inputStream.read();
//            System.out.println(readData1);

//            while(true){
//                int readData = inputStream.read();
//                if(readData == - 1){
//                    break;
//                }
//                System.out.println(readData);
//            }

            // drawback: it is not very efficient, because it gets one character once a time.
            int readData = 0;
            while((readData = inputStream.read()) != -1){
                System.out.println(readData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close the inputstream object, it should not be null
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
