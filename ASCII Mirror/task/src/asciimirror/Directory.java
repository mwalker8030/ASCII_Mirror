package asciimirror;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Directory {
    public Directory(){ }

    public void openFile(String path){
        try(Scanner scan = new Scanner(new File(path))){
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

}
