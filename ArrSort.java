import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrSort {
    public static void main(String[] args) {
       int length;
       int a=1;
        Scanner scn=new Scanner(System.in);
        System.out.print("Dizinin Boyutu Giriniz:");
        length=scn.nextInt();
       int Arr[]=new int[length];
        System.out.println("Dizinin Elamanlarını Giriniz:");
        for (int i=0;i<=length-1;i++){
            System.out.print((a++)+".Elamanı=");
            Arr[i]=scn.nextInt();

        }
        Arrays.sort(Arr);
        System.out.println("Sıralama:"+Arrays.toString(Arr));












}
    }