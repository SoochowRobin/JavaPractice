import java.io.File;

public class FilePractice {

    public static void main(String[] args) {
        File file = new File("/Users/robinchen/Desktop/a/b/c");

        if(!file.exists()){
            System.out.println(file.mkdirs());
        }
    }
}
