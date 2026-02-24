public class ProjectAnimalFarm {
    public static void main(String[] args) {

        Dog2 dog2 = new Dog2("Dzagloba", 4);
        Cat2 cat2 = new Cat2("Ciri", 11);

        Animal2 [] animals = {dog2, cat2};

        for(Animal2 animal : animals){
            animal.makeSound();
        }

    }
    }
