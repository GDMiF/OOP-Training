public class Dog2 extends Animal2{

    Dog2(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is " + age + " year old he make sound: Wuf Wuf");
    }
}
