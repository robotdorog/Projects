import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
    Cryptor cryptor;

    public FileHandler(Cryptor cryptor) {
        this.cryptor = cryptor;

    }

    public void writeToFile (String strIn, String fileOut) {
            try (FileWriter writer = new FileWriter(fileOut)) {
                if (Files.exists(Path.of(fileOut))) {
                    writer.write(strIn);
                    writer.flush();
                } else {
                    Files.createFile(Path.of(fileOut));
                    writer.write(strIn);
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public String readFromFile (String fileIn) throws IOException {
            BufferedReader reader;
            String str;
            reader = new BufferedReader(new FileReader(fileIn));
                str = reader.readLine();
            return str;
        }
    }

