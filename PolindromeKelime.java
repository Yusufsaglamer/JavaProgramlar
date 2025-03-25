package Giris;

public class PolindromeKelime {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static  boolean isPalindrome2(String str){
         String reverse="";
        //System.out.println("a");
         for (int i=str.length()-1 ;i>=0;i--){
            // System.out.println("b");
             reverse+=str.charAt(i);
            // System.out.println("c");

         }

         if (str.equals(reverse)){
            // System.out.println("d");
             return  true;
         }else
             return false;
         // burda a b c d ile denediimiz bu dönfüler veya kodlar çalışıyormu
        // bu döngüşere giriyormu yazdığımız bu şekilde hata nerde anlayabişiriz.

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome2("kayak"));

    }
}
