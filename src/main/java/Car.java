public class Car extends Vehicle {
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(int maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    void move() {
        System.out.println("Car move");
    }
}
