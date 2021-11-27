import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdv, kdvli, kdv18=18, kdv8=8;

        Scanner input = new Scanner(System.in);

        System.out.print("Ana paranızı Giriniz : ");
        tutar = input.nextDouble();

        boolean kosul1 = tutar >=0;
        boolean kosul2 = tutar <=1000;
        boolean sonuc = kosul1 && kosul2;


        System.out.println("KDV'siz Tutar :" + tutar);

        kdv = sonuc ? kdv18 : kdv8;
        kdvli = tutar + ((tutar * kdv)/100);


        System.out.println("KDV'li Fiyat :" + kdvli);
        System.out.println("KDV tutarı :" + kdv);



    }
}
