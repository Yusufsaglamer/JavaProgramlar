package Giris;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        String user,password,password2;
        int select;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        user= input.nextLine();

        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if (user.equals("patika") && password.equals("patika123")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Hatalı Giriş Yaptınız!!");
            System.out.print("Şifreyi Sıfırlmak istermisiniz? 1-Evet / 2-Hayır: " );
            select=input.nextInt();
            Scanner input2 =new Scanner(System.in);

                switch (select) {
                   case 1:
                       System.out.print("Yeni Şifreyi Giriniz: ");
                       password2= input2.nextLine();
                        if (password2.equals("patika123")){
                            System.out.println("Yeni şifreniz eski şifre ile aynı olamaz,lütfen yeni şifre yazınız. ");
                        }else {
                            System.out.println("Şifreniz Oluşturuldu.");
                        }
                       break;
                    case 2:
                        System.out.println("Tekrar Giriş Yapınız");
                        break;
                }

                }




                }
        }

