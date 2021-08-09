package Samples;

public class Student extends Person{
//    public Student(){
//        System.out.println("Student");
//    }

    public  Student(String name){
        super(name);
    }
    public static void main(String[] args) { // line 11
        new Person("Bob");
    }
}

