public class Main1 {
    public static void main(String[] args) {

        Mage mage = new Mage("MiF", 100, 30);
        Warrior warrior = new Warrior("MiF", 100, 50);

        Character [] characters = {mage, warrior};

        for(Character character : characters){
            character.attack();
        }

    }
}
