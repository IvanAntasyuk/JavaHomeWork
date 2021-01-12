package AnimalV2;

public class Cat extends Animal {

    public Cat(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.MAX_RUN = 50.0;
        this.MAX_JUMP = 2;
    }

    @Override
    boolean run(double distance) {
        return super.run(distance);
    }

    boolean swim(double distance) {
        System.out.println(name + " Не умеет плавать");
        return true;
    }

    @Override
    boolean jump(double height) {
        return super.jump(height);
    }
}
