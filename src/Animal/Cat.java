package Animal;

public class Cat extends Animal {
    public Cat(String name, String species, String color, int age) {
        super(name, species, color, age);
    }

    private final double MAX_RUN = 50.0;
    private final double MAX_JUMP = 10.0;

    @Override
    void run(double distance) {
        if (distance <= MAX_RUN) {
            System.out.println("Cat run : TRUE");
        } else {
            System.out.println("Cat run : FALSE");
        }
    }

    @Override
    void swim(double distance) {
        System.out.println("Сat can't swim : FALSE");

    }

    @Override
    void jump(double height) {
        if (height <= MAX_JUMP) {
            System.out.println("Cat jump : TRUE");
        } else {
            System.out.println("Cat jump : FALSE");
        }
    }
}
