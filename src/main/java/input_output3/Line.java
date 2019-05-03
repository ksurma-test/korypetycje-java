package input_output3;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private  int number;
    private List<Stop> stops;

    public Line(int number) {
        this.number = number;
        stops = new ArrayList<>();
    }

    public void addStop(Stop stop) {
        stops.add(stop);
    }

    @Override
    public String toString() {
        return "Line{" +
                "number=" + number +
                ", stops=" + stops +
                '}';
    }
}
