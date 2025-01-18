package Giris;
import java.util.Scanner;
public class SıcaklıgaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz:");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if ((heat>=5) && (heat <=15) ) {
            System.out.println("Sinemaya gidebilirsiniz.");
            if ((heat>=10) && (heat<=15)) {
                System.out.println("1Pikniğe gidebilirsiniz.");
            }

        } else if ((heat>15) && (heat<=25)){
                System.out.println("Pikniğe gidebilirsiniz.");

        }else {
                System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }
}
