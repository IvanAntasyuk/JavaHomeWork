package CatsAndPlaceAndString;

public class Cat {
    private final String name;
    private int apitite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.apitite = appetite;
        this.satiety = false;
    }

    public void eat(Place p) {
        if (apitite <= p.getFood()) {
            p.decreaseFood(apitite);
            satiety = true;
        } else {
            satiety = false;
        }
    }


    public String toString() {
        return "Кот : " + name + "\nГолод : " + apitite + "\nСытость : " + satiety + "\n";
    }
}
