package Giris;
import java.util.Scanner;
public class KombinasyonBulma {
    public static void main(String[] args) {
        int n,r,combination;
        int total=1;
        int total2=1;
        int total3=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("N değerini giriniz:");
        n=inp.nextInt();
        System.out.print("R değerini giriniz:");
        r=inp.nextInt();

        for (int i=1;i<=n;i++){
            total=i*total;
        }
        for (int j=1;j<=r;j++){
            total2=j*total2;

        }
        for (int k=1;k<=(n-r);k++){
            total3=k*total3;
        }

        combination=(total)/(total2*total3);
        System.out.println("C("+n+","+r+")="+combination);

    }
}
