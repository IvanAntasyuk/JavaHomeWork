package AnimalV2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Pite", "Bulldog", "White", 12);
        dog.swim(10);
        dog.run(19);
        dog.jump(30);

        Cat cat = new Cat("Tom", "Thai", "Black", 1);
        cat.jump(10);
        cat.swim(2);
        cat.run(10);

        MiniDog miniDog = new MiniDog("Pimp","Spitz","Black-White",6);
        miniDog.jump(11);
        miniDog.swim(10);
        miniDog.run(50);

        miniDog.countAnimal();



    }
}
