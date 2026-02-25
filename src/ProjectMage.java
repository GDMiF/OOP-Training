public class ProjectMage extends ProjectCharacter implements ProjectAttack, ProjectHeal{

    @Override
    void attack() {
        System.out.println("Gandalf casts fireball");
    }

    @Override
    public void attackDamage() {
        System.out.println("Mage have attack damage");
    }

    @Override
    public void healDamage() {
        System.out.println("Mage can heal damage");
    }
}
