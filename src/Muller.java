public class Muller implements Attacker, Defender{

    @Override
    public void attack(){
        System.out.println("Muller is attacker");
    }

    @Override
    public void defence(){
        System.out.println("Muller is defencer");
    }
}
