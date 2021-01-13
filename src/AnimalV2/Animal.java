package AnimalV2;

abstract class Animal {

    static int count = 0;
    protected String name;
    protected String species;
    protected String color;
    protected int age;

    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;

    public Animal(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
        count++;
    }

    boolean run(int distance) {
        if (distance >= 0 && distance <= maxRun) {
            System.out.println(name + " пробежал " + distance + " : " + true);
            return true;
        }
        return false;

    }

    boolean swim(int distance) {
        if (distance >= 0 && distance <= maxSwim) {
            System.out.println(name + " проплыл " + distance + " : " + true);
            return true;
        }
        return false;

    }

    boolean jump(int height) {
        if (height >= 0 && height <= maxJump) {
            System.out.println(name + " прыгнул " + height + " : " + true);
            return true;
        }
        return false;
    }
    void countAnimal(){
        System.out.println("Всего создано животных : " + count);
    }

}
