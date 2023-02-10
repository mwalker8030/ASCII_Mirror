package asciimirror;
import java.util.Scanner;

public class User {
    private Scanner scan;
    private StringBuilder userInput;

    /**
     * This is the constructor of the User class.
     */
    User(){
        initTools();
        initAttributes();
    }

    /**
     * This method is used to initialize the attributes of the class.
     */
    private void initAttributes() {
        userInput = new StringBuilder();
    }

    /**
     * This method is used to initialize the tools used in the class.
     */
    private void initTools() {
        scan = new Scanner(System.in);
    }

    public void promptUser(){
        promptRequest();
        userInput.append(scan.nextLine());

    }

    private void promptRequest() {
        System.out.println("Input the file path:");
    }

    public String getUserInput(){
        return userInput.toString();
    }
}
