import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandlerV2 {

    String fileIn;
    String fileOut;
    Cryptor cryptor;
    CryptorV2 cryptorV2;



    public FileHandler(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
        cryptor = new Cryptor();

    }

    public void crypt() throws IOException {
        String strToRead = readFromFile(fileIn);
        String cryptedStringToWrite = cryptor.crypt(strToRead);
        writeToFile(cryptedStringToWrite, fileOut);

    }

    public void decrypt() throws IOException {
        String strToRead = readFromFile(fileIn);
//        System.out.println("String to decrypt: " + strToRead);
        String decryptedStringToWrite = cryptor.decrypt(strToRead);
//        System.out.println("Decrypted string to write:" + decryptedStringToWrite);
        writeToFile(decryptedStringToWrite, fileOut);
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
