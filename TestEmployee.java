import java.util.Scanner;

import Codes.Employee;
import Codes.MessageReader;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x; // x is a variable of int type
        x = 10; // Assign
        Employee emp; // emp is a variable of Employee Type
        //emp = new Employee();
        //emp.Employee();
        // emp.id = -1001;
        // emp.name = "Ram";
        // emp.salary = -9999;
        // Read from Message Bundle
        MessageReader mr = new MessageReader("en", "US");
        System.out.println(mr.getMessage("id.msg"));
        int id = scanner.nextInt();
        System.out.println(mr.getMessage("name.msg"));
        String name = scanner.next();
        System.out.println(mr.getMessage("salary.msg"));
        double salary = scanner.nextDouble();
    
        // System.out.println("Enter the Id ");
        // int id = scanner.nextInt();
        // System.out.println("Enter the Name");
        // String name = scanner.next();
        // System.out.println("Enter the Salary");
        // double salary = scanner.nextDouble();
        emp = new Employee(id, name, salary);
        emp.setSalary(emp.getSalary()+ 20000);
        System.out.println(emp.getName());
        //emp = new Employee();
        //emp.takeInput(id, name, salary);
        emp.print();
        scanner.close();
        // System.out.println(emp.id);
        // System.out.println(emp.name);
        // System.out.println(emp.salary);
        // System.out.println("*********************");
        // Employee shashi = new Employee();
        // shashi.takeInput(1002, "Shashi", 99999);
        // shashi.print();
        // System.out.println(shashi.id);
        // System.out.println(shashi.name);
        // System.out.println(shashi.salary);

    }
}
