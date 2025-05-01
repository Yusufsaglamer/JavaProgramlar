import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        boolean matris= true;
        Scanner scn = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz * | *");
        while (matris) {
            System.out.print("Lütfen Satır Sayısını giriniz:");
            row = scn.nextInt();
            System.out.print("Lütfen Sütun Sayısını giriniz:");
            col = scn.nextInt();
            if (row >= 2 && col >= 2) {
                matris=false;
                mineSweeper mine = new mineSweeper(row, col);
                mine.run();
            } else {
                System.out.println("Satır ve Sütun Sayısı en az 2 olmalı!!");
                matris = true;
            }
        }



            }




    }



