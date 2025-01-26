package Giris;
import java.util.Scanner;
public class BasamakDegerlerininToplami {
    public static void main(String[] args) {
        int number,basValue,tempNumber;
        int result=0;


        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz:");
        number=inp.nextInt();

        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            result+=basValue;
            tempNumber/=10;

        }
        System.out.println("Basamak Değerlerinin toplamı="+result);


    }
}
