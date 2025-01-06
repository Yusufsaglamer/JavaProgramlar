package Giris;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo,boy,vki;

        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu Giriniz: ");
        kilo=inp.nextDouble();

        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+vki);




    }
}
