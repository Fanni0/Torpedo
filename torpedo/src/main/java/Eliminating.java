import java.util.Scanner;

public class Eliminating {
    void elim(){
        String s,m;
        Ships sl = new Ships();
        int count=1;
        System.out.println("Eliminating ships!");
        do {
            System.out.println("Round " + count + ": \n Player 1's turn.\n Choose coordinate one: ");
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
            System.out.println("Choose coordinate two: ");
            Scanner inn = new Scanner(System.in);
            m = in.nextLine();

            char playeroships[][] = sl.getPlayerOneArray();
            char playertships[][] = sl.getPlayerTwoArray();

            switch (s) {
                case "A":
                    switch (m) {
                        case "0":
                            System.out.println("A0");
                            playertships[1][1] = 'X';
                            break;
                        case "1":
                            System.out.println("A1");
                            playertships[2][1] = 'X';
                            break;
                        case "2":
                            System.out.println("A2");
                            playertships[3][1] = 'X';
                            break;
                        case "3":
                            System.out.println("A3");
                            playertships[4][1] = 'X';
                            break;
                        case "4":
                            System.out.println("A4");
                            playertships[5][1] = 'X';
                            break;
                        case "5":
                            System.out.println("A5");
                            playertships[6][1] = 'X';
                            break;
                        case "6":
                            System.out.println("A6");
                            playertships[7][1] = 'X';
                            break;
                        case "7":
                            System.out.println("A7");
                            playertships[8][1] = 'X';
                            break;
                        case "8":
                            System.out.println("A8");
                            playertships[9][1] = 'X';
                            break;
                        case "9":
                            System.out.println("A9");
                            playertships[10][1] = 'X';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            playertships[1][2] = 'X';
                            break;
                        case "1":
                            System.out.println("B1");
                            playertships[2][2] = 'X';
                            break;
                        case "2":
                            System.out.println("B2");
                            playertships[3][2] = 'X';
                            break;
                        case "3":
                            System.out.println("B3");
                            playertships[4][2] = 'X';
                            break;
                        case "4":
                            System.out.println("B4");
                            playertships[5][2] = 'X';
                            break;
                        case "5":
                            System.out.println("B5");
                            playertships[6][2] = 'X';
                            break;
                        case "6":
                            System.out.println("B6");
                            playertships[7][2] = 'X';
                            break;
                        case "7":
                            System.out.println("B7");
                            playertships[8][2] = 'X';
                            break;
                        case "8":
                            System.out.println("B8");
                            playertships[9][2] = 'X';
                            break;
                        case "9":
                            System.out.println("B9");
                            playertships[10][2] = 'X';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            playertships[1][3] = 'X';
                            break;
                        case "1":
                            System.out.println("C1");
                            playertships[2][3] = 'X';
                            break;
                        case "2":
                            System.out.println("C2");
                            playertships[3][3] = 'X';
                            break;
                        case "3":
                            System.out.println("C3");
                            playertships[4][3] = 'X';
                            break;
                        case "4":
                            System.out.println("C4");
                            playertships[5][3] = 'X';
                            break;
                        case "5":
                            System.out.println("C5");
                            playertships[6][3] = 'X';
                            break;
                        case "6":
                            System.out.println("C6");
                            playertships[7][3] = 'X';
                            break;
                        case "7":
                            System.out.println("C7");
                            playertships[8][3] = 'X';
                            break;
                        case "8":
                            System.out.println("C8");
                            playertships[9][3] = 'X';
                            break;
                        case "9":
                            System.out.println("C9");
                            playertships[10][3] = 'X';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            playertships[1][4] = 'X';
                            break;
                        case "1":
                            System.out.println("D1");
                            playertships[2][4] = 'X';
                            break;
                        case "2":
                            System.out.println("D2");
                            playertships[3][4] = 'X';
                            break;
                        case "3":
                            System.out.println("D3");
                            playertships[4][4] = 'X';
                            break;
                        case "4":
                            System.out.println("D4");
                            playertships[5][4] = 'X';
                            break;
                        case "5":
                            System.out.println("D5");
                            playertships[6][4] = 'X';
                            break;
                        case "6":
                            System.out.println("D6");
                            playertships[7][4] = 'X';
                            break;
                        case "7":
                            System.out.println("D7");
                            playertships[8][4] = 'X';
                            break;
                        case "8":
                            System.out.println("D8");
                            playertships[9][4] = 'X';
                            break;
                        case "9":
                            System.out.println("D9");
                            playertships[10][4] = 'X';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            playertships[1][5] = 'X';
                            break;
                        case "1":
                            System.out.println("E1");
                            playertships[2][5] = 'X';
                            break;
                        case "2":
                            System.out.println("E2");
                            playertships[3][5] = 'X';
                            break;
                        case "3":
                            System.out.println("E3");
                            playertships[4][5] = 'X';
                            break;
                        case "4":
                            System.out.println("E4");
                            playertships[5][5] = 'X';
                            break;
                        case "5":
                            System.out.println("E5");
                            playertships[6][5] = 'X';
                            break;
                        case "6":
                            System.out.println("E6");
                            playertships[7][5] = 'X';
                            break;
                        case "7":
                            System.out.println("E7");
                            playertships[8][5] = 'X';
                            break;
                        case "8":
                            System.out.println("E8");
                            playertships[9][5] = 'X';
                            break;
                        case "9":
                            System.out.println("E9");
                            playertships[10][5] = 'X';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            playertships[1][6] = 'X';
                            break;
                        case "1":
                            System.out.println("F1");
                            playertships[2][6] = 'X';
                            break;
                        case "2":
                            System.out.println("F2");
                            playertships[3][6] = 'X';
                            break;
                        case "3":
                            System.out.println("F3");
                            playertships[4][6] = 'X';
                            break;
                        case "4":
                            System.out.println("F4");
                            playertships[5][6] = 'X';
                            break;
                        case "5":
                            System.out.println("F5");
                            playertships[6][6] = 'X';
                            break;
                        case "6":
                            System.out.println("F6");
                            playertships[7][6] = 'X';
                            break;
                        case "7":
                            System.out.println("F7");
                            playertships[8][6] = 'X';
                            break;
                        case "8":
                            System.out.println("F8");
                            playertships[9][6] = 'X';
                            break;
                        case "9":
                            System.out.println("F9");
                            playertships[10][6] = 'X';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            playertships[1][7] = 'X';
                            break;
                        case "1":
                            System.out.println("G1");
                            playertships[2][7] = 'X';
                            break;
                        case "2":
                            System.out.println("G2");
                            playertships[3][7] = 'X';
                            break;
                        case "3":
                            System.out.println("G3");
                            playertships[4][7] = 'X';
                            break;
                        case "4":
                            System.out.println("G4");
                            playertships[5][7] = 'X';
                            break;
                        case "5":
                            System.out.println("G5");
                            playertships[6][7] = 'X';
                            break;
                        case "6":
                            System.out.println("G6");
                            playertships[7][7] = 'X';
                            break;
                        case "7":
                            System.out.println("G7");
                            playertships[8][7] = 'X';
                            break;
                        case "8":
                            System.out.println("G8");
                            playertships[9][7] = 'X';
                            break;
                        case "9":
                            System.out.println("G9");
                            playertships[10][7] = 'X';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            playertships[1][8] = 'X';
                            break;
                        case "1":
                            System.out.println("H1");
                            playertships[2][8] = 'X';
                            break;
                        case "2":
                            System.out.println("H2");
                            playertships[3][8] = 'X';
                            break;
                        case "3":
                            System.out.println("H3");
                            playertships[4][8] = 'X';
                            break;
                        case "4":
                            System.out.println("H4");
                            playertships[5][8] = 'X';
                            break;
                        case "5":
                            System.out.println("H5");
                            playertships[6][8] = 'X';
                            break;
                        case "6":
                            System.out.println("H6");
                            playertships[7][8] = 'X';
                            break;
                        case "7":
                            System.out.println("H7");
                            playertships[8][8] = 'X';
                            break;
                        case "8":
                            System.out.println("H8");
                            playertships[9][8] = 'X';
                            break;
                        case "9":
                            System.out.println("H9");
                            playertships[10][8] = 'X';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            playertships[1][9] = 'X';
                            break;
                        case "1":
                            System.out.println("I1");
                            playertships[2][9] = 'X';
                            break;
                        case "2":
                            System.out.println("I2");
                            playertships[3][9] = 'X';
                            break;
                        case "3":
                            System.out.println("I3");
                            playertships[4][9] = 'X';
                            break;
                        case "4":
                            System.out.println("I4");
                            playertships[5][9] = 'X';
                            break;
                        case "5":
                            System.out.println("I5");
                            playertships[6][9] = 'X';
                            break;
                        case "6":
                            System.out.println("I6");
                            playertships[7][9] = 'X';
                            break;
                        case "7":
                            System.out.println("I7");
                            playertships[8][9] = 'X';
                            break;
                        case "8":
                            System.out.println("I8");
                            playertships[9][9] = 'X';
                            break;
                        case "9":
                            System.out.println("I9");
                            playertships[10][9] = 'X';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            playertships[1][10] = 'X';
                            break;
                        case "1":
                            System.out.println("J1");
                            playertships[2][10] = 'X';
                            break;
                        case "2":
                            System.out.println("J2");
                            playertships[3][10] = 'X';
                            break;
                        case "3":
                            System.out.println("J3");
                            playertships[4][10] = 'X';
                            break;
                        case "4":
                            System.out.println("J4");
                            playertships[5][10] = 'X';
                            break;
                        case "5":
                            System.out.println("J5");
                            playertships[6][10] = 'X';
                            break;
                        case "6":
                            System.out.println("J6");
                            playertships[7][10] = 'X';
                            break;
                        case "7":
                            System.out.println("J7");
                            playertships[8][10] = 'X';
                            break;
                        case "8":
                            System.out.println("J8");
                            playertships[9][10] = 'X';
                            break;
                        case "9":
                            System.out.println("J9");
                            playertships[10][10] = 'X';
                            break;
                    }
                    break;
            }

            sl.shipchart();

            System.out.println("Player 2's turn.");
            System.out.println("Choose coordinate one: ");
            Scanner innn = new Scanner(System.in);
            s = in.nextLine();
            System.out.println("Choose coordinate two: ");
            Scanner innnn = new Scanner(System.in);
            m = in.nextLine();
            System.out.println("Coordinate chosen: " + s + m);

            switch (s) {
                case "A":
                    switch (m) {
                        case "0":
                            System.out.println("A0");
                            playeroships[1][1] = 'X';
                            break;
                        case "1":
                            System.out.println("A1");
                            playeroships[2][1] = 'X';
                            break;
                        case "2":
                            System.out.println("A2");
                            playeroships[3][1] = 'X';
                            break;
                        case "3":
                            System.out.println("A3");
                            playeroships[4][1] = 'X';
                            break;
                        case "4":
                            System.out.println("A4");
                            playeroships[5][1] = 'X';
                            break;
                        case "5":
                            System.out.println("A5");
                            playeroships[6][1] = 'X';
                            break;
                        case "6":
                            System.out.println("A6");
                            playeroships[7][1] = 'X';
                            break;
                        case "7":
                            System.out.println("A7");
                            playeroships[8][1] = 'X';
                            break;
                        case "8":
                            System.out.println("A8");
                            playeroships[9][1] = 'X';
                            break;
                        case "9":
                            System.out.println("A9");
                            playeroships[10][1] = 'X';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            playeroships[1][2] = 'X';
                            break;
                        case "1":
                            System.out.println("B1");
                            playeroships[2][2] = 'X';
                            break;
                        case "2":
                            System.out.println("B2");
                            playeroships[3][2] = 'X';
                            break;
                        case "3":
                            System.out.println("B3");
                            playeroships[4][2] = 'X';
                            break;
                        case "4":
                            System.out.println("B4");
                            playeroships[5][2] = 'X';
                            break;
                        case "5":
                            System.out.println("B5");
                            playeroships[6][2] = 'X';
                            break;
                        case "6":
                            System.out.println("B6");
                            playeroships[7][2] = 'X';
                            break;
                        case "7":
                            System.out.println("B7");
                            playeroships[8][2] = 'X';
                            break;
                        case "8":
                            System.out.println("B8");
                            playeroships[9][2] = 'X';
                            break;
                        case "9":
                            System.out.println("B9");
                            playeroships[10][2] = 'X';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            playeroships[1][3] = 'X';
                            break;
                        case "1":
                            System.out.println("C1");
                            playeroships[2][3] = 'X';
                            break;
                        case "2":
                            System.out.println("C2");
                            playeroships[3][3] = 'X';
                            break;
                        case "3":
                            System.out.println("C3");
                            playeroships[4][3] = 'X';
                            break;
                        case "4":
                            System.out.println("C4");
                            playeroships[5][3] = 'X';
                            break;
                        case "5":
                            System.out.println("C5");
                            playeroships[6][3] = 'X';
                            break;
                        case "6":
                            System.out.println("C6");
                            playeroships[7][3] = 'X';
                            break;
                        case "7":
                            System.out.println("C7");
                            playeroships[8][3] = 'X';
                            break;
                        case "8":
                            System.out.println("C8");
                            playeroships[9][3] = 'X';
                            break;
                        case "9":
                            System.out.println("C9");
                            playeroships[10][3] = 'X';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            playeroships[1][4] = 'X';
                            break;
                        case "1":
                            System.out.println("D1");
                            playeroships[2][4] = 'X';
                            break;
                        case "2":
                            System.out.println("D2");
                            playeroships[3][4] = 'X';
                            break;
                        case "3":
                            System.out.println("D3");
                            playeroships[4][4] = 'X';
                            break;
                        case "4":
                            System.out.println("D4");
                            playeroships[5][4] = 'X';
                            break;
                        case "5":
                            System.out.println("D5");
                            playeroships[6][4] = 'X';
                            break;
                        case "6":
                            System.out.println("D6");
                            playeroships[7][4] = 'X';
                            break;
                        case "7":
                            System.out.println("D7");
                            playeroships[8][4] = 'X';
                            break;
                        case "8":
                            System.out.println("D8");
                            playeroships[9][4] = 'X';
                            break;
                        case "9":
                            System.out.println("D9");
                            playeroships[10][4] = 'X';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            playeroships[1][5] = 'X';
                            break;
                        case "1":
                            System.out.println("E1");
                            playeroships[2][5] = 'X';
                            break;
                        case "2":
                            System.out.println("E2");
                            playeroships[3][5] = 'X';
                            break;
                        case "3":
                            System.out.println("E3");
                            playeroships[4][5] = 'X';
                            break;
                        case "4":
                            System.out.println("E4");
                            playeroships[5][5] = 'X';
                            break;
                        case "5":
                            System.out.println("E5");
                            playeroships[6][5] = 'X';
                            break;
                        case "6":
                            System.out.println("E6");
                            playeroships[7][5] = 'X';
                            break;
                        case "7":
                            System.out.println("E7");
                            playeroships[8][5] = 'X';
                            break;
                        case "8":
                            System.out.println("E8");
                            playeroships[9][5] = 'X';
                            break;
                        case "9":
                            System.out.println("E9");
                            playeroships[10][5] = 'X';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            playeroships[1][6] = 'X';
                            break;
                        case "1":
                            System.out.println("F1");
                            playeroships[2][6] = 'X';
                            break;
                        case "2":
                            System.out.println("F2");
                            playeroships[3][6] = 'X';
                            break;
                        case "3":
                            System.out.println("F3");
                            playeroships[4][6] = 'X';
                            break;
                        case "4":
                            System.out.println("F4");
                            playeroships[5][6] = 'X';
                            break;
                        case "5":
                            System.out.println("F5");
                            playeroships[6][6] = 'X';
                            break;
                        case "6":
                            System.out.println("F6");
                            playeroships[7][6] = 'X';
                            break;
                        case "7":
                            System.out.println("F7");
                            playeroships[8][6] = 'X';
                            break;
                        case "8":
                            System.out.println("F8");
                            playeroships[9][6] = 'X';
                            break;
                        case "9":
                            System.out.println("F9");
                            playeroships[10][6] = 'X';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            playeroships[1][7] = 'X';
                            break;
                        case "1":
                            System.out.println("G1");
                            playeroships[2][7] = 'X';
                            break;
                        case "2":
                            System.out.println("G2");
                            playeroships[3][7] = 'X';
                            break;
                        case "3":
                            System.out.println("G3");
                            playeroships[4][7] = 'X';
                            break;
                        case "4":
                            System.out.println("G4");
                            playeroships[5][7] = 'X';
                            break;
                        case "5":
                            System.out.println("G5");
                            playeroships[6][7] = 'X';
                            break;
                        case "6":
                            System.out.println("G6");
                            playeroships[7][7] = 'X';
                            break;
                        case "7":
                            System.out.println("G7");
                            playeroships[8][7] = 'X';
                            break;
                        case "8":
                            System.out.println("G8");
                            playeroships[9][7] = 'X';
                            break;
                        case "9":
                            System.out.println("G9");
                            playeroships[10][7] = 'X';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            playeroships[1][8] = 'X';
                            break;
                        case "1":
                            System.out.println("H1");
                            playeroships[2][8] = 'X';
                            break;
                        case "2":
                            System.out.println("H2");
                            playeroships[3][8] = 'X';
                            break;
                        case "3":
                            System.out.println("H3");
                            playeroships[4][8] = 'X';
                            break;
                        case "4":
                            System.out.println("H4");
                            playeroships[5][8] = 'X';
                            break;
                        case "5":
                            System.out.println("H5");
                            playeroships[6][8] = 'X';
                            break;
                        case "6":
                            System.out.println("H6");
                            playeroships[7][8] = 'X';
                            break;
                        case "7":
                            System.out.println("H7");
                            playeroships[8][8] = 'X';
                            break;
                        case "8":
                            System.out.println("H8");
                            playeroships[9][8] = 'X';
                            break;
                        case "9":
                            System.out.println("H9");
                            playeroships[10][8] = 'X';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            playeroships[1][9] = 'X';
                            break;
                        case "1":
                            System.out.println("I1");
                            playeroships[2][9] = 'X';
                            break;
                        case "2":
                            System.out.println("I2");
                            playeroships[3][9] = 'X';
                            break;
                        case "3":
                            System.out.println("I3");
                            playeroships[4][9] = 'X';
                            break;
                        case "4":
                            System.out.println("I4");
                            playeroships[5][9] = 'X';
                            break;
                        case "5":
                            System.out.println("I5");
                            playeroships[6][9] = 'X';
                            break;
                        case "6":
                            System.out.println("I6");
                            playeroships[7][9] = 'X';
                            break;
                        case "7":
                            System.out.println("I7");
                            playeroships[8][9] = 'X';
                            break;
                        case "8":
                            System.out.println("I8");
                            playeroships[9][9] = 'X';
                            break;
                        case "9":
                            System.out.println("I9");
                            playeroships[10][9] = 'X';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            playeroships[1][10] = 'X';
                            break;
                        case "1":
                            System.out.println("J1");
                            playeroships[2][10] = 'X';
                            break;
                        case "2":
                            System.out.println("J2");
                            playeroships[3][10] = 'X';
                            break;
                        case "3":
                            System.out.println("J3");
                            playeroships[4][10] = 'X';
                            break;
                        case "4":
                            System.out.println("J4");
                            playeroships[5][10] = 'X';
                            break;
                        case "5":
                            System.out.println("J5");
                            playeroships[6][10] = 'X';
                            break;
                        case "6":
                            System.out.println("J6");
                            playeroships[7][10] = 'X';
                            break;
                        case "7":
                            System.out.println("J7");
                            playeroships[8][10] = 'X';
                            break;
                        case "8":
                            System.out.println("J8");
                            playeroships[9][10] = 'X';
                            break;
                        case "9":
                            System.out.println("J9");
                            playeroships[10][10] = 'X';
                            break;
                    }
                    break;
            }

            sl.shipchart();
            count++;
        }while(count!=7);
    }
}
