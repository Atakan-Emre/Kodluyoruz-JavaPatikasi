import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        int minDifference = Math.abs(number - list[0]);
        int closestGreater = list[0];
        int closestSmaller = list[0];

        for (int i : list) {
            int currentDifference = Math.abs(number - i);

            if (currentDifference < minDifference && i > number) {
                minDifference = currentDifference;
                closestGreater = i;
            }

            if (currentDifference < minDifference && i < number) {
                minDifference = currentDifference;
                closestSmaller = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestGreater);

    }
}
