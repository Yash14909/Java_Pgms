import java.util.Scanner;

class Employee {
    String name;
    int id;
    int basic;
    Scanner in = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Name:");
        name = in.next();

        System.out.println("Enter ID:");
        id = in.nextInt();

        System.out.println("Enter basic pay:");
        basic = in.nextInt();
    }

    void display() {
        System.out.println("Name                :" + name);
        System.out.println("Id                  :" + id);
        System.out.println("Basic Pay           :" + basic);
    }
}

public class p24 {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        int i;

        for (i = 0; i < 3; i++) {
            e[i] = new Employee();
        }

        for (i = 0; i < 3; i++) {
            e[i].getData();
        }

        for (i = 0; i < 3; i++) {
            e[i].display();
        }
    }
}

/*
| **Component**                  | **Description**                                                                                   |
| ------------------------------ | ------------------------------------------------------------------------------------------------- |
| **Class Name**                 | `Employee` — Represents an employee with basic details.                                           |
| **Data Members**               | `String name` — Employee name <br> `int id` — Employee ID <br> `int basic` — Basic salary         |
| **Scanner Object**             | `Scanner in = new Scanner(System.in)` — Used to accept input inside the Employee class.           |
| **getData() Method**           | Prompts user to enter name, ID, and basic pay. Reads values using `next()` and `nextInt()`.       |
| **display() Method**           | Prints employee details in formatted form.                                                        |
| **Main Class**                 | `p24` — Contains the `main()` method to execute the program.                                      |
| **Employee Array**             | `Employee[] e = new Employee[3]` — Creates an array to hold 3 Employee objects.                   |
| **Object Initialization Loop** | First loop: creates Employee objects using `new Employee()` for each array index.                 |
| **Data Input Loop**            | Second loop: calls `getData()` to accept details for all 3 employees.                             |
| **Display Loop**               | Third loop: calls `display()` to print all employee details.                                      |
| **Purpose**                    | Demonstrates object arrays, user input, class structure, and object-oriented programming in Java. |
| **Output**                     | Displays name, ID, and basic salary for all 3 employees entered by the user.                      |
*/


