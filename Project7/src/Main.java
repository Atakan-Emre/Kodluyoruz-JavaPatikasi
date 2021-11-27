import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double kg , m ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        kg = inp.nextDouble();
        System.out.print("Boyunuzu Giriniz (metre cinsinden) : ");
        m = inp.nextDouble();

        double total =  kg / (m * m) ;

        System.out.println("Vücut kitle İndeksiniz : " + total);



    }
}
