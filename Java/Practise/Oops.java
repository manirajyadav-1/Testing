import java.util.*;

class Person{
    String name;
    int age;

    static int count;
    public Person(){
        count++;
        System.out.println("Creating a new object.");
    }

    public Person(String name,int age){
        //this(); //used of calling same type constructor
        this.name = name;
        this.age = age;
    }

    void talk(){
        System.out.println(name + " is talking.");
    }

    void walk(int steps){
        System.out.println(name + " walks "+ steps);
    }

    void walk(){
        System.out.println(name + " is walking.");
    }
}

class Developer extends Person{
    public Developer(String name,int age){
    super(name,age);
}
}



class Oops{
    public static void main(String[] args){
        Person p1 = new Person("Mani",20);
        // p1.name = "Mani";
        // p1.age = 20;

        Person p2 = new Person("Sunny",23);
        // p2.name = "Sunny";
        // p2.age = 23;

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);


        p1.talk();
        p1.walk();
        p1.walk(2);
        System.out.println(Person.count);
        Developer d1 = new Developer("Shivam",25);
        d1.walk();
    }
}