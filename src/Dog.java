public class Dog extends Animal{

    Dog(String name, int age){
        super(name, age);
    }

    void dogSound(){
        System.out.println("The dog " + name + " saying Wuf Wuf");
    }

}
