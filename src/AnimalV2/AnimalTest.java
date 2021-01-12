package AnimalV2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Pite","Bulldog","White",12);
        dog.run(10);
        dog.swim(100);
        dog.jump(2);
        Cat cat = new Cat("Tom","Thai","Black",1);
        cat.run(5);
        cat.swim(100);
        cat.jump(1);

    }
}
