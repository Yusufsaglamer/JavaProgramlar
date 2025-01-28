package Giris;
import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        double n;
        double result=0;


        Scanner inp=new Scanner(System.in);
        System.out.print("N sayısını giriniz:");
        n=inp.nextInt();

        for (double i=1;i<=n;i++){
            result+=(1.0/i);

        }
        System.out.println("Cevap="+result);
    }
}
