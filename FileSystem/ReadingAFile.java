import java.io.File;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) {
      try {
          File file = new File("new.txt");
          if(file.exists()){
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
          }
          else{
            System.out.println("File does not exist");
          }
      } catch (Exception e) {
        System.out.println("An error occurred ");
        e.printStackTrace();
      }
    }
}
