public class TraningInterfaces {
    public static void main(String[] args) {

        Messi messi = new Messi();
        Maldini maldini = new Maldini();
        Muller muller = new Muller();

        Attacker [] attackers = {messi, muller};

        for(Attacker attacker : attackers){
            attacker.attack();
        }

        Defender [] defenders = {maldini, muller};

        for(Defender defender : defenders){
            defender.defence();
        }


    }
}
