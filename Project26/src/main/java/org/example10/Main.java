package org.example10;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int power(int base, int exponent) {
        if (exponent != 0) {
            // recursion step
            return (base * power(base, exponent - 1));
        } else {
            // base case: anything to the power of 0 is 1
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();

        System.out.print("Üs değerini giriniz :");
        int exponent = scan.nextInt();

        int result = power(base, exponent);

        System.out.println("Sonuç : " + result);
    }
}