import java.io.FileWriter;
import java.io.IOException;

public class WritingaFIle {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("new.txt");
            Writer.write("Heyy youu \n");
            Writer.write("This is written by a file name Writing a file ");
            Writer.close();
        } catch (IOException e) {
            System.out.println("An error occured ");
            e.printStackTrace();
        }
    }
}
