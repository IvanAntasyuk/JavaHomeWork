import java.util.Random;
import java.util.Scanner;

public class LessonFour {



        private static final int SIZE = 3;
        private static final char[][] map = new char[SIZE][SIZE];

        private static final char DOT_EMPTY ='•',DOT_X = 'X',DOT_O = 'O';


        private static final Scanner SCANNER = new Scanner(System.in);

        public static void main(String[] args) {
            initialazeGame();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if(checkWin(DOT_X)) {
                    System.out.println("Человек выйграл!!!");
                    break;
                }
                if(isMapFull()){
                    System.out.println("Ничья");
                    break;
                }

                aiTrun();
                printMap();
                if(checkWin(DOT_O)){
                    System.out.println("Компьютер выйграл!!!");
                    break;
                }
                if(isMapFull()){
                    System.out.println("Ничья");
                    break;
                }
            }


        }

        private static boolean isMapFull(){
            for (char[] rows : map) {
                for (char cellValue : rows) {
                    if (cellValue == DOT_EMPTY){
                        return  false;
                    }

                }
            }
            return true;
        }

        private static boolean checkWin(char symbol){
                for (int i = 0; i < 3; i++)
                    if ((map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol) ||
                            (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol))
                        return true;
                if ((map[0][0] == symbol&& map[1][1] == symbol && map[2][2] == symbol) ||
                        (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol))
                    return true;
                return false;











           // if(map[0][0] == symbol && map [0][1] == symbol && map[0][2] == symbol) return true;
           // if(map[1][0] == symbol && map [1][1] == symbol && map[1][2] == symbol) return true;
           // if(map[2][0] == symbol && map [2][1] == symbol && map[2][2] == symbol) return true;
//
           // if(map[0][0] == symbol && map [1][0] == symbol && map[2][0] == symbol) return true;
           // if(map[0][1] == symbol && map [1][1] == symbol && map[2][1] == symbol) return true;
           // if(map[0][2] == symbol && map [1][2] == symbol && map[2][2] == symbol) return true;
//
           // if(map[0][0] == symbol && map [1][1] == symbol && map[2][2] == symbol) return true;
           // if(map[0][2] == symbol && map [1][1] == symbol && map[2][0] == symbol) return true;

           // return false;


        }

        private static void aiTrun() {
            int rowIndex ;
            int colIndex ;
            Random rand = new Random();
            do {
                rowIndex = rand.nextInt(SIZE);
                colIndex = rand.nextInt(SIZE);

            } while (!isCellValid(rowIndex, colIndex));

            map[rowIndex][colIndex] = DOT_O;
        }


        private static void humanTurn() {
            int rowIndex = -1;
            int colIndex = -1;
            do {
                System.out.print("Введите номер строки : ");
                if (!SCANNER.hasNextInt()){
                    SCANNER.nextLine();
                    System.out.println("Введите число!");
                    continue;
                }
                rowIndex = SCANNER.nextInt() - 1;
                System.out.print("Введите номер столбца : ");
                colIndex = SCANNER.nextInt() - 1;
            } while (!isCellValid(rowIndex, colIndex));

            map[rowIndex][colIndex] = DOT_X;
        }

        private static boolean isCellValid(int rowIndex, int colIndex) {
            if(!isArrayIndexValid(rowIndex) | !isArrayIndexValid(colIndex)){
                System.out.println("Индекс строки и колонки должны быть в диапозоне от 0 до" + SIZE);
                return false;
            }
            if (map[rowIndex][colIndex] != DOT_EMPTY){
                System.out.println("Ячейка занята!");
                return false;
            }
            return true;
        }

        private static boolean isArrayIndexValid(int index) {
            return index >= 0 && index < SIZE;
        }

        private static void printMap() {
            printHeader();
            printMapState();
            System.out.println();

        }

        private static void printMapState() {
            for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
                System.out.print((rowIndex + 1) + " ");
                for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                    System.out.print(map[rowIndex][colIndex] + " ");
                }
                System.out.println();
            }
        }

        private static void printHeader() {
            for (int i = 0; i <=SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static void initialazeGame() {
            for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
                for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                    map[rowIndex][colIndex] = DOT_EMPTY;

                }

            }
        }


    }


