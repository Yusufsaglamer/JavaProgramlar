import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int n=0;
        int list[]=new int[n];
        int sayi;



        Scanner inp=new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:");
        n=inp.nextInt();
        list=new int[n];
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". sayıyı giriniz:");
            sayi=inp.nextInt();
            list[i]=sayi;


        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("Min Sayı:"+list[0]);
        System.out.println("Max Sayı:"+list[n-1]);



    }




}
