package Giris;
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
         String userName,password;
         Scanner input=new Scanner(System.in);
         int right=3;
         int balance=1500;
         int select;
         int price;

        while (right>0){

            System.out.print("Kullanıcı Adınız:");
            userName=input.nextLine();
            System.out.print("Parola:");
            password=input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istedğiniz işlemi seçiniz:");
                    select=input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı:");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı:");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye Yetersiz");
                            }else {
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek üzere.");
                            break;
                    }
                }while (select!=4);
                System.out.println("Hatalı bir giriş yaptınız: ");

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar Deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız Bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }
                System.out.println("Kalan Hakkınız:" +right);
            }

        }
    }
}
