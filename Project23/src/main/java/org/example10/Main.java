package org.example10;

public class Main {
    public static void main(String[] args) {
        int number = 9889;  // kontrol etmek istediğiniz sayı
        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

