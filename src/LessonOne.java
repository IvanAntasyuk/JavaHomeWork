public class LessonOne {
    public static void main (String [] args){                                          //задание 1
        System.out.println("Возврат результата : " + calculateExpressions(2,3,5,13));
        System.out.println(isCheckEqualityNum(7,4));
        positiveOrNegative(-10);
        sayHello(  " Вася");
        System.out.println("Возврат метода  " + isReturnTrue(-99));
        whatIsYear(8);
    }
    static void typeVar(){                                                            //Задание 2
        // примитивные типы :
        //целочисленные примитивные переменные
        byte a = 8;
        short s = 10;
        int r = 12777;
        long t = 1500000;
        // переменные с плавующей точкой
        float ft = 12.2f;
        double db = 1.2223412;
        //символьная переменная
        char ch = 'G';
        char ch1 = 71;
        //логоческая переменная
        boolean b = true;
        //ссылочные переменные
        String str = "Hello";
    }
    static int calculateExpressions(int a,int b, int c, int d){ //Задание 3
        return  a * (b + (c / d));
    }   // Задание 4



    static boolean isCheckEqualityNum(int a, int b){                                           // Задание 4
        int sum = a + b;
        if (sum>10 && sum<20) {
            return true;
        }else return false;
    }
    static void positiveOrNegative(int z){                                                     //Задание 5
        if (z>=0){
            System.out.println(z + " " + "Число положительное");
        }else if (z<0){
            System.out.println(z + " " + "Число отрицательное");
        }
    }
    static boolean isReturnTrue(int tr){                                                  //Задание 6
        if (tr<0) {
            return true;
        }else return false;
    }


    static void  sayHello(String name){                                            //Задание 7
        System.out.println("Привет"+ "" + name);
    }//Задание 7


    static void whatIsYear(int years){
        if (years %4 !=0 || years %100 ==0 && years %400 !=0){                     //Задание 8
            System.out.println(years + "Не високосный год");
        }else System.out.println("Високосный год");
    }

}

