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
        if (distance>=0 && distance <=MAX_RUN){
            System.out.println("Dog run : true");
           return true;
        }
        return false;
    }

    @Override
    boolean swim(double distance) {
        if (distance>=0 && distance <=MAX_SWIM){
            System.out.println("Dog swim : true");
            return true;
        }
        return false;
    }

    @Override
    boolean jump(double height) {
        if (height>=0 && height <=MAX_JUMP){
            System.out.println("Dog jump : true");
            return true;
        }
        return false;
    }
}
