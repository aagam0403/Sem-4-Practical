//Interface
interface Vehicle {
    int wheels = 4;
    void stop();
    default void run() {
        System.out.println("Run");
    }
}

class Car implements Vehicle {
    public void stop() {
        System.out.println("Stop the Vehicle");
    }

    void display() {
        System.out.println("Welcome");
    }
}

class interfacedemo {
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.stop();
        c.display();
        c.run();
        System.out.println(Vehicle.wheels);
    }
}
