import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] list={10,20,20,10,10,20,5,20};
        int [] frequency=new int[list.length];

        System.out.println("Tekrar Sayıları");
        for (int i=0;i<list.length;i++){
          if (frequency[i]==-1) {
              continue;
            }
            int count=1;
            for (int j=i+1;j<list.length;j++){
                if(list[i]==list[j]){
                    count++;
                    frequency[j]=-1;
                }
                frequency[i]=count;



            }
        }
        for (int i=0;i<list.length;i++){
        if (frequency[i]!=-1) {
            System.out.println(list[i]+" sayısı "+frequency[i]+" kez tekrar etti.");
        }


        }

    }
}