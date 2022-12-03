package thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerPractice {

    public static void main(String[] args) throws ParseException {

        // create timer object
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2022-12-01 22:36:00");



        timer.schedule(new MyTask(), firstTime, 1000 * 10);

    }


}


class MyTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println( strTime + " Start copying file!");
    }
}
