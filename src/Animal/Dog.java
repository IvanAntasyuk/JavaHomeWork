package Animal;

public class Dog extends Animal {
    public Dog(String name, String species, String color, int age) {
        super(name, species, color, age);
    }

    private final double MAX_RUN = 200.0;
    private final double MAX_JUMP = 10.0;
    private final double MAX_SWIM = 99.0;


    @Override
    void run(double distance) {
        if (distance <= MAX_RUN) {
            System.out.println("Dog run : TRUE");
        } else {
            System.out.println("Dog run : FALSE");
        }
    }

    @Override
    void swim(double distance) {
        if (distance <= MAX_SWIM) {
            System.out.println("Dog swim : TRUE");
        } else {
            System.out.println("Dog swim : FALSE");
        }
    }

    @Override
    void jump(double height) {
        {
            if (height <= MAX_JUMP) {
                System.out.println("Dog jump : TRUE");
            } else {
                System.out.println("Dog jump : FALSE");
            }
        }
    }
}
