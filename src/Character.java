public abstract class Character {

    String name;
    int hp;

    Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

     abstract void attack();

}
