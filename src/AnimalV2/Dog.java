package AnimalV2;

public class Dog  extends Animal{

    public Dog(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.maxJump = 12;
        this.maxSwim = 20;
        this.maxRun = 100;
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
