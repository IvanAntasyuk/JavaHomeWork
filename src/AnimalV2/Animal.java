package AnimalV2;

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

    abstract boolean run(double distance);

    abstract boolean swim(double distance);

    abstract boolean jump(double height);

}
