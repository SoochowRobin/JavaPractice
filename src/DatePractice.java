import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getDate());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

    }
}
