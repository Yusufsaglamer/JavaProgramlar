package Giris;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year,kosul1,kosul2,kosul3;

        Scanner input=new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        year=input.nextInt();

       kosul1=year%4;
       kosul2=year%100;
       kosul3=year%400;



        if (kosul2==0) {
            if (kosul3 == 0) {
                System.out.println(year + " bir artık yıldır!");
            }else {
                System.out.println(year + " bir artık yıl değildir!");
            }

        } else if (!(kosul3==0)) {
            if (kosul1==0){
                System.out.println(year + " bir artık yıldır!");
            }else {
                System.out.println(year + " bir artık yıl değildir!");
            }

        }else {
            System.out.println(year + " bir artık yıl değildir!");
        }


    }
}
