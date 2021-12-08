import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {
//
//        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\file5.txt";
//        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\file2.txt";
//        String filePathToDeCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\file2.txt";
//        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\file4.txt";

        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filetoCrypt.txt";
        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filecryptResult.txt";
        String filePathToDeCrypt = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filecryptResult.txt";
        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\filedecryptResult.txt";

        String filePathToCryptV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2toCrypt.txt";
        String filePathCryptResultV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2cryptResult.txt";
        String filePathToDeCryptV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2cryptResult.txt";
        String filePathDeCryptResultV2 = "C:\\Users\\Usr1\\IdeaProjects\\CryptorViaString\\src\\tasks\\fileV2decryptResult.txt";

//        FileHandler fileHandlerCrypt = new FileHandler(filePathToCrypt, filePathCryptResult);
//        FileHandler fileHandlerDecrypt = new FileHandler(filePathToDeCrypt, filePathDeCryptResult);

       CryptorViaString cryptorViaString =  new CryptorViaString();
       CryptorViaStringBuilder cryptorViaStringBuilder =  new CryptorViaStringBuilder();
       TestClass testClass = new TestClass(cryptorViaString, cryptorViaStringBuilder);

        long m = System.currentTimeMillis();

//        fileHandlerCrypt.crypt();
//        fileHandlerDecrypt.decrypt();


        System.out.println("При использывании String программа выполняется: " + (double)(System.currentTimeMillis() - m) + " мс");


        FileHandlerV2 fileHandlerCryptV2 = new FileHandlerV2(filePathToCryptV2, filePathCryptResultV2);
        FileHandlerV2 fileHandlerDecryptV2 = new FileHandlerV2(filePathToDeCryptV2, filePathDeCryptResultV2);
        long mV2 = System.currentTimeMillis();

        fileHandlerCryptV2.cryptV2();
        fileHandlerDecryptV2.decryptV2();

        System.out.println("При использывании StringBuilder программа выполняется: " + (double)(System.currentTimeMillis() - mV2) + " мс");

    }
}
