// 2. ID-wise sum (Without HashMap)

public class IdWiseSum {
    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102};
        int[] amounts = {500, 300, 200, 150, 100};

        int[] uniqueIds = new int[5];
        int[] totalSums = new int[5];
        int count = 0;

        for (int i = 0; i < ids.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (uniqueIds[j] == ids[i]) {
                    totalSums[j] += amounts[i];
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueIds[count] = ids[i];
                totalSums[count] = amounts[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("ID " + uniqueIds[i] + " Total: " + totalSums[i]);
        }
    }
}