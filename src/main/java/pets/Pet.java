package pets;

public class Pet implements Comparable<Pet> {

    protected  String name;
    protected double weight;
    protected int age;

    public Pet(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "pets.Pet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Pet o) {
        if (weight > o.weight) return -1;
        else if (o.weight > weight) return 1;
        return 0;
    }

    public boolean isOld() {

        return age > 10;
    }

}
