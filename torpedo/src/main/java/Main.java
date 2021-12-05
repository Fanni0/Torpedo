import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,count=1;
        String s,m;
        char[][] PlayerOneArray = {{' ','A','B','C','D','E','F','G','H','I','J'},
                                   {'0','0','0','0','0','0','0','0','0','0','0'},
                                   {'1','0','0','0','0','0','0','0','0','0','0'},
                                   {'2','0','0','0','0','0','0','0','0','0','0'},
                                   {'3','0','0','0','0','0','0','0','0','0','0'},
                                   {'4','0','0','0','0','0','0','0','0','0','0'},
                                   {'5','0','0','0','0','0','0','0','0','0','0'},
                                   {'6','0','0','0','0','0','0','0','0','0','0'},
                                   {'7','0','0','0','0','0','0','0','0','0','0'},
                                   {'8','0','0','0','0','0','0','0','0','0','0'},
                                   {'9','0','0','0','0','0','0','0','0','0','0'}};

        char[][] PlayerTwoArray = {{' ','A','B','C','D','E','F','G','H','I','J'},
                                   {'0','0','0','0','0','0','0','0','0','0','0'},
                                   {'1','0','0','0','0','0','0','0','0','0','0'},
                                   {'2','0','0','0','0','0','0','0','0','0','0'},
                                   {'3','0','0','0','0','0','0','0','0','0','0'},
                                   {'4','0','0','0','0','0','0','0','0','0','0'},
                                   {'5','0','0','0','0','0','0','0','0','0','0'},
                                   {'6','0','0','0','0','0','0','0','0','0','0'},
                                   {'7','0','0','0','0','0','0','0','0','0','0'},
                                   {'8','0','0','0','0','0','0','0','0','0','0'},
                                   {'9','0','0','0','0','0','0','0','0','0','0'}};

        for(i=0;i< PlayerOneArray.length;i++)
            System.out.println(PlayerOneArray[i]);
        System.out.println("\n");
        for(i=0;i< PlayerTwoArray.length;i++)
            System.out.println(PlayerTwoArray[i]);
        System.out.println("0 = Free space. \n I = Ship. \n X = Shoot.");

        //Placing ships
        do {
            System.out.println("Round " + count + ":");
            System.out.println("Player 1's turn.");
            System.out.println("Choose coordinate one: ");
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
            System.out.println("Choose coordinate two: ");
            Scanner inn = new Scanner(System.in);
            m = in.nextLine();
            System.out.println("Coordinate chosen: " + s + m);

            switch (s) {
                case "A":
                    switch (m) {
                        case "0":
                            System.out.println("A0");
                            PlayerOneArray[1][1] = 'I';
                            break;
                        case "1":
                            System.out.println("A1");
                            PlayerOneArray[2][1] = 'I';
                            break;
                        case "2":
                            System.out.println("A2");
                            PlayerOneArray[3][1] = 'I';
                            break;
                        case "3":
                            System.out.println("A3");
                            PlayerOneArray[4][1] = 'I';
                            break;
                        case "4":
                            System.out.println("A4");
                            PlayerOneArray[5][1] = 'I';
                            break;
                        case "5":
                            System.out.println("A5");
                            PlayerOneArray[6][1] = 'I';
                            break;
                        case "6":
                            System.out.println("A6");
                            PlayerOneArray[7][1] = 'I';
                            break;
                        case "7":
                            System.out.println("A7");
                            PlayerOneArray[8][1] = 'I';
                            break;
                        case "8":
                            System.out.println("A8");
                            PlayerOneArray[9][1] = 'I';
                            break;
                        case "9":
                            System.out.println("A9");
                            PlayerOneArray[10][1] = 'I';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            PlayerOneArray[1][2] = 'I';
                            break;
                        case "1":
                            System.out.println("B1");
                            PlayerOneArray[2][2] = 'I';
                            break;
                        case "2":
                            System.out.println("B2");
                            PlayerOneArray[3][2] = 'I';
                            break;
                        case "3":
                            System.out.println("B3");
                            PlayerOneArray[4][2] = 'I';
                            break;
                        case "4":
                            System.out.println("B4");
                            PlayerOneArray[5][2] = 'I';
                            break;
                        case "5":
                            System.out.println("B5");
                            PlayerOneArray[6][2] = 'I';
                            break;
                        case "6":
                            System.out.println("B6");
                            PlayerOneArray[7][2] = 'I';
                            break;
                        case "7":
                            System.out.println("B7");
                            PlayerOneArray[8][2] = 'I';
                            break;
                        case "8":
                            System.out.println("B8");
                            PlayerOneArray[9][2] = 'I';
                            break;
                        case "9":
                            System.out.println("B9");
                            PlayerOneArray[10][2] = 'I';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            PlayerOneArray[1][3] = 'I';
                            break;
                        case "1":
                            System.out.println("C1");
                            PlayerOneArray[2][3] = 'I';
                            break;
                        case "2":
                            System.out.println("C2");
                            PlayerOneArray[3][3] = 'I';
                            break;
                        case "3":
                            System.out.println("C3");
                            PlayerOneArray[4][3] = 'I';
                            break;
                        case "4":
                            System.out.println("C4");
                            PlayerOneArray[5][3] = 'I';
                            break;
                        case "5":
                            System.out.println("C5");
                            PlayerOneArray[6][3] = 'I';
                            break;
                        case "6":
                            System.out.println("C6");
                            PlayerOneArray[7][3] = 'I';
                            break;
                        case "7":
                            System.out.println("C7");
                            PlayerOneArray[8][3] = 'I';
                            break;
                        case "8":
                            System.out.println("C8");
                            PlayerOneArray[9][3] = 'I';
                            break;
                        case "9":
                            System.out.println("C9");
                            PlayerOneArray[10][3] = 'I';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            PlayerOneArray[1][4] = 'I';
                            break;
                        case "1":
                            System.out.println("D1");
                            PlayerOneArray[2][4] = 'I';
                            break;
                        case "2":
                            System.out.println("D2");
                            PlayerOneArray[3][4] = 'I';
                            break;
                        case "3":
                            System.out.println("D3");
                            PlayerOneArray[4][4] = 'I';
                            break;
                        case "4":
                            System.out.println("D4");
                            PlayerOneArray[5][4] = 'I';
                            break;
                        case "5":
                            System.out.println("D5");
                            PlayerOneArray[6][4] = 'I';
                            break;
                        case "6":
                            System.out.println("D6");
                            PlayerOneArray[7][4] = 'I';
                            break;
                        case "7":
                            System.out.println("D7");
                            PlayerOneArray[8][4] = 'I';
                            break;
                        case "8":
                            System.out.println("D8");
                            PlayerOneArray[9][4] = 'I';
                            break;
                        case "9":
                            System.out.println("D9");
                            PlayerOneArray[10][4] = 'I';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            PlayerOneArray[1][5] = 'I';
                            break;
                        case "1":
                            System.out.println("E1");
                            PlayerOneArray[2][5] = 'I';
                            break;
                        case "2":
                            System.out.println("E2");
                            PlayerOneArray[3][5] = 'I';
                            break;
                        case "3":
                            System.out.println("E3");
                            PlayerOneArray[4][5] = 'I';
                            break;
                        case "4":
                            System.out.println("E4");
                            PlayerOneArray[5][5] = 'I';
                            break;
                        case "5":
                            System.out.println("E5");
                            PlayerOneArray[6][5] = 'I';
                            break;
                        case "6":
                            System.out.println("E6");
                            PlayerOneArray[7][5] = 'I';
                            break;
                        case "7":
                            System.out.println("E7");
                            PlayerOneArray[8][5] = 'I';
                            break;
                        case "8":
                            System.out.println("E8");
                            PlayerOneArray[9][5] = 'I';
                            break;
                        case "9":
                            System.out.println("E9");
                            PlayerOneArray[10][5] = 'I';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            PlayerOneArray[1][6] = 'I';
                            break;
                        case "1":
                            System.out.println("F1");
                            PlayerOneArray[2][6] = 'I';
                            break;
                        case "2":
                            System.out.println("F2");
                            PlayerOneArray[3][6] = 'I';
                            break;
                        case "3":
                            System.out.println("F3");
                            PlayerOneArray[4][6] = 'I';
                            break;
                        case "4":
                            System.out.println("F4");
                            PlayerOneArray[5][6] = 'I';
                            break;
                        case "5":
                            System.out.println("F5");
                            PlayerOneArray[6][6] = 'I';
                            break;
                        case "6":
                            System.out.println("F6");
                            PlayerOneArray[7][6] = 'I';
                            break;
                        case "7":
                            System.out.println("F7");
                            PlayerOneArray[8][6] = 'I';
                            break;
                        case "8":
                            System.out.println("F8");
                            PlayerOneArray[9][6] = 'I';
                            break;
                        case "9":
                            System.out.println("F9");
                            PlayerOneArray[10][6] = 'I';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            PlayerOneArray[1][7] = 'I';
                            break;
                        case "1":
                            System.out.println("G1");
                            PlayerOneArray[2][7] = 'I';
                            break;
                        case "2":
                            System.out.println("G2");
                            PlayerOneArray[3][7] = 'I';
                            break;
                        case "3":
                            System.out.println("G3");
                            PlayerOneArray[4][7] = 'I';
                            break;
                        case "4":
                            System.out.println("G4");
                            PlayerOneArray[5][7] = 'I';
                            break;
                        case "5":
                            System.out.println("G5");
                            PlayerOneArray[6][7] = 'I';
                            break;
                        case "6":
                            System.out.println("G6");
                            PlayerOneArray[7][7] = 'I';
                            break;
                        case "7":
                            System.out.println("G7");
                            PlayerOneArray[8][7] = 'I';
                            break;
                        case "8":
                            System.out.println("G8");
                            PlayerOneArray[9][7] = 'I';
                            break;
                        case "9":
                            System.out.println("G9");
                            PlayerOneArray[10][7] = 'I';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            PlayerOneArray[1][8] = 'I';
                            break;
                        case "1":
                            System.out.println("H1");
                            PlayerOneArray[2][8] = 'I';
                            break;
                        case "2":
                            System.out.println("H2");
                            PlayerOneArray[3][8] = 'I';
                            break;
                        case "3":
                            System.out.println("H3");
                            PlayerOneArray[4][8] = 'I';
                            break;
                        case "4":
                            System.out.println("H4");
                            PlayerOneArray[5][8] = 'I';
                            break;
                        case "5":
                            System.out.println("H5");
                            PlayerOneArray[6][8] = 'I';
                            break;
                        case "6":
                            System.out.println("H6");
                            PlayerOneArray[7][8] = 'I';
                            break;
                        case "7":
                            System.out.println("H7");
                            PlayerOneArray[8][8] = 'I';
                            break;
                        case "8":
                            System.out.println("H8");
                            PlayerOneArray[9][8] = 'I';
                            break;
                        case "9":
                            System.out.println("H9");
                            PlayerOneArray[10][8] = 'I';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            PlayerOneArray[1][9] = 'I';
                            break;
                        case "1":
                            System.out.println("I1");
                            PlayerOneArray[2][9] = 'I';
                            break;
                        case "2":
                            System.out.println("I2");
                            PlayerOneArray[3][9] = 'I';
                            break;
                        case "3":
                            System.out.println("I3");
                            PlayerOneArray[4][9] = 'I';
                            break;
                        case "4":
                            System.out.println("I4");
                            PlayerOneArray[5][9] = 'I';
                            break;
                        case "5":
                            System.out.println("I5");
                            PlayerOneArray[6][9] = 'I';
                            break;
                        case "6":
                            System.out.println("I6");
                            PlayerOneArray[7][9] = 'I';
                            break;
                        case "7":
                            System.out.println("I7");
                            PlayerOneArray[8][9] = 'I';
                            break;
                        case "8":
                            System.out.println("I8");
                            PlayerOneArray[9][9] = 'I';
                            break;
                        case "9":
                            System.out.println("I9");
                            PlayerOneArray[10][9] = 'I';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            PlayerOneArray[1][10] = 'I';
                            break;
                        case "1":
                            System.out.println("J1");
                            PlayerOneArray[2][10] = 'I';
                            break;
                        case "2":
                            System.out.println("J2");
                            PlayerOneArray[3][10] = 'I';
                            break;
                        case "3":
                            System.out.println("J3");
                            PlayerOneArray[4][10] = 'I';
                            break;
                        case "4":
                            System.out.println("J4");
                            PlayerOneArray[5][10] = 'I';
                            break;
                        case "5":
                            System.out.println("J5");
                            PlayerOneArray[6][10] = 'I';
                            break;
                        case "6":
                            System.out.println("J6");
                            PlayerOneArray[7][10] = 'I';
                            break;
                        case "7":
                            System.out.println("J7");
                            PlayerOneArray[8][10] = 'I';
                            break;
                        case "8":
                            System.out.println("J8");
                            PlayerOneArray[9][10] = 'I';
                            break;
                        case "9":
                            System.out.println("J9");
                            PlayerOneArray[10][10] = 'I';
                            break;
                    }
                    break;
            }

            for (i = 0; i < PlayerOneArray.length; i++)
                System.out.println(PlayerOneArray[i]);
            System.out.println("\n");
            for (i = 0; i < PlayerTwoArray.length; i++)
                System.out.println(PlayerTwoArray[i]);
            System.out.println("0 = Free space. \n I = Ship. \n X = Shoot.");

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
                            PlayerTwoArray[1][1] = 'I';
                            break;
                        case "1":
                            System.out.println("A1");
                            PlayerTwoArray[2][1] = 'I';
                            break;
                        case "2":
                            System.out.println("A2");
                            PlayerTwoArray[3][1] = 'I';
                            break;
                        case "3":
                            System.out.println("A3");
                            PlayerTwoArray[4][1] = 'I';
                            break;
                        case "4":
                            System.out.println("A4");
                            PlayerTwoArray[5][1] = 'I';
                            break;
                        case "5":
                            System.out.println("A5");
                            PlayerTwoArray[6][1] = 'I';
                            break;
                        case "6":
                            System.out.println("A6");
                            PlayerTwoArray[7][1] = 'I';
                            break;
                        case "7":
                            System.out.println("A7");
                            PlayerTwoArray[8][1] = 'I';
                            break;
                        case "8":
                            System.out.println("A8");
                            PlayerTwoArray[9][1] = 'I';
                            break;
                        case "9":
                            System.out.println("A9");
                            PlayerTwoArray[10][1] = 'I';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            PlayerTwoArray[1][2] = 'I';
                            break;
                        case "1":
                            System.out.println("B1");
                            PlayerTwoArray[2][2] = 'I';
                            break;
                        case "2":
                            System.out.println("B2");
                            PlayerTwoArray[3][2] = 'I';
                            break;
                        case "3":
                            System.out.println("B3");
                            PlayerTwoArray[4][2] = 'I';
                            break;
                        case "4":
                            System.out.println("B4");
                            PlayerTwoArray[5][2] = 'I';
                            break;
                        case "5":
                            System.out.println("B5");
                            PlayerTwoArray[6][2] = 'I';
                            break;
                        case "6":
                            System.out.println("B6");
                            PlayerTwoArray[7][2] = 'I';
                            break;
                        case "7":
                            System.out.println("B7");
                            PlayerTwoArray[8][2] = 'I';
                            break;
                        case "8":
                            System.out.println("B8");
                            PlayerTwoArray[9][2] = 'I';
                            break;
                        case "9":
                            System.out.println("B9");
                            PlayerTwoArray[10][2] = 'I';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            PlayerTwoArray[1][3] = 'I';
                            break;
                        case "1":
                            System.out.println("C1");
                            PlayerTwoArray[2][3] = 'I';
                            break;
                        case "2":
                            System.out.println("C2");
                            PlayerTwoArray[3][3] = 'I';
                            break;
                        case "3":
                            System.out.println("C3");
                            PlayerTwoArray[4][3] = 'I';
                            break;
                        case "4":
                            System.out.println("C4");
                            PlayerTwoArray[5][3] = 'I';
                            break;
                        case "5":
                            System.out.println("C5");
                            PlayerTwoArray[6][3] = 'I';
                            break;
                        case "6":
                            System.out.println("C6");
                            PlayerTwoArray[7][3] = 'I';
                            break;
                        case "7":
                            System.out.println("C7");
                            PlayerTwoArray[8][3] = 'I';
                            break;
                        case "8":
                            System.out.println("C8");
                            PlayerTwoArray[9][3] = 'I';
                            break;
                        case "9":
                            System.out.println("C9");
                            PlayerTwoArray[10][3] = 'I';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            PlayerTwoArray[1][4] = 'I';
                            break;
                        case "1":
                            System.out.println("D1");
                            PlayerTwoArray[2][4] = 'I';
                            break;
                        case "2":
                            System.out.println("D2");
                            PlayerTwoArray[3][4] = 'I';
                            break;
                        case "3":
                            System.out.println("D3");
                            PlayerTwoArray[4][4] = 'I';
                            break;
                        case "4":
                            System.out.println("D4");
                            PlayerTwoArray[5][4] = 'I';
                            break;
                        case "5":
                            System.out.println("D5");
                            PlayerTwoArray[6][4] = 'I';
                            break;
                        case "6":
                            System.out.println("D6");
                            PlayerTwoArray[7][4] = 'I';
                            break;
                        case "7":
                            System.out.println("D7");
                            PlayerTwoArray[8][4] = 'I';
                            break;
                        case "8":
                            System.out.println("D8");
                            PlayerTwoArray[9][4] = 'I';
                            break;
                        case "9":
                            System.out.println("D9");
                            PlayerTwoArray[10][4] = 'I';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            PlayerTwoArray[1][5] = 'I';
                            break;
                        case "1":
                            System.out.println("E1");
                            PlayerTwoArray[2][5] = 'I';
                            break;
                        case "2":
                            System.out.println("E2");
                            PlayerTwoArray[3][5] = 'I';
                            break;
                        case "3":
                            System.out.println("E3");
                            PlayerTwoArray[4][5] = 'I';
                            break;
                        case "4":
                            System.out.println("E4");
                            PlayerTwoArray[5][5] = 'I';
                            break;
                        case "5":
                            System.out.println("E5");
                            PlayerTwoArray[6][5] = 'I';
                            break;
                        case "6":
                            System.out.println("E6");
                            PlayerTwoArray[7][5] = 'I';
                            break;
                        case "7":
                            System.out.println("E7");
                            PlayerTwoArray[8][5] = 'I';
                            break;
                        case "8":
                            System.out.println("E8");
                            PlayerTwoArray[9][5] = 'I';
                            break;
                        case "9":
                            System.out.println("E9");
                            PlayerTwoArray[10][5] = 'I';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            PlayerTwoArray[1][6] = 'I';
                            break;
                        case "1":
                            System.out.println("F1");
                            PlayerTwoArray[2][6] = 'I';
                            break;
                        case "2":
                            System.out.println("F2");
                            PlayerTwoArray[3][6] = 'I';
                            break;
                        case "3":
                            System.out.println("F3");
                            PlayerTwoArray[4][6] = 'I';
                            break;
                        case "4":
                            System.out.println("F4");
                            PlayerTwoArray[5][6] = 'I';
                            break;
                        case "5":
                            System.out.println("F5");
                            PlayerTwoArray[6][6] = 'I';
                            break;
                        case "6":
                            System.out.println("F6");
                            PlayerTwoArray[7][6] = 'I';
                            break;
                        case "7":
                            System.out.println("F7");
                            PlayerTwoArray[8][6] = 'I';
                            break;
                        case "8":
                            System.out.println("F8");
                            PlayerTwoArray[9][6] = 'I';
                            break;
                        case "9":
                            System.out.println("F9");
                            PlayerTwoArray[10][6] = 'I';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            PlayerTwoArray[1][7] = 'I';
                            break;
                        case "1":
                            System.out.println("G1");
                            PlayerTwoArray[2][7] = 'I';
                            break;
                        case "2":
                            System.out.println("G2");
                            PlayerTwoArray[3][7] = 'I';
                            break;
                        case "3":
                            System.out.println("G3");
                            PlayerTwoArray[4][7] = 'I';
                            break;
                        case "4":
                            System.out.println("G4");
                            PlayerTwoArray[5][7] = 'I';
                            break;
                        case "5":
                            System.out.println("G5");
                            PlayerTwoArray[6][7] = 'I';
                            break;
                        case "6":
                            System.out.println("G6");
                            PlayerTwoArray[7][7] = 'I';
                            break;
                        case "7":
                            System.out.println("G7");
                            PlayerTwoArray[8][7] = 'I';
                            break;
                        case "8":
                            System.out.println("G8");
                            PlayerTwoArray[9][7] = 'I';
                            break;
                        case "9":
                            System.out.println("G9");
                            PlayerTwoArray[10][7] = 'I';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            PlayerTwoArray[1][8] = 'I';
                            break;
                        case "1":
                            System.out.println("H1");
                            PlayerTwoArray[2][8] = 'I';
                            break;
                        case "2":
                            System.out.println("H2");
                            PlayerTwoArray[3][8] = 'I';
                            break;
                        case "3":
                            System.out.println("H3");
                            PlayerTwoArray[4][8] = 'I';
                            break;
                        case "4":
                            System.out.println("H4");
                            PlayerTwoArray[5][8] = 'I';
                            break;
                        case "5":
                            System.out.println("H5");
                            PlayerTwoArray[6][8] = 'I';
                            break;
                        case "6":
                            System.out.println("H6");
                            PlayerTwoArray[7][8] = 'I';
                            break;
                        case "7":
                            System.out.println("H7");
                            PlayerTwoArray[8][8] = 'I';
                            break;
                        case "8":
                            System.out.println("H8");
                            PlayerTwoArray[9][8] = 'I';
                            break;
                        case "9":
                            System.out.println("H9");
                            PlayerTwoArray[10][8] = 'I';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            PlayerTwoArray[1][9] = 'I';
                            break;
                        case "1":
                            System.out.println("I1");
                            PlayerTwoArray[2][9] = 'I';
                            break;
                        case "2":
                            System.out.println("I2");
                            PlayerTwoArray[3][9] = 'I';
                            break;
                        case "3":
                            System.out.println("I3");
                            PlayerTwoArray[4][9] = 'I';
                            break;
                        case "4":
                            System.out.println("I4");
                            PlayerTwoArray[5][9] = 'I';
                            break;
                        case "5":
                            System.out.println("I5");
                            PlayerTwoArray[6][9] = 'I';
                            break;
                        case "6":
                            System.out.println("I6");
                            PlayerTwoArray[7][9] = 'I';
                            break;
                        case "7":
                            System.out.println("I7");
                            PlayerTwoArray[8][9] = 'I';
                            break;
                        case "8":
                            System.out.println("I8");
                            PlayerTwoArray[9][9] = 'I';
                            break;
                        case "9":
                            System.out.println("I9");
                            PlayerTwoArray[10][9] = 'I';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            PlayerTwoArray[1][10] = 'I';
                            break;
                        case "1":
                            System.out.println("J1");
                            PlayerTwoArray[2][10] = 'I';
                            break;
                        case "2":
                            System.out.println("J2");
                            PlayerTwoArray[3][10] = 'I';
                            break;
                        case "3":
                            System.out.println("J3");
                            PlayerTwoArray[4][10] = 'I';
                            break;
                        case "4":
                            System.out.println("J4");
                            PlayerTwoArray[5][10] = 'I';
                            break;
                        case "5":
                            System.out.println("J5");
                            PlayerTwoArray[6][10] = 'I';
                            break;
                        case "6":
                            System.out.println("J6");
                            PlayerTwoArray[7][10] = 'I';
                            break;
                        case "7":
                            System.out.println("J7");
                            PlayerTwoArray[8][10] = 'I';
                            break;
                        case "8":
                            System.out.println("J8");
                            PlayerTwoArray[9][10] = 'I';
                            break;
                        case "9":
                            System.out.println("J9");
                            PlayerTwoArray[10][10] = 'I';
                            break;
                    }
                    break;
            }

            for (i = 0; i < PlayerOneArray.length; i++)
                System.out.println(PlayerOneArray[i]);
            System.out.println("\n");
            for (i = 0; i < PlayerTwoArray.length; i++)
                System.out.println(PlayerTwoArray[i]);
            System.out.println("0 = Free space. \n I = Ship. \n X = Shoot.");
            count++;
        }while(count!=7);

        //Eliminating ships
        count=1;
        do {
            System.out.println("Round " + count + ". Fight!");
            System.out.println("Player 1's turn.");
            System.out.println("Choose coordinate one: ");
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
            System.out.println("Choose coordinate two: ");
            Scanner inn = new Scanner(System.in);
            m = in.nextLine();
            System.out.println("Coordinate chosen: " + s + m);

            switch (s) {
                case "A":
                    switch (m) {
                        case "0":
                            System.out.println("A0");
                            PlayerTwoArray[1][1] = 'X';
                            break;
                        case "1":
                            System.out.println("A1");
                            PlayerTwoArray[2][1] = 'X';
                            break;
                        case "2":
                            System.out.println("A2");
                            PlayerTwoArray[3][1] = 'X';
                            break;
                        case "3":
                            System.out.println("A3");
                            PlayerTwoArray[4][1] = 'X';
                            break;
                        case "4":
                            System.out.println("A4");
                            PlayerTwoArray[5][1] = 'X';
                            break;
                        case "5":
                            System.out.println("A5");
                            PlayerTwoArray[6][1] = 'X';
                            break;
                        case "6":
                            System.out.println("A6");
                            PlayerTwoArray[7][1] = 'X';
                            break;
                        case "7":
                            System.out.println("A7");
                            PlayerTwoArray[8][1] = 'X';
                            break;
                        case "8":
                            System.out.println("A8");
                            PlayerTwoArray[9][1] = 'X';
                            break;
                        case "9":
                            System.out.println("A9");
                            PlayerTwoArray[10][1] = 'X';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            PlayerTwoArray[1][2] = 'X';
                            break;
                        case "1":
                            System.out.println("B1");
                            PlayerTwoArray[2][2] = 'X';
                            break;
                        case "2":
                            System.out.println("B2");
                            PlayerTwoArray[3][2] = 'X';
                            break;
                        case "3":
                            System.out.println("B3");
                            PlayerTwoArray[4][2] = 'X';
                            break;
                        case "4":
                            System.out.println("B4");
                            PlayerTwoArray[5][2] = 'X';
                            break;
                        case "5":
                            System.out.println("B5");
                            PlayerTwoArray[6][2] = 'X';
                            break;
                        case "6":
                            System.out.println("B6");
                            PlayerTwoArray[7][2] = 'X';
                            break;
                        case "7":
                            System.out.println("B7");
                            PlayerTwoArray[8][2] = 'X';
                            break;
                        case "8":
                            System.out.println("B8");
                            PlayerTwoArray[9][2] = 'X';
                            break;
                        case "9":
                            System.out.println("B9");
                            PlayerTwoArray[10][2] = 'X';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            PlayerTwoArray[1][3] = 'X';
                            break;
                        case "1":
                            System.out.println("C1");
                            PlayerTwoArray[2][3] = 'X';
                            break;
                        case "2":
                            System.out.println("C2");
                            PlayerTwoArray[3][3] = 'X';
                            break;
                        case "3":
                            System.out.println("C3");
                            PlayerTwoArray[4][3] = 'X';
                            break;
                        case "4":
                            System.out.println("C4");
                            PlayerTwoArray[5][3] = 'X';
                            break;
                        case "5":
                            System.out.println("C5");
                            PlayerTwoArray[6][3] = 'X';
                            break;
                        case "6":
                            System.out.println("C6");
                            PlayerTwoArray[7][3] = 'X';
                            break;
                        case "7":
                            System.out.println("C7");
                            PlayerTwoArray[8][3] = 'X';
                            break;
                        case "8":
                            System.out.println("C8");
                            PlayerTwoArray[9][3] = 'X';
                            break;
                        case "9":
                            System.out.println("C9");
                            PlayerTwoArray[10][3] = 'X';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            PlayerTwoArray[1][4] = 'X';
                            break;
                        case "1":
                            System.out.println("D1");
                            PlayerTwoArray[2][4] = 'X';
                            break;
                        case "2":
                            System.out.println("D2");
                            PlayerTwoArray[3][4] = 'X';
                            break;
                        case "3":
                            System.out.println("D3");
                            PlayerTwoArray[4][4] = 'X';
                            break;
                        case "4":
                            System.out.println("D4");
                            PlayerTwoArray[5][4] = 'X';
                            break;
                        case "5":
                            System.out.println("D5");
                            PlayerTwoArray[6][4] = 'X';
                            break;
                        case "6":
                            System.out.println("D6");
                            PlayerTwoArray[7][4] = 'X';
                            break;
                        case "7":
                            System.out.println("D7");
                            PlayerTwoArray[8][4] = 'X';
                            break;
                        case "8":
                            System.out.println("D8");
                            PlayerTwoArray[9][4] = 'X';
                            break;
                        case "9":
                            System.out.println("D9");
                            PlayerTwoArray[10][4] = 'X';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            PlayerTwoArray[1][5] = 'X';
                            break;
                        case "1":
                            System.out.println("E1");
                            PlayerTwoArray[2][5] = 'X';
                            break;
                        case "2":
                            System.out.println("E2");
                            PlayerTwoArray[3][5] = 'X';
                            break;
                        case "3":
                            System.out.println("E3");
                            PlayerTwoArray[4][5] = 'X';
                            break;
                        case "4":
                            System.out.println("E4");
                            PlayerTwoArray[5][5] = 'X';
                            break;
                        case "5":
                            System.out.println("E5");
                            PlayerTwoArray[6][5] = 'X';
                            break;
                        case "6":
                            System.out.println("E6");
                            PlayerTwoArray[7][5] = 'X';
                            break;
                        case "7":
                            System.out.println("E7");
                            PlayerTwoArray[8][5] = 'X';
                            break;
                        case "8":
                            System.out.println("E8");
                            PlayerTwoArray[9][5] = 'X';
                            break;
                        case "9":
                            System.out.println("E9");
                            PlayerTwoArray[10][5] = 'X';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            PlayerTwoArray[1][6] = 'X';
                            break;
                        case "1":
                            System.out.println("F1");
                            PlayerTwoArray[2][6] = 'X';
                            break;
                        case "2":
                            System.out.println("F2");
                            PlayerTwoArray[3][6] = 'X';
                            break;
                        case "3":
                            System.out.println("F3");
                            PlayerTwoArray[4][6] = 'X';
                            break;
                        case "4":
                            System.out.println("F4");
                            PlayerTwoArray[5][6] = 'X';
                            break;
                        case "5":
                            System.out.println("F5");
                            PlayerTwoArray[6][6] = 'X';
                            break;
                        case "6":
                            System.out.println("F6");
                            PlayerTwoArray[7][6] = 'X';
                            break;
                        case "7":
                            System.out.println("F7");
                            PlayerTwoArray[8][6] = 'X';
                            break;
                        case "8":
                            System.out.println("F8");
                            PlayerTwoArray[9][6] = 'X';
                            break;
                        case "9":
                            System.out.println("F9");
                            PlayerTwoArray[10][6] = 'X';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            PlayerTwoArray[1][7] = 'X';
                            break;
                        case "1":
                            System.out.println("G1");
                            PlayerTwoArray[2][7] = 'X';
                            break;
                        case "2":
                            System.out.println("G2");
                            PlayerTwoArray[3][7] = 'X';
                            break;
                        case "3":
                            System.out.println("G3");
                            PlayerTwoArray[4][7] = 'X';
                            break;
                        case "4":
                            System.out.println("G4");
                            PlayerTwoArray[5][7] = 'X';
                            break;
                        case "5":
                            System.out.println("G5");
                            PlayerTwoArray[6][7] = 'X';
                            break;
                        case "6":
                            System.out.println("G6");
                            PlayerTwoArray[7][7] = 'X';
                            break;
                        case "7":
                            System.out.println("G7");
                            PlayerTwoArray[8][7] = 'X';
                            break;
                        case "8":
                            System.out.println("G8");
                            PlayerTwoArray[9][7] = 'X';
                            break;
                        case "9":
                            System.out.println("G9");
                            PlayerTwoArray[10][7] = 'X';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            PlayerTwoArray[1][8] = 'X';
                            break;
                        case "1":
                            System.out.println("H1");
                            PlayerTwoArray[2][8] = 'X';
                            break;
                        case "2":
                            System.out.println("H2");
                            PlayerTwoArray[3][8] = 'X';
                            break;
                        case "3":
                            System.out.println("H3");
                            PlayerTwoArray[4][8] = 'X';
                            break;
                        case "4":
                            System.out.println("H4");
                            PlayerTwoArray[5][8] = 'X';
                            break;
                        case "5":
                            System.out.println("H5");
                            PlayerTwoArray[6][8] = 'X';
                            break;
                        case "6":
                            System.out.println("H6");
                            PlayerTwoArray[7][8] = 'X';
                            break;
                        case "7":
                            System.out.println("H7");
                            PlayerTwoArray[8][8] = 'X';
                            break;
                        case "8":
                            System.out.println("H8");
                            PlayerTwoArray[9][8] = 'X';
                            break;
                        case "9":
                            System.out.println("H9");
                            PlayerTwoArray[10][8] = 'X';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            PlayerTwoArray[1][9] = 'X';
                            break;
                        case "1":
                            System.out.println("I1");
                            PlayerTwoArray[2][9] = 'X';
                            break;
                        case "2":
                            System.out.println("I2");
                            PlayerTwoArray[3][9] = 'X';
                            break;
                        case "3":
                            System.out.println("I3");
                            PlayerTwoArray[4][9] = 'X';
                            break;
                        case "4":
                            System.out.println("I4");
                            PlayerTwoArray[5][9] = 'X';
                            break;
                        case "5":
                            System.out.println("I5");
                            PlayerTwoArray[6][9] = 'X';
                            break;
                        case "6":
                            System.out.println("I6");
                            PlayerTwoArray[7][9] = 'X';
                            break;
                        case "7":
                            System.out.println("I7");
                            PlayerTwoArray[8][9] = 'X';
                            break;
                        case "8":
                            System.out.println("I8");
                            PlayerTwoArray[9][9] = 'X';
                            break;
                        case "9":
                            System.out.println("I9");
                            PlayerTwoArray[10][9] = 'X';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            PlayerTwoArray[1][10] = 'X';
                            break;
                        case "1":
                            System.out.println("J1");
                            PlayerTwoArray[2][10] = 'X';
                            break;
                        case "2":
                            System.out.println("J2");
                            PlayerTwoArray[3][10] = 'X';
                            break;
                        case "3":
                            System.out.println("J3");
                            PlayerTwoArray[4][10] = 'X';
                            break;
                        case "4":
                            System.out.println("J4");
                            PlayerTwoArray[5][10] = 'X';
                            break;
                        case "5":
                            System.out.println("J5");
                            PlayerTwoArray[6][10] = 'X';
                            break;
                        case "6":
                            System.out.println("J6");
                            PlayerTwoArray[7][10] = 'X';
                            break;
                        case "7":
                            System.out.println("J7");
                            PlayerTwoArray[8][10] = 'X';
                            break;
                        case "8":
                            System.out.println("J8");
                            PlayerTwoArray[9][10] = 'X';
                            break;
                        case "9":
                            System.out.println("J9");
                            PlayerTwoArray[10][10] = 'X';
                            break;
                    }
                    break;
            }

            for (i = 0; i < PlayerOneArray.length; i++)
                System.out.println(PlayerOneArray[i]);
            System.out.println("\n");
            for (i = 0; i < PlayerTwoArray.length; i++)
                System.out.println(PlayerTwoArray[i]);
            System.out.println("0 = Free space. \n I = Ship. \n X = Shoot.");

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
                            PlayerOneArray[1][1] = 'X';
                            break;
                        case "1":
                            System.out.println("A1");
                            PlayerOneArray[2][1] = 'X';
                            break;
                        case "2":
                            System.out.println("A2");
                            PlayerOneArray[3][1] = 'X';
                            break;
                        case "3":
                            System.out.println("A3");
                            PlayerOneArray[4][1] = 'X';
                            break;
                        case "4":
                            System.out.println("A4");
                            PlayerOneArray[5][1] = 'X';
                            break;
                        case "5":
                            System.out.println("A5");
                            PlayerOneArray[6][1] = 'X';
                            break;
                        case "6":
                            System.out.println("A6");
                            PlayerOneArray[7][1] = 'X';
                            break;
                        case "7":
                            System.out.println("A7");
                            PlayerOneArray[8][1] = 'X';
                            break;
                        case "8":
                            System.out.println("A8");
                            PlayerOneArray[9][1] = 'X';
                            break;
                        case "9":
                            System.out.println("A9");
                            PlayerOneArray[10][1] = 'X';
                            break;
                    }
                    break;
                case "B":
                    switch (m) {
                        case "0":
                            System.out.println("B0");
                            PlayerOneArray[1][2] = 'X';
                            break;
                        case "1":
                            System.out.println("B1");
                            PlayerOneArray[2][2] = 'X';
                            break;
                        case "2":
                            System.out.println("B2");
                            PlayerOneArray[3][2] = 'X';
                            break;
                        case "3":
                            System.out.println("B3");
                            PlayerOneArray[4][2] = 'X';
                            break;
                        case "4":
                            System.out.println("B4");
                            PlayerOneArray[5][2] = 'X';
                            break;
                        case "5":
                            System.out.println("B5");
                            PlayerOneArray[6][2] = 'X';
                            break;
                        case "6":
                            System.out.println("B6");
                            PlayerOneArray[7][2] = 'X';
                            break;
                        case "7":
                            System.out.println("B7");
                            PlayerOneArray[8][2] = 'X';
                            break;
                        case "8":
                            System.out.println("B8");
                            PlayerOneArray[9][2] = 'X';
                            break;
                        case "9":
                            System.out.println("B9");
                            PlayerOneArray[10][2] = 'X';
                            break;
                    }
                    break;
                case "C":
                    switch (m) {
                        case "0":
                            System.out.println("C0");
                            PlayerOneArray[1][3] = 'X';
                            break;
                        case "1":
                            System.out.println("C1");
                            PlayerOneArray[2][3] = 'X';
                            break;
                        case "2":
                            System.out.println("C2");
                            PlayerOneArray[3][3] = 'X';
                            break;
                        case "3":
                            System.out.println("C3");
                            PlayerOneArray[4][3] = 'X';
                            break;
                        case "4":
                            System.out.println("C4");
                            PlayerOneArray[5][3] = 'X';
                            break;
                        case "5":
                            System.out.println("C5");
                            PlayerOneArray[6][3] = 'X';
                            break;
                        case "6":
                            System.out.println("C6");
                            PlayerOneArray[7][3] = 'X';
                            break;
                        case "7":
                            System.out.println("C7");
                            PlayerOneArray[8][3] = 'X';
                            break;
                        case "8":
                            System.out.println("C8");
                            PlayerOneArray[9][3] = 'X';
                            break;
                        case "9":
                            System.out.println("C9");
                            PlayerOneArray[10][3] = 'X';
                            break;
                    }
                    break;
                case "D":
                    switch (m) {
                        case "0":
                            System.out.println("D0");
                            PlayerOneArray[1][4] = 'X';
                            break;
                        case "1":
                            System.out.println("D1");
                            PlayerOneArray[2][4] = 'X';
                            break;
                        case "2":
                            System.out.println("D2");
                            PlayerOneArray[3][4] = 'X';
                            break;
                        case "3":
                            System.out.println("D3");
                            PlayerOneArray[4][4] = 'X';
                            break;
                        case "4":
                            System.out.println("D4");
                            PlayerOneArray[5][4] = 'X';
                            break;
                        case "5":
                            System.out.println("D5");
                            PlayerOneArray[6][4] = 'X';
                            break;
                        case "6":
                            System.out.println("D6");
                            PlayerOneArray[7][4] = 'X';
                            break;
                        case "7":
                            System.out.println("D7");
                            PlayerOneArray[8][4] = 'X';
                            break;
                        case "8":
                            System.out.println("D8");
                            PlayerOneArray[9][4] = 'X';
                            break;
                        case "9":
                            System.out.println("D9");
                            PlayerOneArray[10][4] = 'X';
                            break;
                    }
                    break;
                case "E":
                    switch (m) {
                        case "0":
                            System.out.println("E0");
                            PlayerOneArray[1][5] = 'X';
                            break;
                        case "1":
                            System.out.println("E1");
                            PlayerOneArray[2][5] = 'X';
                            break;
                        case "2":
                            System.out.println("E2");
                            PlayerOneArray[3][5] = 'X';
                            break;
                        case "3":
                            System.out.println("E3");
                            PlayerOneArray[4][5] = 'X';
                            break;
                        case "4":
                            System.out.println("E4");
                            PlayerOneArray[5][5] = 'X';
                            break;
                        case "5":
                            System.out.println("E5");
                            PlayerOneArray[6][5] = 'X';
                            break;
                        case "6":
                            System.out.println("E6");
                            PlayerOneArray[7][5] = 'X';
                            break;
                        case "7":
                            System.out.println("E7");
                            PlayerOneArray[8][5] = 'X';
                            break;
                        case "8":
                            System.out.println("E8");
                            PlayerOneArray[9][5] = 'X';
                            break;
                        case "9":
                            System.out.println("E9");
                            PlayerOneArray[10][5] = 'X';
                            break;
                    }
                    break;
                case "F":
                    switch (m) {
                        case "0":
                            System.out.println("F0");
                            PlayerOneArray[1][6] = 'X';
                            break;
                        case "1":
                            System.out.println("F1");
                            PlayerOneArray[2][6] = 'X';
                            break;
                        case "2":
                            System.out.println("F2");
                            PlayerOneArray[3][6] = 'X';
                            break;
                        case "3":
                            System.out.println("F3");
                            PlayerOneArray[4][6] = 'X';
                            break;
                        case "4":
                            System.out.println("F4");
                            PlayerOneArray[5][6] = 'X';
                            break;
                        case "5":
                            System.out.println("F5");
                            PlayerOneArray[6][6] = 'X';
                            break;
                        case "6":
                            System.out.println("F6");
                            PlayerOneArray[7][6] = 'X';
                            break;
                        case "7":
                            System.out.println("F7");
                            PlayerOneArray[8][6] = 'X';
                            break;
                        case "8":
                            System.out.println("F8");
                            PlayerOneArray[9][6] = 'X';
                            break;
                        case "9":
                            System.out.println("F9");
                            PlayerOneArray[10][6] = 'X';
                            break;
                    }
                    break;
                case "G":
                    switch (m) {
                        case "0":
                            System.out.println("G0");
                            PlayerOneArray[1][7] = 'X';
                            break;
                        case "1":
                            System.out.println("G1");
                            PlayerOneArray[2][7] = 'X';
                            break;
                        case "2":
                            System.out.println("G2");
                            PlayerOneArray[3][7] = 'X';
                            break;
                        case "3":
                            System.out.println("G3");
                            PlayerOneArray[4][7] = 'X';
                            break;
                        case "4":
                            System.out.println("G4");
                            PlayerOneArray[5][7] = 'X';
                            break;
                        case "5":
                            System.out.println("G5");
                            PlayerOneArray[6][7] = 'X';
                            break;
                        case "6":
                            System.out.println("G6");
                            PlayerOneArray[7][7] = 'X';
                            break;
                        case "7":
                            System.out.println("G7");
                            PlayerOneArray[8][7] = 'X';
                            break;
                        case "8":
                            System.out.println("G8");
                            PlayerOneArray[9][7] = 'X';
                            break;
                        case "9":
                            System.out.println("G9");
                            PlayerOneArray[10][7] = 'X';
                            break;
                    }
                    break;
                case "H":
                    switch (m) {
                        case "0":
                            System.out.println("H0");
                            PlayerOneArray[1][8] = 'X';
                            break;
                        case "1":
                            System.out.println("H1");
                            PlayerOneArray[2][8] = 'X';
                            break;
                        case "2":
                            System.out.println("H2");
                            PlayerOneArray[3][8] = 'X';
                            break;
                        case "3":
                            System.out.println("H3");
                            PlayerOneArray[4][8] = 'X';
                            break;
                        case "4":
                            System.out.println("H4");
                            PlayerOneArray[5][8] = 'X';
                            break;
                        case "5":
                            System.out.println("H5");
                            PlayerOneArray[6][8] = 'X';
                            break;
                        case "6":
                            System.out.println("H6");
                            PlayerOneArray[7][8] = 'X';
                            break;
                        case "7":
                            System.out.println("H7");
                            PlayerOneArray[8][8] = 'X';
                            break;
                        case "8":
                            System.out.println("H8");
                            PlayerOneArray[9][8] = 'X';
                            break;
                        case "9":
                            System.out.println("H9");
                            PlayerOneArray[10][8] = 'X';
                            break;
                    }
                    break;
                case "I":
                    switch (m) {
                        case "0":
                            System.out.println("I0");
                            PlayerOneArray[1][9] = 'X';
                            break;
                        case "1":
                            System.out.println("I1");
                            PlayerOneArray[2][9] = 'X';
                            break;
                        case "2":
                            System.out.println("I2");
                            PlayerOneArray[3][9] = 'X';
                            break;
                        case "3":
                            System.out.println("I3");
                            PlayerOneArray[4][9] = 'X';
                            break;
                        case "4":
                            System.out.println("I4");
                            PlayerOneArray[5][9] = 'X';
                            break;
                        case "5":
                            System.out.println("I5");
                            PlayerOneArray[6][9] = 'X';
                            break;
                        case "6":
                            System.out.println("I6");
                            PlayerOneArray[7][9] = 'X';
                            break;
                        case "7":
                            System.out.println("I7");
                            PlayerOneArray[8][9] = 'X';
                            break;
                        case "8":
                            System.out.println("I8");
                            PlayerOneArray[9][9] = 'X';
                            break;
                        case "9":
                            System.out.println("I9");
                            PlayerOneArray[10][9] = 'X';
                            break;
                    }
                    break;
                case "J":
                    switch (m) {
                        case "0":
                            System.out.println("J0");
                            PlayerOneArray[1][10] = 'X';
                            break;
                        case "1":
                            System.out.println("J1");
                            PlayerOneArray[2][10] = 'X';
                            break;
                        case "2":
                            System.out.println("J2");
                            PlayerOneArray[3][10] = 'X';
                            break;
                        case "3":
                            System.out.println("J3");
                            PlayerOneArray[4][10] = 'X';
                            break;
                        case "4":
                            System.out.println("J4");
                            PlayerOneArray[5][10] = 'X';
                            break;
                        case "5":
                            System.out.println("J5");
                            PlayerOneArray[6][10] = 'X';
                            break;
                        case "6":
                            System.out.println("J6");
                            PlayerOneArray[7][10] = 'X';
                            break;
                        case "7":
                            System.out.println("J7");
                            PlayerOneArray[8][10] = 'X';
                            break;
                        case "8":
                            System.out.println("J8");
                            PlayerOneArray[9][10] = 'X';
                            break;
                        case "9":
                            System.out.println("J9");
                            PlayerOneArray[10][10] = 'X';
                            break;
                    }
                    break;
            }

            for (i = 0; i < PlayerOneArray.length; i++)
                System.out.println(PlayerOneArray[i]);
            System.out.println("\n");
            for (i = 0; i < PlayerTwoArray.length; i++)
                System.out.println(PlayerTwoArray[i]);
            System.out.println("0 = Free space. \n I = Ship. \n X = Shoot.");
            count++;
        }while(count!=7);
    }

}


