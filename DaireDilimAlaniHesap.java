package Giris;
import java.util.Scanner;

public class DaireDilimAlaniHesap {
    public static void main(String[] args) {

        double pi=3.14,r,aci,sonuc;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r=inp.nextDouble();

        System.out.print("Merkez Açını Ölçüsünü Giriniz: ");
        aci=inp.nextDouble();

        sonuc=(pi*(r*r)*aci)/360;
        System.out.println("Daire Dilim Alanı: "+sonuc);







    }
}
