public class ServiceStation {

    public void checkTransport(Transport transport) {
        System.out.printf("Обслуживается: [%s]\n", transport.getModelName());
        transport.check();
    }

    public void check(Car car) {
        car.check();
    }

    public void check(Bicycle bicycle) {
        bicycle.check();
    }

    public void check(Truck truck) {
        truck.check();
    }
}