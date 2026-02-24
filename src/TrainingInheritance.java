public class TrainingInheritance {
    public static void main(String[] args) {

        Dog dog = new Dog("Dzagloba", 4);
        Cat cat = new Cat("Katoba", 9);
        Fish fish = new Fish("Fizz", 3);

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.dogSound();
        cat.catSound();

        dog.run();
        cat.run();
        fish.run();


    }
}
