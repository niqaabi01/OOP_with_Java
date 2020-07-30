public class Car extends Vehicle {
    private int doors;


    Car(String colour, int passengers, int doors) {
        super(passengers, colour);
        this.doors = doors;
    }
    public String toString() {
        return super.toString()+" "+ doors+ " doors";
    }
}