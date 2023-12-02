import java.util.*;

// class Pen{
//     String colour;
//     String type; //ballpen or gelpen

//     public void write(){
//         System.out.println("Writing something");
//     }

//     public void printColour(){
//         System.out.println(this.colour);
//     }
// }

//polymorphism
// class Student{
//     String name;
//     int age;

//     static void printInfo(String name){
//         System.out.println(name);
//     }

//     static void printInfo(int age){
//         System.out.println(age);
//     }

//     static void printInfo(String name,int age){
//         System.out.println(name +" "+ age);
//     }
// }

// public class Oops{
//     public static void main(String args[]){
//        Student s1 = new Student();
//        s1.name = "Mani";
//        s1.age = 20;
//        s1.printInfo(s1.age);
//     }
// }

//Inheritance
// class Shape{
//     String color;
// }

// class Triangle extends Shape{

// }

// public static void main(String args[]){
// Triangle t1 = new Triangle();
// t1.color = "red";
// }

//single level inheritance
//multi level
// class Shape{
//     public void area(){
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class EquilateralTriangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

//     public class Oops{
//         public static void main(String args[]){
//             Circle new1 = new Circle();
//             new1.area(5);
//         }
//     }

//Abstraction
// abstract class Animal{
//     abstract void walk();
//     public void eat(){
//         System.out.println("Animal eat");
//     }
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }
// public class Oops{
// public static void main(String args[]){
//     Horse horse = new Horse();
//     Chicken chicken = new Chicken();
//     horse.walk(); //abstract method 
//     chicken.walk();
//     horse.eat(); // non abstract method
//     chicken.eat();
// }
// }

//Non pure abstraction

// interface Animal{
//     int eyes = 2;
//     public void walk();
// }

// interface Herbivore{

// }

// class Horse implements Animal, Herbivore{//multiple inheritamce
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Oops{
//     public static void main(String agrs[]){
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }
class Student{
    String name;
    static String school;
}


 
class Oops{
    public static void main(String[] args) {
        Student.school = "SRM";
        System.out.println(Student.school);
    }
}