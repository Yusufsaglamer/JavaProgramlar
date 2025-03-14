package Giris;

public class ÖdevHarmonik {
    public static void main(String[] args) {
        int harmoniksum=0;

        int[] lis={1,2,3,4,5};
        for (int i=0;i<lis.length;i++){
            harmoniksum+=1/lis[i];
        }
        int avarage= lis.length/harmoniksum;
        System.out.println(avarage);

    }
}
