package Giris;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year, kalan;
        String burc = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz:");
        year = input.nextInt();
        kalan = year % 12;

        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!!");

        }
        System.out.println("Çin Zodyağı Burcunuz:"+burc);
    }
}
