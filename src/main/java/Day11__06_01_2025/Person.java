package Day11__06_01_2025;

import java.util.Arrays;

public class Person {

    public static void main(String[] args) {
        Person [] arr = new Person[5];
        arr[0] = new Person(1l,"Aman","deep",21,"Software Developer 1");
        arr[1] = new Person(2l,"Raman","deep",25,"Software Developer 2");
        arr[3] = new Person(3l,"Raman","deep",26,"Software Developer at Test");
        arr[4] = new Person(4l,"Harman","deep",18,"Jr. Software Developer at Test");

        for (Person p : arr){
            System.out.println(p);
        }
    }


    Long Id;
    String firstName;
    String lastName;
    int age;
    String occupation;

    public Person(Long id, String firstName, String lastName, int age, String occupation) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Name='" + firstName +" "+ lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
