public class Car {

    String brand;
    String model;
    int age;
    int speed;
    boolean isRunning;

    Car(String brand, String model, int age, int speed){
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.speed = speed;
    }

    void drive(){
        isRunning = true;
        System.out.println("You drive " + age + " " + brand + " " + model + " the speed is " + speed + "km/h");
    }
    void stop(){
        isRunning = false;
        System.out.println("You are not driving the car");
    }

}
