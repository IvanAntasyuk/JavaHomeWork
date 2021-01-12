package AnimalV2;

public class Dog  extends Animal{

    public Dog(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.MAX_JUMP = 12;
        this.MAX_SWIM = 20;
        this.MAX_RUN = 100;
    }


    @Override
    boolean run(double distance) {
        return super.run(distance);
    }

    @Override
    boolean swim(double distance) {
        return super.swim(distance);
    }

    @Override
    boolean jump(double height) {
        return super.jump(height);
    }
}
