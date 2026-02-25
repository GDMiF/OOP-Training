public abstract  class ProjectCharacter {

    String name;
    int level;
    int health;

    static int totalCharacters = 0;

    ProjectCharacter() {
        totalCharacters++;
    }

    public static void showTotalCharacters() {
        System.out.println("Total characters created: " + totalCharacters);
    }

    abstract void attack();

}
