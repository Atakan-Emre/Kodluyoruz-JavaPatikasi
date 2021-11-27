import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        //Değişkenleri yazma

        int a,b,c;
        double cevre,alan,uzunluk;

        //Veri alma

        Scanner girdi = new Scanner(System.in);

        System.out.print("1.Kenarın Uzunluğu : ");
        a = girdi.nextInt();

        System.out.print("2.Kenarın Uzunluğu : ");
        b = girdi.nextInt();

        System.out.print("3.Kenarın Uzunluğu : ");
        c = girdi.nextInt();

        uzunluk = (a + b + c)/ 2;
        cevre = 2 * uzunluk;
        alan = Math.sqrt(uzunluk * (uzunluk - a) *  (uzunluk - b) *  (uzunluk - c));


        System.out.println("Üçgenin Cevresi : " + cevre);
        System.out.print("Üçgenin Alanı : " + alan);

    }
}
