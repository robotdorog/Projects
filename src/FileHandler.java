import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    String fileIn;
    String fileOut;


    public FileHandler(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
    }

    private void writeToFile(String fileIn, String fileOut, String Result) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileIn))) {
            if (Files.exists(Path.of(fileOut))) {
                writer.write(Result);
                writer.flush();
            } else {
                Files.createFile(Path.of(fileOut));
                writer.write(Result);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFromFile(String filePath) {
        BufferedReader reader;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader(filePath));
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
