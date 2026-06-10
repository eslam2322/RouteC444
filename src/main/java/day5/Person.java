package day5;

public class Person {
    String name;
    int age;
    char gender;
    //defult constructor
    public Person() {
        System.out.println("default constructor");
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public void printdata() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
    }

}
