// 3. Product-wise sum (With HashMap)

import java.util.HashMap;

public class ProductWiseSum2 {
    public class ProductSumHash {
    public static void main(String[] args) {
        String[] products = {"Apple", "Banana", "Apple", "Orange", "Banana"};
        double[] prices = {10.0, 5.0, 10.0, 8.0, 5.0};

        HashMap<String, Double> map = new HashMap<>();

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], map.getOrDefault(products[i], 0.0) + prices[i]);
        }

        System.out.println("Product Totals: " + map);
    }
}
}