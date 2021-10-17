import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {
        Cryptor cryptor = new Cryptor();
        System.out.println(cryptor.crypt("C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file1.txt", "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file2.txt" ));
        System.out.println(cryptor.decrypt("C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file3.txt", "C:\\Users\\Usr1\\IdeaProjects\\Cryptor\\src\\tasks\\file4.txt" ));

    }
}
