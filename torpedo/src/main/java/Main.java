import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        String s,m;
        char[][] ShootingArray = {{' ','A','B','C','D','E','F','G','H','I','J'},
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

        char[][] ShippingArray = {{' ','A','B','C','D','E','F','G','H','I','J'},
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

        for(i=0;i< ShootingArray.length;i++)
            System.out.println(ShootingArray[i]);
        System.out.println("\n");
        for(i=0;i< ShippingArray.length;i++)
            System.out.println(ShippingArray[i]);

        System.out.println("Player 1's turn.");
        System.out.println("Choose coordinate one: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println("Choose coordinate two: ");
        Scanner inn = new Scanner(System.in);
        m = in.nextLine();
        System.out.println("Coordinate chosen: " + s + m);

        switch (s){
            case "A":
                switch(m){
                    case "0":
                        System.out.println("A0");
                        break;
                    case "1":
                        System.out.println("A1");
                        break;
                    case "2":
                        System.out.println("A2");
                        break;
                    case "3":
                        System.out.println("A3");
                        break;
                    case "4":
                        System.out.println("A4");
                        break;
                    case "5":
                        System.out.println("A5");
                        break;
                    case "6":
                        System.out.println("A6");
                        break;
                    case "7":
                        System.out.println("A7");
                        break;
                    case "8":
                        System.out.println("A8");
                        break;
                    case "9":
                        System.out.println("A9");
                        break;
                }
                break;
            case "B":
                switch(m){
                    case "0":
                        System.out.println("B0");
                        break;
                    case "1":
                        System.out.println("B1");
                        break;
                    case "2":
                        System.out.println("B2");
                        break;
                    case "3":
                        System.out.println("B3");
                        break;
                    case "4":
                        System.out.println("B4");
                        break;
                    case "5":
                        System.out.println("B5");
                        break;
                    case "6":
                        System.out.println("B6");
                        break;
                    case "7":
                        System.out.println("B7");
                        break;
                    case "8":
                        System.out.println("B8");
                        break;
                    case "9":
                        System.out.println("B9");
                        break;
                }
                break;
            case "C":
                switch(m){
                    case "0":
                        System.out.println("C0");
                        break;
                    case "1":
                        System.out.println("C1");
                        break;
                    case "2":
                        System.out.println("C2");
                        break;
                    case "3":
                        System.out.println("C3");
                        break;
                    case "4":
                        System.out.println("C4");
                        break;
                    case "5":
                        System.out.println("C5");
                        break;
                    case "6":
                        System.out.println("C6");
                        break;
                    case "7":
                        System.out.println("C7");
                        break;
                    case "8":
                        System.out.println("C8");
                        break;
                    case "9":
                        System.out.println("C9");
                        break;
                }
                break;
            case "D":
                switch(m){
                    case "0":
                        System.out.println("D0");
                        break;
                    case "1":
                        System.out.println("D1");
                        break;
                    case "2":
                        System.out.println("D2");
                        break;
                    case "3":
                        System.out.println("D3");
                        break;
                    case "4":
                        System.out.println("D4");
                        break;
                    case "5":
                        System.out.println("D5");
                        break;
                    case "6":
                        System.out.println("D6");
                        break;
                    case "7":
                        System.out.println("D7");
                        break;
                    case "8":
                        System.out.println("D8");
                        break;
                    case "9":
                        System.out.println("D9");
                        break;
                }
                break;
            case "E":
                switch(m){
                    case "0":
                        System.out.println("E0");
                        break;
                    case "1":
                        System.out.println("E1");
                        break;
                    case "2":
                        System.out.println("E2");
                        break;
                    case "3":
                        System.out.println("E3");
                        break;
                    case "4":
                        System.out.println("E4");
                        break;
                    case "5":
                        System.out.println("E5");
                        break;
                    case "6":
                        System.out.println("E6");
                        break;
                    case "7":
                        System.out.println("E7");
                        break;
                    case "8":
                        System.out.println("E8");
                        break;
                    case "9":
                        System.out.println("E9");
                        break;
                }
                break;
            case "F":
                switch(m){
                    case "0":
                        System.out.println("F0");
                        break;
                    case "1":
                        System.out.println("F1");
                        break;
                    case "2":
                        System.out.println("F2");
                        break;
                    case "3":
                        System.out.println("F3");
                        break;
                    case "4":
                        System.out.println("F4");
                        break;
                    case "5":
                        System.out.println("F5");
                        break;
                    case "6":
                        System.out.println("F6");
                        break;
                    case "7":
                        System.out.println("F7");
                        break;
                    case "8":
                        System.out.println("F8");
                        break;
                    case "9":
                        System.out.println("F9");
                        break;
                }
                break;
            case "G":
                switch(m){
                    case "0":
                        System.out.println("G0");
                        break;
                    case "1":
                        System.out.println("G1");
                        break;
                    case "2":
                        System.out.println("G2");
                        break;
                    case "3":
                        System.out.println("G3");
                        break;
                    case "4":
                        System.out.println("G4");
                        break;
                    case "5":
                        System.out.println("G5");
                        break;
                    case "6":
                        System.out.println("G6");
                        break;
                    case "7":
                        System.out.println("G7");
                        break;
                    case "8":
                        System.out.println("G8");
                        break;
                    case "9":
                        System.out.println("G9");
                        break;
                }
                break;
            case "H":
                switch(m){
                    case "0":
                        System.out.println("H0");
                        break;
                    case "1":
                        System.out.println("H1");
                        break;
                    case "2":
                        System.out.println("H2");
                        break;
                    case "3":
                        System.out.println("H3");
                        break;
                    case "4":
                        System.out.println("H4");
                        break;
                    case "5":
                        System.out.println("H5");
                        break;
                    case "6":
                        System.out.println("H6");
                        break;
                    case "7":
                        System.out.println("H7");
                        break;
                    case "8":
                        System.out.println("H8");
                        break;
                    case "9":
                        System.out.println("H9");
                        break;
                }
                break;
            case "I":
                switch(m){
                    case "0":
                        System.out.println("I0");
                        break;
                    case "1":
                        System.out.println("I1");
                        break;
                    case "2":
                        System.out.println("I2");
                        break;
                    case "3":
                        System.out.println("I3");
                        break;
                    case "4":
                        System.out.println("I4");
                        break;
                    case "5":
                        System.out.println("I5");
                        break;
                    case "6":
                        System.out.println("I6");
                        break;
                    case "7":
                        System.out.println("I7");
                        break;
                    case "8":
                        System.out.println("I8");
                        break;
                    case "9":
                        System.out.println("I9");
                        break;
                }
                break;
            case "J":
                switch(m){
                    case "0":
                        System.out.println("J0");
                        break;
                    case "1":
                        System.out.println("J1");
                        break;
                    case "2":
                        System.out.println("J2");
                        break;
                    case "3":
                        System.out.println("J3");
                        break;
                    case "4":
                        System.out.println("J4");
                        break;
                    case "5":
                        System.out.println("J5");
                        break;
                    case "6":
                        System.out.println("J6");
                        break;
                    case "7":
                        System.out.println("J7");
                        break;
                    case "8":
                        System.out.println("J8");
                        break;
                    case "9":
                        System.out.println("J9");
                        break;
                }
                break;
        }
    }

}


