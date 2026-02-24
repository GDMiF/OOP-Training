public class Car2 {

    String brand;
    String model;
    int age;

    Car2(String brand, String model, int age){
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

     void drive(){
        System.out.println("your drive " + age + " " + brand + " " + model);
    }


}
