package Giris;
import java.util.Scanner;
public class DeseneGoreMetot {
    static int dizi(int n,int y){
        if (n<0||n==0){
            System.out.println(n);
            return sum(n+5,y);

    }
        System.out.println(n);
        return dizi(n-5,y);
    }
    static int sum(int n, int y){
        if (n!=y ){
            System.out.println(n);
            return sum(n +5,y);
        }
        return n;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz:");
        int number=input.nextInt();
        System.out.println(dizi(number,number));



    }
}
