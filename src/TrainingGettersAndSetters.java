public class TrainingGettersAndSetters {
    public static void main(String[] args) {

        Player player = new Player("MiF", 12, 150);

        player.setHealth(-20);

        System.out.println(player.getName());
        System.out.println(player.getLevel());
        System.out.println(player.getHealth());
    }
}