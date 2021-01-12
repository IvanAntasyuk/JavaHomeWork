package AnimalV2;

public class Cat extends Animal {

    public Cat(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.MAX_RUN = 50.0;
        this.MAX_JUMP = 2;
    }


    @Override
    boolean run(double distance) {
        if (distance >= 0 && distance <= MAX_RUN) {
            System.out.println("Cat run : true");
            return true;
        }
        return false;
    }

    @Override
    boolean swim(double distance) {
        return false;
    }

    @Override
    boolean jump(double height) {
        if (height >= 0 && height <= MAX_JUMP) {
            System.out.println("Cat jump : true");
            return true;
        }
        return false;
    }
}
