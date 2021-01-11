package Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Pite", "Dachshund", "Black", 2);
        dog.run(150);
        dog.swim(130);
        dog.jump(9);

        System.out.println();

        Cat cat = new Cat("Tom","Thai","White",1);
        cat.run(200);
        cat.jump(1);
        cat.swim(82);
    }
}
