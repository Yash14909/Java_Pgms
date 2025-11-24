import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
class pattern
{
 public static void main(String[] args) 
 {
 System.out.println("JAVA PATTERN PRINTING");
 int rows=5; 
 System.out.println("Here is your pattern....!!!"); 
 for (int i = rows; i >= 1; i--) 
 {
 for (int j = 1; j <= i; j++)
 {
 System.out.print(j+" ");
 } 
 System.out.println();
 }
 }

 /*
| **Component**                | **Description**                                                                                                                                                            |
| ---------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Package Imports**          | `java.lang`, `java.util`, `java.io`, `java.util.Scanner` — although Scanner isn’t used in this program, these imports allow access to core Java utilities and I/O classes. |
| **Class Name**               | `pattern` — contains the `main` method and the pattern-printing logic.                                                                                                     |
| **main Method**              | Entry point of the program: `public static void main(String[] args)`                                                                                                       |
| **Initial Print Statements** | Displays: “JAVA PATTERN PRINTING” and “Here is your pattern….!!!”                                                                                                          |
| **Variable Declared**        | `int rows = 5;` — number of rows for the pattern.                                                                                                                          |
| **Outer Loop**               | `for (int i = rows; i >= 1; i--)` — controls the number of lines. Starts from 5 down to 1.                                                                                 |
| **Inner Loop**               | `for (int j = 1; j <= i; j++)` — prints numbers from 1 up to the current row number `i`.                                                                                   |
| **Pattern Printed**          | A descending numeric pattern: <br>5 4 3 2 1 → 1 2 3 4 5 for row 5? Actually printed: <br>1 2 3 4 5<br>1 2 3 4<br>1 2 3<br>1 2<br>1                                         |
| **Purpose**                  | To demonstrate nested loops and print a decreasing numeric triangle.                                                                                                       |
| **Output**                   | `<br>JAVA PATTERN PRINTING<br>Here is your pattern....!!!<br>1 2 3 4 5<br>1 2 3 4<br>1 2 3<br>1 2<br>1<br>`                                                                |
*/

}
