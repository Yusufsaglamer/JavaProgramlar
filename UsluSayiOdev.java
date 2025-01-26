package Giris;
import java.util.Scanner;
public class UsluSayiOdev {
    public static void main(String[] args) {
        int n,k;
        int total=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü alıncak Sayı:");
        n=inp.nextInt();
        System.out.print("Üs olacak sayı:");
        k=inp.nextInt();

        for (int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println("Cevap="+total);
    }
}
