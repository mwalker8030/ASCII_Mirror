package asciimirror;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Creature creature = new Creature();
        user.promptUser();
        System.out.printf("%s\n", user.getUserInput());
        creature.printCow();
    }
}