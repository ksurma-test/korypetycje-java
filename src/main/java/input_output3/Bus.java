package input_output3;

public class Bus {

    private String identifier;
    private Line line ;


    public Bus(String identifier, Line line) {
        this.identifier = identifier;
        this.line = line;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "identifier='" + identifier + '\'' +
                ", line=" + line +
                '}';
    }
}
