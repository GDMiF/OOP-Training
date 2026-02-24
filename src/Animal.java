public class Animal {

    boolean isAlive;
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating");
    }

    void run(){
        System.out.println("This animal is running");
    }

}
