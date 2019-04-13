public class Person  implements Comparable<Person>{


    private String firstName ;
    private String lastName;
    private int age;

    public Person (String  firstName , String lastName , int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;   // this.zmienna  = parametr  w konstrukorze .
    }

    public int getAge(){
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
