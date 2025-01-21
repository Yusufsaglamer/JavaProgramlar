package Giris;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, select;
        Scanner input = new Scanner(System.in);

        double normalTutar, indirimliTutar, yasIndirimi, yonIndirimi, toplamTutar;

        System.out.print("Mesafeyi Giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yas Bilgisini Giriniz:");
        yas = input.nextInt();

        System.out.println("Yolculuk Tipini Belirtiniz:\n1-Çift Yön\n2-Tek Yön");
        select = input.nextInt();

        normalTutar = mesafe * 0.10;
        toplamTutar=normalTutar;

        switch (select) {
            case 1:
                System.out.println("Çift Yön");

                if (yas < 12) {

                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    yonIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - yonIndirimi);


                } else if (yas > 12 && yas < 24) {

                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    yonIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - yonIndirimi);

                } else if (yas > 65) {

                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    yonIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - yonIndirimi);


                } else {

                    yonIndirimi = normalTutar* 0.20;
                    toplamTutar = (normalTutar - yonIndirimi);

                }

                break;


            case 2:
                System.out.println("Tek Yön");

                if (yas < 12) {

                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    toplamTutar=indirimliTutar;


                } else if (yas > 12 && yas < 24) {

                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    toplamTutar=indirimliTutar;


                } else if (yas > 65) {

                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = (normalTutar - yasIndirimi);
                    toplamTutar=indirimliTutar;



                } else {

                    toplamTutar=normalTutar;

                }
                break;


            default:
                System.out.println("Hatalı Giriş Yaptınız!");

        }

        System.out.println("Bilet Fiyatınız:"+ toplamTutar);


    }

}