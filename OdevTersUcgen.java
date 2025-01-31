package Giris;
import java.util.Scanner;
public class OdevTersUcgen {
    public static void main(String[] args) {

        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz:");
        n=inp.nextInt();

        for (int i=1;i<=n;i++){
            int star=n-i;
            for (int k=1;k<=2*star-1;k++)
                System.out.print("*");
            System.out.println();
        }

    }
}
