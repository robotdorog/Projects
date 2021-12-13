import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filetoCrypt.txt";
        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filecryptResult.txt";
        String filePathToDeCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filecryptResult.txt";
        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filedecryptResult.txt";

        String filePathToCryptV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2toCrypt.txt";
        String filePathCryptResultV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2cryptResult.txt";
        String filePathToDeCryptV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2cryptResult.txt";
        String filePathDeCryptResultV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2decryptResult.txt";

        FileHandler fileHandlerCrypt = new FileHandler(Cryptor cryptor);



    }
}
