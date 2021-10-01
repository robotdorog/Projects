import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {
        Cryptor cryptor = new Cryptor();
        System.out.println(cryptor.crypt("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file1.txt"));
        System.out.println(cryptor.decrypt());

    }
}
