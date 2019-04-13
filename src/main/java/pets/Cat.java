package pets;

public class Cat extends Pet {

    public Cat(String name, double weight, int age) {
        super(name, weight, age);
    }

    public boolean isObese() {

        return weight > 20;
    }

    @Override
    public boolean isOld() {
        return age > 15 ;
    }
}
