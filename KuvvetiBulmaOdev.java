package Giris;
import java.util.Scanner;
public class KuvvetiBulmaOdev {
    public static void main(String[] args) {
        int n;

        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz:");
        n=inp.nextInt();

        for (int i=1;i<=n;i*=4){
            System.out.println(i);
        }
        for (int j=5;j<=n;j*=5){
            System.out.println(j);
        }


    }
}
