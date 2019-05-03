package input_output;

public class Person {

    private  String firstName;
    private String lastName;
    private Double height;
    private Pet pet;


    public Person(String firstName, String lastName, Double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", pet=" + pet +
                '}';
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


}
