package Giris;
import java.util.Scanner;

public class ÜcgenAlan {
    public static void main(String[] args) {
        int a,b,c,cevre,u;
        double alan;
        Scanner inp=new Scanner(System.in);

        System.out.print("A değerini giriniz: ");
        a=inp.nextInt();

        System.out.print("B değerini giriniz: ");
        b=inp.nextInt();

        System.out.print("C değerini giriniz: ");
        c=inp.nextInt();

        cevre=(a+b+c);
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı:"+alan);



    }
}
