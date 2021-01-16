package CatsAndPlaceAndString;

public class CatsAndPlaceTest {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Tom", 10), new Cat("Tim", 2), new Cat("Tod", 31)};
        Place place = new Place(30);

        for (Cat c : cat) {
            c.eat(place);
            System.out.println(c);
            place.info();

        }
        place.addFood(10);
        place.info();
    }
}
