import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        /*double number=Math.random();
        System.out.println(number*100);
        //önce değişkene atadık sonra 0 ile 100 arasında rasgele birsayı çıkarıryoruz.

         */
        Scanner input=new Scanner(System.in);

        Random rand=new Random();
        int number2= rand.nextInt(100);
        System.out.println(number2);

        // buda math random ile aynı işi yapıyor random sınıfını çağırarak yaptık.
        //birde next ınt kullanarak direk integer çevirdik.
        int right=0;
        int selected;
        int []wrong=new int[5];
        boolean isWin=false;
        boolean isFault=false;


        while (right<5){
            System.out.print("Lütfen Tahmininizi Giriniz:");
            selected=input.nextInt();
            if (selected<0||selected>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz!!");
                if (isFault){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan Hak: "+(5-right));

                }else {
                    isFault=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");

                }

                continue;
            }
            if (selected==number2){
                System.out.println("Tebrikler Doğru Tahmin!!"+" Tahmin Ettiğiniz Sayı: "+ number2);
                isWin=true;
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz!!");
                if (selected>number2){
                     System.out.println(selected+" sayısı,gizli sayıdan büyüktür.");
                }else {

                    System.out.println(selected+" sasyısı,gizli sayıdan küçüktür.");
                }
                wrong[right]=selected;
                right++;
                System.out.println("Kalan hakkı:"+(5-right));

            }

            }
        if (!isWin && !isFault){
            System.out.println("Kaybettiniz!!");
            System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));




        }

        System.out.println(number2);


    }
}