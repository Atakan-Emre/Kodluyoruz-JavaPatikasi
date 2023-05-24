package org.example10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        boolean artikYil = false;

        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
            artikYil = true;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }
}