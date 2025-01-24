package Giris;
import java.util.Scanner;
public class CiftSayıBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int k;
        System.out.print("Sayı Giriniz:");
        k=input.nextInt();

        for (int i=0;i<=k;i++){
            if ((i%3==0) && (i%4==0)){
                System.out.println(i);

            }
        }



    }
}
