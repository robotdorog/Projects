import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\filetoCrypt.txt";

        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\filecryptResult.txt";
        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\filedecryptResult.txt";


        CryptorViaString cryptorViaString = new CryptorViaString();
        CryptorViaStringBuilder cryptorViaStringBuilder = new CryptorViaStringBuilder();
        Cryptor cryptor = new Cryptor(cryptorViaString, cryptorViaStringBuilder);
        FileHandler fileHandlerCrypt = new FileHandler(cryptor);

        String cryptResult = fileHandlerCrypt.readFromFile(filePathToCrypt);
        cryptResult = fileHandlerCrypt.cryptor.crypt(cryptResult);
        fileHandlerCrypt.writeToFile(cryptResult, filePathCryptResult);

        String decryptResult = fileHandlerCrypt.readFromFile(filePathToCrypt);
        decryptResult = fileHandlerCrypt.cryptor.decrypt(decryptResult);
        fileHandlerCrypt.writeToFile(decryptResult, filePathDeCryptResult);


    }
}
