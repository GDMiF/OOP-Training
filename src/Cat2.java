public class Cat2 extends Animal2{


    Cat2(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is " + age + " years old he make sound: Meow Meow");
    }

}
