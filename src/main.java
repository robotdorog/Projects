import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {

        String filePathToCrypt = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file1.txt";
        String filePathCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file2.txt";
        String filePathToDeCrypt = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file3.txt";
        String filePathDeCryptResult = "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file4.txt";



        FileHandler fileHandlerCrypt = new FileHandler(filePathToCrypt, filePathCryptResult);
        FileHandler fileHandlerDecrypt = new FileHandler(filePathToDeCrypt, filePathDeCryptResult);
        Cryptor cryptor = new Cryptor();

        //




//        System.out.println(cryptor.crypt("C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file1.txt", "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file2.txt" ));
//        System.out.println(cryptor.decrypt("C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file3.txt", "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file4.txt" ));

    }
}
