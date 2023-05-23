package org.example;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Mesafeyi (KM) girin: ");
            int mesafe = scanner.nextInt();

            System.out.print("Yaşı girin: ");
            int yas = scanner.nextInt();

            System.out.print("Yolculuk tipini girin (1 - Tek Yön, 2 - Gidiş-Dönüş): ");
            int yolculukTipi = scanner.nextInt();

            // Veri girişi kontrolü
            if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
                System.out.println("Hatalı Veri Girdiniz!");
                return;
            }

            double birimFiyat = 0.10; // Mesafe başına ücret (0,10 TL/KM)
            double toplamFiyat = mesafe * birimFiyat;

            // Yaş indirimleri
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            // Yolculuk tipine göre indirim
            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");

            scanner.close();

    }
}