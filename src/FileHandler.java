import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    String fileIn;
    String fileOut;
    Cryptor cryptor;


    public FileHandler(String fileIn, String fileOut) {
        this.fileIn = fileIn;
        this.fileOut = fileOut;
        cryptor = new Cryptor();

    }

    public void crypt() throws IOException {
        String strToRead = readFromFile(fileIn);
        String cryptedStringToWrite = cryptor.crypt(strToRead);
        System.out.println("Crypted string to write:" + cryptedStringToWrite);
        writeToFile(cryptedStringToWrite, fileOut);

    }

    public void decrypt() throws IOException {
        String strToRead = readFromFile(fileIn);
        String decryptedStringToWrite = cryptor.decrypt(strToRead);
        System.out.println("Decrypted string to write:" + decryptedStringToWrite);
        writeToFile(decryptedStringToWrite, fileOut);
    }

    private void writeToFile (String strIn, String fileOut) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {
                if (Files.exists(Path.of(fileOut))) {
                    System.out.println("Writer:" + strIn);
                    writer.write(strIn);
                    writer.flush();
                } else {
                    Files.createFile(Path.of(fileOut));
                    System.out.println("Writer:" + strIn);
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

        System.out.println("This string is from read method:" + str);
            return str;
        }
    }

