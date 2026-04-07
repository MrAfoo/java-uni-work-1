// in this file there are examples about break and continue statement in java

public class break_continue {
    public static void main(String[] args) {
        // break statement example
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            System.out.println(i);
        }

        // continue statement example
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; // skip the rest of the loop when j is even
            }
            System.out.println(j);
        }
    }
}