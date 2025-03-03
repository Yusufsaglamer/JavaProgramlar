package Giris;
import java.util.Scanner;
public class ÖdevÜsHesabiRecursiveMethod {
    static int power(int a,int b){
        if (b==0){
            return 1;
        }
        int result=a*power(a,b-1);
        return result;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.print("Taban Değerini Griniz:");
        a=input.nextInt();
        System.out.print("Üs Değerini Giriniz:");
        b=input.nextInt();
        System.out.println("Sonuç:"+power(a,b));


    }
}
