import java.util.Random;
import java.util.Scanner;

public class LessonThree {

        public static void main (String [] args){
            int guessNumber;
            int inputNumber;
            do {
                System.out.println("Угадайте число от 0 до 9\n" + "Введите число и нажмите Enter");
                Scanner scan = new Scanner(System.in);
                Random random = new Random();
                guessNumber = random.nextInt(9);
                for (int i = 0; i<4; i++){
                    if (i == 3 ) {
                        System.out.println("Вы проиграли это!!!\n" + "Загаданое число было " + guessNumber);
                        break;
                    }
                    inputNumber = scan.nextInt();

                    if (inputNumber==guessNumber){
                        System.out.println("Вы выйграли!!!! ");
                        break;
                    }
                    else if (inputNumber<guessNumber) System.out.println("Введёное вами число меньше чем загаданое ");
                    else if (inputNumber>guessNumber) System.out.println("Введёное вами число больше чем загаданое ");

                }
                System.out.println("Хотите сыграть еще раз ?\n" + "Если да нажмите : 1 \n" + "Если нет нажмите : 0 ");
                int again = scan.nextInt();
                while ((again < 1) || (again > 1) ){
                    if (again ==1) break;

                    else return;
                }
            }while (true);

        }

    }



