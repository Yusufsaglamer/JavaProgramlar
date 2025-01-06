package Giris;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armt,elma,dmt,muz,ptlcn,kiloA,kiloE,kiloD,kiloM,kiloP,a=2.14,e=3.67,d=1.11,m=0.95,p=5,toplam;

        Scanner inp=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        kiloA=inp.nextDouble();

        System.out.print("Elma Kaç Kilo:");
        kiloE=inp.nextDouble();

        System.out.print("Domates Kaç Kilo:");
        kiloD=inp.nextDouble();

        System.out.print("Muz Kaç Kilo:");
        kiloM=inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo:");
        kiloP=inp.nextDouble();

        armt=a*kiloA;
        elma=e*kiloE;
        dmt=d*kiloD;
        muz=m*kiloM;
        ptlcn=p*kiloP;
        toplam=(armt+elma+dmt+muz+ptlcn);

        System.out.println("Toplam Tutar:"+toplam +" TL") ;









    }
}
