//AI HELPED

public class Player {

    private String name;
    private int level;
    private int health;
    private int damage;

    Player(String name, int level, int health) {
        this.name = name;
        this.level = level;
        setHealth(health);
    }

    String getName() {
        return name;
    }

    int getLevel() {
        return level;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

}