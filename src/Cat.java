public class Cat extends Animal{

    Cat(String name, int age){
        super(name, age);
    }

    void catSound(){
        System.out.println("The cat " + name + " saying Meow Meow");
    }
}
