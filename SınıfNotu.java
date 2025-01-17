package Giris;
import java.util.Scanner;
public class SınıfNotu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ort;


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



        if (mat<0 || mat>100){

            ort =(fizik+kimya+turkce+tarih+muzik)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);

        } else if (fizik<0 || fizik>100 ) {
            ort =(mat+kimya+turkce+tarih+muzik)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);

        } else if (kimya<0 || kimya>100) {
            ort =(mat+fizik+turkce+tarih+muzik)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);

        } else if (turkce<0 || turkce>100) {
            ort =(mat+fizik+kimya+tarih+muzik)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);

        } else if (tarih<0 || tarih>100) {
            ort =(mat+fizik+kimya+turkce+muzik)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);


        } else if (muzik<0 || muzik>100) {
            ort =(mat+fizik+kimya+turkce+tarih)/5;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);

        }else {
            ort =(mat+fizik+kimya+turkce+tarih+muzik)/6;
            String sonuc=(ort>=50)?"Geçti":"Kaldı";
            System.out.println(sonuc);
        }




    }
}
