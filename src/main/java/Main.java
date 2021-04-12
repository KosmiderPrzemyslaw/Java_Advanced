public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(22, "audi", "combi");
        Vehicle train = new Train(11, "taurus", 33);

        Vehicle[] tab = new Vehicle[2];
        tab[0] = car;
        tab[1] = train;

        for (Vehicle v: tab
             ) {
            System.out.println(v.toString());
        }
    }
}
