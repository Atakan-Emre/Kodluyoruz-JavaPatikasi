import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r , a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Daire merkez acısı giriniz : ");
        a = inp.nextInt();

        double total = (pi * (r*r) * a) / 360 ;
        System.out.println("Dairenin alanı : " + total);


    }
}
