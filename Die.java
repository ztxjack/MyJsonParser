package MyJsonParser;

/**
 * Created by ztx on 2018/8/30.
 */
public class Die {
    public int getDie_num() {
        return die_num;
    }

    public void setDie_num(int die_num) {
        this.die_num = die_num;
    }

    public int getLocation_x() {
        return location_x;
    }

    public void setLocation_x(int location_x) {
        this.location_x = location_x;
    }

    public int getLocation_y() {
        return location_y;
    }

    public void setLocation_y(int location_y) {
        this.location_y = location_y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Die{" +
                "die_num=" + die_num +
                ", location_x=" + location_x +
                ", location_y=" + location_y +
                ", result=" + result +
                '}';
    }

    private int die_num;
    private int location_x;
    private int location_y;
    private int result;



}
