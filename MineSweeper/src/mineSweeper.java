import java.util.Random;
import java.util.Scanner;

public class mineSweeper {
    int rowNumber;
    int colNumber;
    int size;
    String[][] map;
    String[][] board;
    boolean game = true;
    Scanner scn = new Scanner(System.in);
    Random rnd = new Random();


    mineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;


    }



    public void run() {
        int row, col, success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyuna Başladı!");
        while (game) {
            print(board);
            System.out.print("Satır:");
            row = scn.nextInt();
            System.out.print("Sütun:");
            col = scn.nextInt();
            if (row < 0 || row >= rowNumber) {
                System.out.println("Geçersiz Kod");
                continue;
            }
            if (board[row][col]=="0"||board[row][col]=="1"||board[row][col]=="2"||board[row][col]=="3"||board[row][col]=="4"){
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin");
                continue;
            }

            if (map[row][col] != "*") {
                check(row, col);
                success++;
                if (size == success + (size / 4)) {
                    System.out.println("Oyunu Kazandınız");
                    print(board);
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over!");
            }
        }

    }


    public void check(int r, int c) {


        if (map[r][c] == "-") {
            int number = 0;

            if ((c < colNumber - 1) && (map[r][c + 1] == "*")) {
                number++;
                board[r][c] = Integer.toString(number);


            } else {
                board[r][c] = "0";
            }

            if ((r < rowNumber - 1) && (map[r + 1][c] == "*")) {
                number++;
                board[r][c] = Integer.toString(number);


            } else {
                board[r][c] = "0";
            }
            if ((r > 0) && (map[r - 1][c] == "*")) {
                number++;
                board[r][c] = Integer.toString(number);

            } else {
                board[r][c] = "0";
            }
            if ((c > 0) && (map[r][c - 1] == "*")) {
                number++;
                board[r][c] = Integer.toString(number);

            } else {
                board[r][c] = "0";
            }

        }

    }

    public void prepareGame() {
        int randRow;
        int randCol;
        int count = 0;


        while (count != (size / 4)) {
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(colNumber);
            if (map[randRow][randCol] != "*") {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }


    public void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = "-";

                }

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();


        }
    }

}







