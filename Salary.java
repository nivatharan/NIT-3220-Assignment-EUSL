// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Salary{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        String Name, Designation, Month;
        double BasicSalary, TotalSalary, Tax, NetSalary;
       
        System.out.print("Enter the Name: ");
        Name = input.next();
       
        System.out.print("Enter the Designation: ");
        Designation = input.next();
       
        System.out.print("Enter the Month: ");
        Month = input.next();
       
        System.out.print("Enter the Basic Salary: ");
        BasicSalary = input.nextDouble();
       
        TotalSalary = BasicSalary + (BasicSalary * 1.5);
       
        if (TotalSalary > 200000){
            Tax = TotalSalary * 0.24;
        }
        else if (TotalSalary > 50000){
            Tax = TotalSalary * 0.16;
        }
        else{
            Tax = TotalSalary * 0.08;
        }
       
        NetSalary = TotalSalary - Tax;
       
       
        System.out.println("\n\n***Pay Advice***");
        System.out.println("Name: "+Name);
        System.out.println("Designation: "+Designation);
        System.out.println("Month: "+Month);
        System.out.println("Basic Salary: "+BasicSalary);
        System.out.println("Total Salary: "+TotalSalary);
        System.out.println("Tax: "+Tax);
        System.out.println("Net Salary is: "+NetSalary);
       
       
    }
}