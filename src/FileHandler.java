import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    String fileIn;
    String fileOut;
    CryptorViaString cryptorViaString;
    CryptorViaStringBuilder cryptorViaStringBuilder;




    public FileHandler(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
        cryptorViaString = new CryptorViaString();
        cryptorViaStringBuilder = new CryptorViaStringBuilder();

    }



    private void writeToFile (String strIn, String fileOut) {
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

    private String readFromFile (String fileIn) throws IOException {
            BufferedReader reader;
            String str;
            reader = new BufferedReader(new FileReader(fileIn));
                str = reader.readLine();
            return str;
        }
    }

