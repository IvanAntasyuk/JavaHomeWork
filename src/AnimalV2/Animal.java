package AnimalV2;

abstract class Animal {

    protected String name;
    protected String species;
    protected String color;
    protected int age;

    protected double MAX_RUN;
    protected double MAX_SWIM;
    protected double MAX_JUMP;

    public Animal(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
    }

    boolean run(double distance) {
        if (distance >= 0 && distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + ":" + true);
            return true;
        }
        return false;

    }

    boolean swim(double distance) {
        if (distance >= 0 && distance <= MAX_SWIM) {
            System.out.println(name + " проплыл " + distance + ":" + true);
            return true;
        }
        return false;

    }

    boolean jump(double height) {
        if (height >= 0 && height <= MAX_JUMP) {
            System.out.println(name + " прыгнул " + height + ":" + true);
            return true;
        }
        return false;

    }

}
