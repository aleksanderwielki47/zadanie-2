interface Vehicle{
    void start();
    void stop();

    default void fuelUp(){
        System.out.println("tankowanie");
    }

    static void service(){
        System.out.println("serwisowanie");
    }
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Auto startuje");
    }

    @Override
    public void stop() {
        System.out.println("Auto stopuje");
    }
}

class Motorcycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("motor startuje");
    }

    @Override
    public void stop() {
        System.out.println("motor stopuje");
    }
}









public class Main {
    public static void main(String[] args) {
        Vehicle.service();

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.start();
        car.stop();
        car.fuelUp();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.fuelUp();





    }
}