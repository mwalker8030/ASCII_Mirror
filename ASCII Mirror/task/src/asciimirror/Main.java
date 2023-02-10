package asciimirror;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Creature creature = new Creature();
        Directory directory = new Directory();
        user.promptUser();
        //call method to open file from userInput
        directory.openFile(user.getUserInput());
    }
}