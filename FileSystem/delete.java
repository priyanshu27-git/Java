
import java.io.File;

public class delete {
    public static void main(String[] args) {
        File file = new File("new.txt");
        try {
            if(file.delete()) {
                System.out.println("File deleted successfully: " + file.getName());
            } else {
                System.out.println("Failed to delete the file. It may not exist or is in use.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }
}
