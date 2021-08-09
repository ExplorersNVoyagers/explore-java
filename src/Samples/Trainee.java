package Samples;

import java.time.LocalDate;

public class Trainee extends Employee {
//    public void display(String name) { // line 2
//        System.out.print(name);
//    }


    protected void display() { // line 5
        System.out.print(" Trainee ");
    }
    public void print(int age) { // line 5
        System.out.print(" Trainee ");
       // return age;
    }
    public static void main1(String[] args) {
//        Trainee trainee = new Trainee();
//        trainee.display(); // line 10
//        trainee.display("Bob"); // line 11
//        trainee.print(10); // line 12

        Employee employee = new Trainee();
        //employee.display(); // line 9

        LocalDate date = LocalDate.parse("2019-03-07");
        LocalDate date1 = LocalDate.of(2019, 12, 07);
        System.out.println(date.getYear()+date1.getYear()
                +" , "+date.compareTo(date1)+" , "+date1.compareTo(date));
    }

    public static void main(String[] args) {
        displayRegn("Hockey"); // Line 1
        displayRegn("Kho-Kho", 1, 2, 3);
    }

    public static void displayRegn(String nameOfSport, int... iDs) {
        System.out.print(" Registration for " + nameOfSport + ":");
        for (int i = 0; i < iDs.length; i++) {
            System.out.print(iDs[i] + " ");
        }
    }
}
