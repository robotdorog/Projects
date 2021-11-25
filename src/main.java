import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file5.txt";
        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file2.txt";
        String filePathToDeCrypt = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file2.txt";
        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file4.txt";

        FileHandler fileHandlerCrypt = new FileHandler(filePathToCrypt, filePathCryptResult);
        FileHandler fileHandlerDecrypt = new FileHandler(filePathToDeCrypt, filePathDeCryptResult);
        long m = System.currentTimeMillis();

        fileHandlerCrypt.crypt();
        fileHandlerDecrypt.decrypt();

        System.out.println("При использывании String программа выполняется: " + (double)(System.currentTimeMillis() - m) + " мс");
    }
}
