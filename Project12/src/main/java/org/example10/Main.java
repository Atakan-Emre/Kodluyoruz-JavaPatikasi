package org.example10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int enBuyuk = Integer.MIN_VALUE; // Başlangıçta en küçük değeri alır
        int enKucuk = Integer.MAX_VALUE; // Başlangıçta en büyük değeri alır

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En Büyük Sayı: " + enBuyuk);
        System.out.println("En Küçük Sayı: " + enKucuk);

        scanner.close();
    }
}