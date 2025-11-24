import java.lang.*;
class Rectangle
{
  int length,breadth;
void getdata(int x,int y)
  {
     length=x;
     breadth=y;
   }
   int rectarea()
   {
      int area;
      area=length*breadth;
      return(area);
    }
}

public class p17
{
  public static void main(String args[])
   {
      int a1,a2;
      Rectangle r1=new Rectangle();
      Rectangle r2=new Rectangle();
 
      r1.length=10;
      r2.breadth=20;
      a1=r1.length*r1.breadth;
      
      r2.getdata(20,30);
      a2=r2.rectarea();
 
      System.out.println("Area is"+a1);
      System.out.println("Area is"+a2);
      }
}

/*

| **Component**             | **Description**                                                                                                                |
| ------------------------- | ------------------------------------------------------------------------------------------------------------------------------ |
| **Class Name**            | `Rectangle` — Represents a rectangle with length and breadth.                                                                  |
| **Data Members**          | `int length` — stores length <br> `int breadth` — stores breadth                                                               |
| **getdata(int x, int y)** | Method to initialize `length` and `breadth` using passed values.                                                               |
| **rectarea() Method**     | Calculates area using formula `length * breadth` and returns the result.                                                       |
| **Main Class**            | `p17` — contains the `main()` method.                                                                                          |
| **Object Creation**       | `Rectangle r1 = new Rectangle();` <br> `Rectangle r2 = new Rectangle();`                                                       |
| **Direct Assignment**     | `r1.length = 10;` <br> `r2.breadth = 20;` — Only one dimension is set for each rectangle initially.                            |
| **Area Calculation 1**    | `a1 = r1.length * r1.breadth;` <br> Since `r1.breadth` is not initialized, it defaults to **0**, giving area = **10 × 0 = 0**. |
| **Setting r2 Values**     | `r2.getdata(20, 30);` — Initializes `length = 20` and `breadth = 30`.                                                          |
| **Area Calculation 2**    | `a2 = r2.rectarea();` → returns **20 × 30 = 600**.                                                                             |
| **Output**                | Prints: <br> `Area is 0` (from r1) <br> `Area is 600` (from r2)                                                                |
| **Purpose**               | Demonstrates class usage, method invocation, direct variable access, and object manipulation in Java.                          |

*/  

