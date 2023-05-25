package org.example10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogruSifre = "12345"; // Doğru şifre

        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifreyi girin: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }

        scanner.close();
    }
}