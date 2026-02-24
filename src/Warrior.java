public class Warrior extends Character{

    int damage;

    Warrior(String name, int hp, int damage){
        super(name, hp);
        this.damage = damage;
    }

    @Override
    void attack(){
        System.out.println("You use sword attack your damage is " + damage);
    }

}
