package CatsAndPlaceAndString;

public class StringTest {
    public void stringGet(String s) {
        System.out.println(s);                           // Задание А
    }


    public static void main(String[] args) {
        StringTest s1 = new StringTest();
        String stg1 = new String("Hello World");
        System.out.println(stg1.length());

        s1.stringGet(stg1);// Задание 1

        System.out.println(stg1.charAt(10));// Задание Б

        System.out.println(stg1.endsWith("!!!")); // Задание В

        System.out.println(stg1.startsWith("H")); // Задание Г

        System.out.println(stg1.contains("World")); // Задание Д

        System.out.println(stg1.replace('l','d'));// Задание Ж

        System.out.println(stg1.toUpperCase()); // Задание З

        System.out.println(stg1.toLowerCase());// Задание И

        System.out.println(stg1.substring(6,11));// Задание К






    }
}