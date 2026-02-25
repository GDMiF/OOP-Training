public class ProjectWarrior extends ProjectCharacter implements ProjectAttack, ProjectTank{


    @Override
    void attack() {
        System.out.println("Jaime Lannister attacks with Sword!");
    }

    @Override
    public void attackDamage() {
        System.out.println("Warrior have attack damage");
    }

    @Override
    public void tankDamage() {
        System.out.println("Warrior can tank damage");
    }

}
