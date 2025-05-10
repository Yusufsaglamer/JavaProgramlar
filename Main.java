import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int number;
     int rule1;
     int rule2;

     for (int i=1;i<=100;i++){
         rule1=i/2;
         rule2=i%2;


         if ( rule1==1){
             System.out.println(i);

         } else if (i>1 && rule2==1) {
             System.out.println(i);

         }else continue;


     }



    }
}