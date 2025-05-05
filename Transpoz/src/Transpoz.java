import java.util.Arrays;

public class Transpoz {
    int [][] arr;
    int [][] arrTrans;
    int rownumber;
    int colnumber;
    int count=1;
    int count2=1;


    Transpoz(int row, int col){
        this.rownumber=row;
        this.colnumber=col;
        this.arr=new int[row][col];
        this.arrTrans=new int[col][row];


    }

    public void Arr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==0){
                    arr[i][j]=count++;
                }if (arr[i][j]>=10) {

                    System.out.print(arr[i][j]+ " ");
                }else
                    System.out.print(arr[i][j]+"  ");


            }
            System.out.println();

        }
    }

    public void TranspozArr(){
        for (int i = 0; i < arrTrans.length; i++) {
            for (int j = 0; j < arrTrans[i].length; j++) {
                if (arrTrans[i][j]==0){
                    arrTrans[i][j]=arr[j][i];
                }if (arrTrans[i][j]>=10) {

                    System.out.print(arrTrans[i][j]+ " ");
                }else
                    System.out.print(arrTrans[i][j]+"  ");


            }
            System.out.println();

        }
    }
    }


