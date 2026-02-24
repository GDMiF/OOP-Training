public class Fish extends Animal{

    Fish(String name, int age){
        super(name, age);
    }

    @Override
    void run(){
        System.out.println("This animal is swimming");
    }
}
