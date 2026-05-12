import java.util.*;
import java.io.*;

public class SalesSum {
    public static void main(String[] args) {
        // Topic 37: The HashMap to store Product -> Total Amount
        HashMap<String, Integer> productTotals = new HashMap<>();

        try {
            // Topic 33: Accessing the file
            File file = new File("sales_data.txt");
            Scanner sc = new Scanner(file);

            // Skip the header line
            if (sc.hasNextLine()) {
                sc.nextLine(); 
            }

            // Loop through each line of data
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                
                // Topic 22: Split by space (or \t if it's tab-separated)
                String[] columns = line.split(" "); 
                
                // Extract Product (Index 8) and Amount (Index 9)
                String productName = columns[7];
                int amount = Integer.parseInt(columns[8]);

                // Update the HashMap
                if (productTotals.containsKey(productName)) {
                    // Add new amount to existing total
                    int oldTotal = productTotals.get(productName);
                    productTotals.put(productName, oldTotal + amount);
                } else {
                    // First time seeing this product
                    productTotals.put(productName, amount);
                }
            }
            sc.close();

            // Display Results
            System.out.println("Total Sales per Product:");
            for (String p : productTotals.keySet()) {
                System.out.println(p + ": " + productTotals.get(p));
            }

        } catch (FileNotFoundException e) {
            // Topic 31: Exception Handling
            System.out.println("Error: File not found.");
        }
    }
}