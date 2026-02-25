public class ProjectArcher extends ProjectCharacter implements ProjectAttack{

    @Override
    void attack() {
        System.out.println("Legolas shoots an arrow");
    }

    @Override
    public void attackDamage() {
        System.out.println("Archer Have attack damage");
    }
}
