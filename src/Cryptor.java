import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cryptor {

    public String crypt(String str) throws IOException {
        // решить вопрос с обработкой пустой строки

        String result = "";
        if (str == null) {

            return result;
        } else {
            String strToCrypt = CryptReader();
            int count = 0;
            char currentChar = 0;

            for (int i = 0; i < strToCrypt.length(); i++) {

                if (currentChar == strToCrypt.charAt(i)) {
                    count++;
                } else {
                    result += currentChar;

                    if (count > 1) {
                        result += count;
                    }
                    currentChar = strToCrypt.charAt(i);

                    count = 1;
                }
            }
            if (count > 1) {
                result += strToCrypt.charAt(strToCrypt.length() - 1);
                result += count;
            } else
                result += strToCrypt.charAt(strToCrypt.length() - 1);


            if (Files.exists(Path.of("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file2.txt"))) {
                CryptWriter(result);
            } else Files.createFile(Path.of("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file2.txt"));
            CryptWriter(result);

        }

        return result;
    }

    public String decrypt() throws IOException {

        String result = "";
        String strToDecrypt = DeCryptReader();

        char currentChar = 0;
        int count = 0;
        for (int i = 0; i < strToDecrypt.length(); i++) {
            if (Character.isDigit(strToDecrypt.charAt(i))) {
                count = Character.getNumericValue(strToDecrypt.charAt(i));
                for (int j = 1; j < count; j++) {

                    result += currentChar;
                }

            } else {
                result += currentChar;
            }
            if (!Character.isDigit(strToDecrypt.charAt(i)))
                currentChar = strToDecrypt.charAt(i);

        }

        if (!Character.isDigit(strToDecrypt.charAt(strToDecrypt.length() - 1)))
            result += currentChar;
        else {
            for (int i = 0; i < strToDecrypt.length(); i++)
                count = Character.getNumericValue(strToDecrypt.charAt(i));
            for (int j = 1; j < count; j++) {

                result += currentChar;
            }

        }

        if (Files.exists(Path.of("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file4.txt"))) {
            DeCryptWriter(result);
        } else Files.createFile(Path.of("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file4.txt"));

        DeCryptWriter(result);
        return result;
    }


    private void CryptWriter(String str) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file2.txt"))) {
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private void DeCryptWriter(String str) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file4.txt"))) {
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private String CryptReader() {
        BufferedReader reader;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file1.txt"));

            str = reader.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;

    }

    private String DeCryptReader() {
        BufferedReader reader;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Usr1\\IdeaProjects\\Crypt\\src\\tasks\\file3.txt"));

            str = reader.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

}

