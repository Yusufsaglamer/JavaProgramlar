package Giris;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km,kmBasi=2.20,minTutar=20,tutar,baslangicFiyat=10;

        Scanner inp=new Scanner(System.in);

        System.out.print("Km mesafesini giriniz: " );
        km=inp.nextDouble();

        tutar=(kmBasi*km);
        tutar+=baslangicFiyat;
        tutar=(tutar<20)?minTutar:tutar;
        System.out.print("Ödenecek Tuta: "+tutar);







    }
}
