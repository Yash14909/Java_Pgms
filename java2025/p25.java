import java.util.Scanner; 

class Tender {
    int cost;
    String cname;
    Scanner in = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Company Name:");
        cname = in.nextLine(); // Use nextLine() to read full company name
        System.out.println("Enter the cost:");
        cost = in.nextInt();
        in.nextLine(); // Consume newline to avoid issues with next input
    }

    void display() {
        System.out.println("Company Name: " + cname);
        System.out.println("Bid Cost: " + cost);
    }
}

public class p25 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of companies:");
        int noc = in.nextInt();
        in.nextLine(); // Consume newline

        if (noc <= 0) {
            System.out.println("Invalid number of companies!");
            return;
        }

        // Initialize array of Tender objects
        Tender[] e = new Tender[noc];

        // Collect data
        for (int i = 0; i < noc; i++) {
            e[i] = new Tender(); // Initialize each object
            e[i].getData();
        }

        // Display all tenders
        System.out.println("\nTender Details:");
        for (int i = 0; i < noc; i++) {
            e[i].display();
        }

        // Finding the lowest bid
        int mincost = e[0].cost;
        int loc = 0;
        
        for (int i = 1; i < noc; i++) { // Start from index 1
            if (e[i].cost < mincost) {
                mincost = e[i].cost;
                loc = i;
            }
        }

        // Display the company with the lowest bid
        System.out.println("\nCompany selected with the lowest bid:");
        System.out.println("Company Name: " + e[loc].cname);
        System.out.println("Bid Cost: " + e[loc].cost);

        in.close(); // Close Scanner to prevent resource leak
    }
}
/*
| **Component**                  | **Description**                                                                                   |
| ------------------------------ | ------------------------------------------------------------------------------------------------- |
| **Class Name**                 | `Tender` — Represents company tender information.                                                 |
| **Data Members**               | `int cost` (bid amount) <br> `String cname` (company name)                                        |
| **Scanner Object**             | `Scanner in = new Scanner(System.in)` — takes input inside the class.                             |
| **getData() Method**           | Reads company name using `nextLine()` and bid amount using `nextInt()`. Ensures newline handling. |
| **display() Method**           | Prints company name and bid cost.                                                                 |
| **Main Class**                 | `p25` — contains the `main` method.                                                               |
| **Input: Number of Companies** | User enters `noc`. If noc ≤ 0 → prints error and exits.                                           |
| **Object Array**               | `Tender[] e = new Tender[noc]` — stores tender objects for each company.                          |
| **Data Collection Loop**       | Iterates `noc` times; creates Tender objects and calls `getData()` for each.                      |
| **Display Loop**               | Prints details of all companies using `display()`.                                                |
| **Find Minimum Bid**           | Compares cost values to find lowest bid. Tracks position via `loc`.                               |
| **Output (Lowest Bid)**        | Prints company name and cost of company with the lowest bid.                                      |
| **Scanner close()**            | Closes main `Scanner in` object to prevent resource leak.                                         |
| **Purpose**                    | Demonstrates object arrays, user input handling, and finding minimum values using Java OOP.       |
*/

