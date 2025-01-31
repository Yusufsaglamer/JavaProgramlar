package Giris;
import java.util.Scanner;
public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("N sayısını Giriniz:");
        n=input.nextInt();

        //Upper Diamond
        for(int i=1;i<=n;i++){
            for (int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Diamond
        for (int l=1;l<=n;l++){
            for (int p=1;p<=l;p++){
                System.out.print(" ");
            }
            int star=(n+1)-l;
            for (int m=1;m<=2*star-3;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
