package workshop5;


abstract class Vehicle {
    abstract void wheel();
    
    void door() {
        System.out.println("This vehicle has standard doors.");
    }
}

class Bus extends Vehicle {
    @Override
    void wheel() {
        System.out.println("The Bus has 6 heavy-duty wheels.");
    }
}

public class qs6 {
    public static void main(String[] args) {
        Bus myBus = new Bus();
        myBus.wheel();
        myBus.door();
    }
}
