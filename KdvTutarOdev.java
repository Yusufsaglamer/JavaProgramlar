package Giris;
import java.util.Scanner;

public class KdvTutarOdev {
    public static void main(String[] args) {

        double ucret,kdvli,kdvtutari,kdv;

        Scanner inp=new Scanner(System.in);

        System.out.print(" Ücret tutarı Giriniz : ");
        ucret=inp.nextDouble();

        kdv=(ucret<=1000)?0.18:0.08;

        System.out.println(" KDVsiz Tutar:"+ucret);

        kdvli=(ucret*kdv)+ucret;
        System.out.println(" KDV'li Fiyat : "+kdvli);

        kdvtutari=kdvli-ucret;
        System.out.println(" KDV Tutarı : "+ kdvtutari);

    }
}
