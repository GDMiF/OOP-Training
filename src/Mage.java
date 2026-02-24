public class Mage extends Character{

    int damage;

    Mage(String name, int hp, int damage){
        super(name, hp);
        this.damage = damage;
    }

    @Override
    void attack(){
        System.out.println("You use mage attack your damage is " + damage);
    }

}
