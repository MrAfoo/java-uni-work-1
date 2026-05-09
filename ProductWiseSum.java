//1. Product-wise sum (Without HashMap)

public class ProductWiseSum {
    public static void main(String[] args) {
        String[] products = {"Apple", "Banana", "Apple", "Orange", "Banana"};
        double[] prices = {10.0, 5.0, 10.0, 8.0, 5.0};

        String[] uniqueProducts = new String[5];
        double[] totalSums = new double[5];
        int count = 0;

        for (int i = 0; i < products.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (uniqueProducts[j].equals(products[i])) {
                    totalSums[j] += prices[i];
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueProducts[count] = products[i];
                totalSums[count] = prices[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(uniqueProducts[i] + ": " + totalSums[i]);
        }
    }
}