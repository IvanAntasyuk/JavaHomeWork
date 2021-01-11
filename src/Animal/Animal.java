package Animal;

abstract class Animal {

    protected String name;
    protected String species;
    protected String color;
    protected int age;


    public Animal(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
    }

    abstract void run(double distance);

    abstract void swim(double distance);

    abstract void jump(double height);
}
