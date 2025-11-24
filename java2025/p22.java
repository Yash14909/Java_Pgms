// Rectangle class moved to Rectangle.java

public class p22 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        int area1 = rect1.rectArea();
        System.out.println("Area is=" + area1);

        Rectangle rect2 = new Rectangle();
        int area2 = rect2.rectArea();
        System.out.println("Area is=" + area2);
    }

}

/*
| **Component**          | **Description**                                                                                                                     |
| ---------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| **Class Used**         | `Rectangle` — Defined in a separate file `Rectangle.java`. Contains dimensions and area method.                                     |
| **Rectangle Object 1** | `Rectangle rect1 = new Rectangle(10, 20);` <br> Creates a rectangle with length = 10, breadth = 20 using parameterized constructor. |
| **Area Calculation 1** | `rect1.rectArea()` — Calculates area using formula `length × breadth`.                                                              |
| **Output 1**           | Prints: `"Area is=" + area1`.                                                                                                       |
| **Rectangle Object 2** | `Rectangle rect2 = new Rectangle();` <br> Creates rectangle using default constructor (likely initializes default values).          |
| **Area Calculation 2** | `rect2.rectArea()` — Computes area using default dimension values.                                                                  |
| **Output 2**           | Prints: `"Area is=" + area2`.                                                                                                       |
| **main() Method**      | Entry point of program. Creates Rectangle objects and displays their areas.                                                         |
| **Purpose**            | Demonstrates use of separate class files, constructors (default + parameterized), and method calling in OOP.                        |
| **Expected Behavior**  | Area for rect1 → `10 × 20 = 200` <br> Area for rect2 → depends on default values in Rectangle class.                                |
*/
