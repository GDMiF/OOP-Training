public class ProjectRPG {
    public static void main(String[] args) {

        ProjectWarrior projectWarrior = new ProjectWarrior();
        ProjectMage projectMage = new ProjectMage();
        ProjectArcher projectArcher = new ProjectArcher();
        ProjectCharacter.showTotalCharacters();

        ProjectCharacter[] characters = {projectWarrior, projectMage, projectArcher};

        for (ProjectCharacter character : characters) {
            character.attack();
        }

        ProjectAttack[] attackers = {projectWarrior, projectArcher, projectMage};

        for (ProjectAttack attack : attackers) {
            attack.attackDamage();
        }

        ProjectHeal[] healers = {projectMage};

        for (ProjectHeal heal : healers) {
            heal.healDamage();
        }

        ProjectTank[] tanks = {projectWarrior};

        for (ProjectTank tank : tanks) {
            tank.tankDamage();
        }


    }
}
