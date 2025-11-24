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

public class p30 {
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
| **Component**            | **Description**                                                                     |
| ------------------------ | ----------------------------------------------------------------------------------- |
| **Class Name**           | `Tender` — Represents each company's tender details.                                |
| **Data Members**         | `int cost;` (bid amount) <br> `String cname;` (company name)                        |
| **Scanner Object**       | `Scanner in = new Scanner(System.in);` — Used inside the class for input.           |
| **getData() Method**     | Prompts the user for company name and bid cost; reads input values.                 |
| **display() Method**     | Prints the company name and bid cost on screen.                                     |
| **Main Class**           | `p30` — Contains the `main` method that runs the program.                           |
| **User Input**           | Asks user: *“Enter number of companies”*                                            |
| **Array of Objects**     | `Tender[] e = new Tender[noc];` — Stores Tender objects for each company.           |
| **Data Collection Loop** | For each company: creates a Tender object and calls `getData()`                     |
| **Display Loop**         | Prints each company's tender details using `display()`                              |
| **Finding Lowest Bid**   | Compares all `cost` values to find the minimum; tracks index of lowest bid company. |
| **Output**               | Displays all tender details + name and cost of **company with the lowest bid**.     |
| **Error Handling**       | If number of companies ≤ 0 → prints *“Invalid number of companies!”*                |
| **Closing Scanner**      | `in.close()` avoids resource leak warnings.                                         |
*/
