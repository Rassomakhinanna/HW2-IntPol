public class Main {
    public static void main(String[] args) {
            Car car = new Car("BMW", 4);
            Car car2 = new Car("Peugeot", 4);

            Truck truck = new Truck("Kamaz", 8);

            Bicycle bicycle = new Bicycle("Adriatica", 2);


            ServiceStation station = new ServiceStation();
            station.check(car);
            station.check(car2);
            station.check(bicycle);
            station.check(truck);
        }
}