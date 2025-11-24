import java.io.*;

public class p27 implements AutoCloseable {
    // Resource cleanup logic
    @Override
    public void close() {
        System.out.println("Cleaning up resources explicitly");
    }

    public static void main(String[] args) {
        try (p27 d = new p27()) {
            System.out.println("Using the p27 object");
        } // The `close()` method will automatically be called here
    }
}

/*
| **Component**                | **Description**                                                                                                             |
| ---------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| **Class Name**               | `p27` — Implements AutoCloseable to allow automatic resource cleanup.                                                       |
| **Implements**               | `AutoCloseable` — Enables use of the class inside a try-with-resources block.                                               |
| **close() Method**           | Overridden from AutoCloseable; automatically called after exiting the try block. Prints “Cleaning up resources explicitly”. |
| **main Method**              | Entry point of the program. Contains try-with-resources block.                                                              |
| **try-with-resources Block** | `try (p27 d = new p27()) { ... }` — ensures that the `close()` method is executed automatically.                            |
| **Inside try Block**         | Prints “Using the p27 object” to indicate object usage.                                                                     |
| **Automatic Cleanup**        | After the try block ends, Java calls `close()` without needing explicit cleanup code.                                       |
| **Purpose**                  | Demonstrates resource management using AutoCloseable and try-with-resources in Java.                                        |
| **Output**                   | `Using the p27 object` <br> `Cleaning up resources explicitly`                                                              |
*/
