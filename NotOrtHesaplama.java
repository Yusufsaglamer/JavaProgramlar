package Giris;
import java.util.Scanner;
public class NotOrtHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp=new Scanner(System.in);

        System.out.print(" Matematik Notunuz :  ");
         mat=inp.nextInt();

        System.out.print(" Fizik Notunuz :  ");
        fizik=inp.nextInt();

        System.out.print(" Kimya Notunuz :  ");
        kimya=inp.nextInt();

        System.out.print(" Türkçe Notunuz :  ");
        turkce=inp.nextInt();

        System.out.print(" Tarih Notunuz :  ");
        tarih=inp.nextInt();

        System.out.print(" Müzik Notunuz :  ");
        muzik=inp.nextInt();

        double ort =(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ort);
       String sonuc=(ort>=60)?"Geçti":"Kaldı";
        System.out.println(sonuc);





    }
}
