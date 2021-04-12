public class Train extends Vehicle {
    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public int trackWidth;

    public Train(int maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    void move() {
        System.out.println("train move");
    }
}
