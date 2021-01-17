package AnimalV2;

public class Cat extends Animal {

    public Cat(String name, String species, String color, int age) {
        super(name, species, color, age);
        this.maxRun = 50;
        this.maxJump = 2;
    }

    @Override
    boolean run(int distance) {
        return super.run(distance);
    }

    boolean swim(int distance) {
        System.out.println(name + " Не умеет плавать");
        return true;
    }

    @Override
    boolean jump(int height) {
        return super.jump(height);
    }
}
