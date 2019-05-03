package input_output3;

public class Main {

    public static void main(String[] args) {

        Line line = new Line(171);
        line.addStop(new Stop("Kazubow"));
        line.addStop(new Stop("Bemowo Ratusz"));
        line.addStop(new Stop("Wola Park"));

        Bus bus = new Bus("6762ASAD" , line);

        System.out.println(bus);
    }

}
