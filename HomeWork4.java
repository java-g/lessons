/**
 * Java 1. Lesson 4. HomeWork4
 *
 * @author Artem Valeev
 * @version dated Aug 24, 2018
 */
import java.util.Random;
import java.util.Scanner;

class HomeWork4 {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new HomeWork4();
    }

    HomeWork4() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
					
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

	//HomeWork mission
    boolean checkWin(char dot) {
        
        int vOk = 0; //vertical
		int hOk = 0; //horizontal
		int dOk = 0; //diagonal
		int rdOk = 0; //reverse diagonal		
		for (int i = 0; i < SIZE; i++) {
			vOk = 0;
			hOk = 0;
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == dot) hOk++;
				if (map[j][i] == dot) vOk++;
				if (i == j && map[i][j] == dot) dOk++;
				if (i == j && map[i][SIZE - (j + 1)] == dot) rdOk++;
			}
			if (hOk == SIZE  || vOk == SIZE  || dOk == SIZE || rdOk == SIZE) return true;	
		}
		return false;		  
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}