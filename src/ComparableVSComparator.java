import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ComparableVSComparator {

    public static void main(String[] args) {
        Integer[] values = new Integer[]{9, 2, 1, -10, 2, 23, 17, 8, 5};
        Arrays.sort(values, (o1, o2) -> o2 - o1);  // replace with lambda function

        System.out.println(Arrays.toString(values));

    }
}

class Coupon implements Comparable<Coupon>{
    private String id;
    private Date endTime;
    private int price;


    // constructor
    public Coupon(String id, Date endTime, int price) {
        this.id = id;
        this.endTime = endTime;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*
    compare strategy is that: price is equal, compare endtime, else compare id
     */
    @Override
    public int compareTo(Coupon o) {
        // price descending
        if (o.getPrice() > this.price){
            return 1;
        }else if(o.getPrice() == this.price){
            if (this.endTime.compareTo(o.getEndTime()) == 0){
                return id.compareTo(o.getId());
            }else{
                return this.endTime.compareTo(o.getEndTime());
            }
        }else{
            return -1;
        }
    }
}

