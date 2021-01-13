package AnimalV2;

public class MiniDog extends Dog{
    public MiniDog(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.maxJump = 6;
        this.maxRun = 50;
        this.maxSwim = 10;
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
