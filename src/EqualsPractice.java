import java.util.Objects;

public class EqualsPractice {

    private int year;
    private int month;
    private int day;



    public EqualsPractice(){

    }

    public EqualsPractice(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "EqualsPractice{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    /*
    Practice to use IDEA to override equals methods
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // very excellent
        EqualsPractice that = (EqualsPractice) o;  //downcast
        return year == that.year && month == that.month && day == that.day;  // if there are string type: we need to use equals() method
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
