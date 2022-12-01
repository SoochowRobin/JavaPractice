import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFilePractice {
/*
    Practice using fileinputstream and fileoutputstream to copy file from one place to another

    Stream can be used to read & write any types of files
 */
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        // copy file from one folder to desktop directly
        try {
            in = new FileInputStream("/Users/robinchen/Desktop/TA/PA2.pdf");
            out = new FileOutputStream("/Users/robinchen/Desktop/PA2.pdf");

            byte[] bytes = new byte[10 * 1024];
            int readCount;
            while((readCount = in.read(bytes)) != -1){
                out.write(bytes, 0, readCount);
            }

            //flush the outputstream
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
            // close the pipes finally
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
