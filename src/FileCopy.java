import java.io.*;

public class FileCopy {

    /*
    Copy the directory and its contents in a recursive way
    from one folder to desktop folder
     */

    public static void main(String[] args) {
        File srcFile = new File("/Users/robinchen/Robin_Chen");
        File destFile = new File("/Users/robinchen/Desktop/test");


        copyDir(srcFile, destFile);

    }

    private static void copyDir(File srcFile, File destFile) {
        // if srcFile is a file instead of directory, it is over
        if (srcFile.isFile()) {
            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                in = new FileInputStream(srcFile);
                String directory = destFile.getAbsolutePath() + srcFile.getAbsolutePath().substring(27);

                out = new FileOutputStream(directory);

                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        // use listFiles() get all files
        File[] files = srcFile.listFiles();
//        System.out.println(files.length);
        if (files != null) {
            for (File file : files) {
                // get all file absolute path
//            System.out.println(file.getAbsolutePath());
                if (file.isDirectory()) {
                    String srcPath = file.getAbsolutePath();
//                System.out.println(srcPath.substring(27));
                    String directory = destFile.getAbsolutePath() + srcPath.substring(27);
                    File newFile = new File(directory);
                    // mkdirs() create folders
                    if (!newFile.exists()) {
                        newFile.mkdirs();
                    }

                }
                copyDir(file, destFile);
            }
        }
    }
}

