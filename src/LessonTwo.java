public class LessonTwo {
        public static void main(String[] args) {
            changeVar0on1();
            System.out.println("\n");
            emptyArr();
            System.out.println("\n");
            loopMultiplication();
            System.out.println("\n");
            createSquareArr();
            System.out.println("\n");


        }

        static void changeVar0on1() {
            int[] arr = new int[5];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 0;
            arr[3] = 0;
            arr[4] = 1;
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Before arr[ " + arr[i] + " ]");
                if (arr[i] != 0) arr[i] = 0;
                else if (arr[i] != 1) arr[i] = 1;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("After arr [ " + arr[i] + " ]");
            }
        }

        static void emptyArr() {
            int[] arr = new int[8];
            for (int i = 0, j = 0; i < arr.length; i++, j = j + 3) {
                arr[i] = j;
                System.out.println(arr[i]);
            }
        }

        static void loopMultiplication() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Before " + arr[i]);
                if (arr[i] < 6) arr[i] *= 2;
                System.out.println("After" + arr[i]);
            }
        }

        static void createSquareArr() {
            int arr[][] = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j || i == arr.length - 1 - j) {
                        arr[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + "");
                }
                System.out.println();
            }
        }

    }
