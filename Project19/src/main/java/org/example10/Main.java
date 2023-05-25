package org.example10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;

        int toplamNot = 0;
        int dersSayisi = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notunu girin: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                toplamNot += not;
                dersSayisi++;
            }
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplamNot / dersSayisi;

            System.out.println("Ortalama: " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Geçtiniz!");
            } else {
                System.out.println("Kaldınız!");
            }
        } else {
            System.out.println("Hiç ders notu girilmedi!");
        }

        scanner.close();
    }
}