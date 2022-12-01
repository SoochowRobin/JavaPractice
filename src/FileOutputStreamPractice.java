import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPractice {

    public static void main(String[] args) {
        FileOutputStream file = null;

        try {
//            file = new FileOutputStream("myFile");
            file = new FileOutputStream("myFile", true);
            byte[] bytes = {99, 99, 98, 100, 101};
            file.write(bytes);

            // flush
            file.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
