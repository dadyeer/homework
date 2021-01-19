import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        start(3);
    }

    static void start(int size) {
        char[][] field = getField(size);

        do {
            handlePlayerMove(field);
            drawField(field);

            if (checkFinal(field, 'X')) {
                break;
            }

            System.out.println();

            handleAIMove(field);
            drawField(field);

            if (checkFinal(field, 'O')) {
                break;
            }

        } while (true);
    }

    static boolean checkFinal(char[][] field, char sign) {
        if (checkWin(field, sign)) {
            String name = sign == 'X' ? "Player" : "Computer";
            System.out.printf("Congrats!!! %s is winner!%n", name);
            return true;
        }
        if (isDraw(field)) {
            System.out.println("There is draw!!!");
            return true;
        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        int moves = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != emptySymbol()) {
                    moves--;
                }
            }
        }

        return moves == 0;
    }

    static boolean checkWin(char[][] field, char sign) {
        // horizontal
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }

        // horizontal
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }

        // diagonals
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }

        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }

        return false;
    }

    static void handleAIMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'O';
    }

    static void handlePlayerMove(char[][] field) {
        int x, y;
        do {
            System.out.println("Please choose coordinates [X, Y]...");
            x = chooseCoordinate('X');
            y = chooseCoordinate('Y');
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'X';
    }

    static boolean isEmptyCoordinates(char[][] field, int x, int y) {
        return field[x][y] != emptySymbol();
    }

    static int chooseCoordinate(char sign) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [Range 1..3]...%n", sign);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > 2);

        return coordinate;
    }

    static char[][] getField(int size) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = emptySymbol();
            }
        }
        return field;
    }

    static char emptySymbol() {
        return '-';
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}