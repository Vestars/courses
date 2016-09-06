package courses.start;

import java.util.Scanner;

public class TicTacToe {
    public static int[][] player1 = new int[2][5];
    public static int[][] player2 = new int[2][4];
    public static int counter = 0;
    public static boolean detector = true;
    public static Scanner sc = new Scanner(System.in);
    public static String[][] xo = new String[][]{{"[0,0]", "[0,1]", "[0,2]"}, {"[1,0]", "[1,1]", "[1,2]"}, {"[2,0]", "[2,1]", "[2,2]"}};

    public static void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(xo[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void players(){
        int result_pl1 = 0;
        int  result_pl2 = 0;
        boolean pl1_win = false;
        boolean pl2_win = false;
        boolean detector = true;

        int q_pl1 = 0;
        int q_pl2 = 0;
        int x_1 = 0, y_1 = 0;
        int x_2 = 0, y_2 = 0;
        int counter = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 5; j++)
                player1[i][j] = -1;
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++)
                player2[i][j] = -1;
        }
        while(counter != 9) {
            do {
                System.out.println("Ходит первый игрок: ");

                for(; q_pl1 < 5; ) {

                    detector = true;
                    do{
                        player1[0][q_pl1] = sc.nextInt();
                        player1[1][q_pl1] = sc.nextInt();
                        if(player1[0][q_pl1] < 0 || player1[0][q_pl1] > 2 || player1[1][q_pl1] < 0 || player1[1][q_pl1] > 2)
                            System.out.println("Ячейка занята!\n");
                    }while(player1[0][q_pl1] < 0 || player1[0][q_pl1] > 2 || player1[1][q_pl1] < 0 || player1[1][q_pl1] > 2 );

                    for(int i = 0; i < 5; i++) {
                        if(player1[0][q_pl1] == player1[0][i] && player1[1][q_pl1] == player1[1][i] && q_pl1 != i) {
                            detector = false;
                            break;
                        }

                    }
                    for(int i = 0; i < 4; i++) {
                        if(player1[0][q_pl1] == player2[0][i] && player1[1][q_pl1] == player2[1][i]) {
                            detector = false;
                            break;
                        }
                    }
                    if(detector == false) {
                        System.out.println("Ячейка занята! ");
                        break;
                    }
                    x_1 = player1[0][q_pl1];
                    y_1 = player1[1][q_pl1];
                    q_pl1 += 1;
                    break;
                }
            }while(detector == false);

            xo[x_1][y_1] = "X";
            show();
            //Conditions of win

            for(int i = 0; i < 5; i++) {
                result_pl1 = 0;
                for(int j = 0; j < 5; j++) {
                    if(player1[0][i] == player1[0][j] && i != j && player1[0][i] != -1 && player1[0][j] != -1)
                        result_pl1 += 1;
                    if(result_pl1 == 2)
                        pl1_win = true;
                }
            }
            for(int i = 0; i < 5; i++) {
                result_pl1 = 0;
                for(int j = 0; j < 5; j++) {
                    if(player1[1][i] == player1[1][j] && i != j && player1[1][i] != -1 && player1[1][j] != -1)
                        result_pl1 += 1;
                    if(result_pl1 == 2)
                        pl1_win = true;
                }
            }
            result_pl1 = 0;
            for(int i = 0; i < 5; i++) {
                if(player1[0][i] == player1[1][i] && player1[0][i] != -1)
                    result_pl1 += 1;
                if(result_pl1 == 3)
                    pl1_win = true;
            }
            result_pl1 = 0;
            for(int i = 0; i < 5; i++) {
                if(player1[0][i] == 0 && player1[1][i] == 2)
                    result_pl1 += 1;
                if(player1[0][i] == 2 && player1[1][i] == 0)
                    result_pl1 += 1;
                if(player1[0][i] == 1 && player1[1][i] == 1)
                    result_pl1 += 1;

                if(result_pl1 == 3)
                    pl1_win = true;
            }

            if(pl1_win) {
                System.out.print("\nПервый игрок выиграл!!! X\n");
                break;
            }

            // Enter coordinates player2 and check

            do {
                System.out.println("Ходит второй игрок: ");

                for(; q_pl2 < 4; ) {
                    detector = true;
                    do {
                        player2[0][q_pl2] = sc.nextInt();
                        player2[1][q_pl2] = sc.nextInt();
                        if(player2[0][q_pl2] < 0 || player2[0][q_pl2] > 2 || player2[1][q_pl2] < 0 || player2[1][q_pl2] > 2)
                            System.out.println("Ячейка занята!");
                    }while(player2[0][q_pl2] < 0 || player2[0][q_pl2] > 2 || player2[1][q_pl2] < 0 || player2[1][q_pl2] > 2 );

                    for(int i = 0; i < 4; i++) {
                        if(player2[0][q_pl2] == player1[0][i] && player2[1][q_pl2] == player1[1][i])
                            detector = false;
                    }
                    for(int i = 0; i < 4; i++) {
                        if(player2[0][q_pl2] == player2[0][i] && player2[1][q_pl2] == player2[1][i] && q_pl2 != i)
                            detector = false;
                    }
                    if(detector == false) {
                        System.out.println("Ячейка занята! ");
                        break;
                    }
                    x_2 = player2[0][q_pl2];
                    y_2 = player2[1][q_pl2];
                    q_pl2 += 1;
                    break;
                }
            }while(detector == false);

            xo[x_2][y_2] = "O";
            show();


            //Conditions of win

            for(int i = 0; i < 4; i++) {
                result_pl2 = 0;
                for(int j = 0; j < 4; j++) {
                    if(player2[0][i] == player2[0][j] && i != j && player2[0][i] != -1 && player2[0][j] != -1)
                        result_pl2 += 1;
                    if(result_pl2 == 2)
                        pl2_win = true;
                }
            }
            for(int i = 0; i < 4; i++) {
                result_pl2 = 0;
                for(int j = 0; j < 4; j++) {
                    if(player2[1][i] == player2[1][j] && i != j && player2[1][i] != -1 && player2[1][j] != -1)
                        result_pl2 += 1;
                    if(result_pl2 == 2)
                        pl2_win = true;
                }
            }
            result_pl2 = 0;
            for(int i = 0; i < 4; i++) {
                if(player2[0][i] == player2[1][i] && player2[0][i] != -1)
                    result_pl2 += 1;
                if(result_pl2 == 3)
                    pl2_win = true;
            }
            result_pl2 = 0;
            for(int i = 0; i < 4; i++) {
                if(player2[0][i] == 0 && player2[1][i] == 2)
                    result_pl2 += 1;
                if(player2[0][i] == 2 && player2[1][i] == 0)
                    result_pl2 += 1;
                if(player2[0][i] == 1 && player2[1][i] == 1)
                    result_pl2 += 1;

                if(result_pl2 == 3)
                    pl2_win = true;
            }
            if(pl2_win) {
                System.out.print("\nВторой игрок выиграл!!! O");
                break;
            }

            counter += 1;
        }
        if(counter == 9)
            System.out.println("Ничья!");
    }
    public static void main(String[] args) {
        show();
        players();
    }
}
