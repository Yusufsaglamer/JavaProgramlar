package Giris;
import java.util.Scanner;
public class AsalSayiBulmaRec {
    static int isPrime(int number,int divisor){
        if (divisor==1){
            return 1;
        } else if (number%divisor==0) {
            return 0;
        }else{
        return isPrime(number,divisor-1);
        }


    }
    public static void main(String[] args) {
       int number,prime;
       Scanner input=new Scanner(System.in);
        System.out.print("Pozitif Bir Sayı Giriniz:");
        number=input.nextInt();
        prime=isPrime(number,number/2);

        if (prime==1){
            System.out.println(number+" sayisi asaldir");
        }else {
            System.out.println(number+" sayisi asal değildir");
        }



    }
}
