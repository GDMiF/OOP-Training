public class TrainingArrayofObjects {
    public static void main(String[] args) {

        Car2 car21 = new Car2("Ford","Mustang", 2021);
        Car2 car22 = new Car2("Subaru","Forester", 2018);
        Car2 car23 = new Car2("Volkswagen","Jetta", 2022);
        Car2 car24 = new Car2("Buick","Encore", 2015);

        Car2[] cars = { new Car2("Ford","Mustang", 2021),
                        new Car2("Subaru","Forester", 2018),
                        new Car2("Volkswagen","Jetta", 2022),
                        new Car2("Buick","Encore", 2015),
        };

        for(Car2 car: cars){
            car.drive();
        }

    }
}
