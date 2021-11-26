import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandlerV2 {

    String fileIn;
    String fileOut;
    CryptorV2 cryptorV2;


    public FileHandlerV2(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
        cryptorV2 = new CryptorV2();

    }

    public void cryptV2() throws IOException {
        StringBuilder strToRead = readFromFile(fileIn);
        StringBuilder cryptedStringToWrite = cryptorV2.crypt(strToRead);
        writeToFile(cryptedStringToWrite, fileOut);

    }

    public void decryptV2() throws IOException {
        StringBuilder strToRead = readFromFile(fileIn);
        StringBuilder decryptedStringToWrite = cryptorV2.decrypt(strToRead);
        writeToFile(decryptedStringToWrite, fileOut);
    }

    private void writeToFile(StringBuilder strIn, String fileOut) {
        try (FileWriter writer = new FileWriter(fileOut)) {
            if (Files.exists(Path.of(fileOut))) {
                writer.write(String.valueOf(strIn));
                writer.flush();
            } else {
                Files.createFile(Path.of(fileOut));
                writer.write(String.valueOf(strIn));
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private StringBuilder readFromFile(String fileIn) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        String str = "";
        StringBuilder stringBuild = new StringBuilder();

        try {
//            while ((str = reader.readLine()) != null);
            str = reader.readLine();
            stringBuild.append(str);
            return stringBuild;
        } finally {
            reader.close();
        }
    }
}
