package CatsAndPlaceAndString;

public class Place {
    private int food;

    public Place(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }


    public void info() {
        System.out.println("Place : " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int x) {
        this.food += x;
    }
}
