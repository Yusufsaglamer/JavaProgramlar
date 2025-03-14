package Giris;

public class ÖdevHarmonik {
    public static void main(String[] args) {
        double harmoniksum=0.0;

        double [] list={1,2,3,4,5};
        for (int i=0;i<list.length;i++){
            harmoniksum+= 1/(list[i]);

        }
        double avarage= list.length/harmoniksum;
        System.out.println(avarage);



    }
}
