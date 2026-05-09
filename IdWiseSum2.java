// 4. ID-wise sum (With HashMap)

import java.util.HashMap;

public class IdWiseSum2 {
    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102};
        int[] amounts = {500, 300, 200, 150, 100};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ids.length; i++) {
            map.put(ids[i], map.getOrDefault(ids[i], 0) + amounts[i]);
        }

        for (int id : map.keySet()) {
            System.out.println("ID " + id + " Total: " + map.get(id));
        }
    }
}