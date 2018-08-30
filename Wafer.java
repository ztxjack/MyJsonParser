package MyJsonParser;

import java.util.ArrayList;

/**
 * Created by ztx on 2018/8/30.
 */
public class Wafer {
    public int getWaferId() {
        return waferId;
    }

    public void setWaferId(int waferId) {
        this.waferId = waferId;
    }

    public ArrayList<Die> getDieList() {
        return dieList;
    }

    public void setDieList(ArrayList<Die> dieList) {
        this.dieList = dieList;
    }

    @Override
    public String toString() {
        return "Wafer{" +
                "waferId=" + waferId +
                ", dieList=" + dieList +
                '}';
    }

    private int waferId;
    private ArrayList<Die> dieList;
}
