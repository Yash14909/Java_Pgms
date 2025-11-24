//Write a java class to print Fibonacci series till 100
import java.lang.*;
import java.util.*;

class fibonacci
{
public static void main(String args[]) throws Exception
{
System.out.println("JAVA Fibonacci Series");
int f1=0,f2=1,f3,n,i;
Scanner in = new Scanner(System.in);

/*System.out.print("Enter the Number of Terms");
n=in.nextInt();*/
for(i=1;i<=10;i++)
{

/* if(i==1)
      f3=0;
 else
   if(i==2)
       f3=1;
   else
       f3=f1+f2;
*/
//f3=i<3?1:f1+f2;  old
  f3=i<3?(i==1?0:1):(f1+f2);
System.out.print(+f3+" ");
    f1=f2;
    f2=f3;
       }
    }
 }

/*

| **Component**                   | **Description**                                                                                                                                         |
| ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Class Name**                  | `fibonacci` — Contains the logic to print Fibonacci series.                                                                                             |
| **main() Method**               | Entry point of the program. Prints Fibonacci series till 10 terms (or till value < 100 based on logic).                                                 |
| **Variables Used**              | `int f1 = 0, f2 = 1` → first two Fibonacci numbers <br> `int f3` → stores next term <br> `int i` → loop variable                                        |
| **Scanner Object**              | `Scanner in = new Scanner(System.in);` (currently unused because input is commented).                                                                   |
| **Loop Used**                   | `for(i = 1; i <= 10; i++)` — Generates first 10 Fibonacci numbers.                                                                                      |
| **Ternary Logic for Fibonacci** | `f3 = i < 3 ? (i == 1 ? 0 : 1) : (f1 + f2);` <br> Assigns: <br>– 1st term = 0 <br>– 2nd term = 1 <br>– From 3rd term onward = sum of previous two terms |
| **Updating Values**             | `f1 = f2;` <br> `f2 = f3;` <br> Shifts the terms to compute the next Fibonacci number.                                                                  |
| **Output**                      | Prints Fibonacci series such as: <br> `0 1 1 2 3 5 8 13 21 34`                                                                                          |
| **Purpose**                     | Demonstrates loops, conditional operators (nested ternary), and Fibonacci series generation in Java.                                                    |
| **Comments in Code**            | Shows older logic using `if-else` and optional input-based version (`n`), currently commented out.                                                      |

*/      


