import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 5, 6, 2, 4, 7, 8, 6, 8, 9};
        Map<Integer, Integer> numberCounts = new HashMap<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Tekrar eden çift sayı: " + entry.getKey());
            }
        }
    }
}
