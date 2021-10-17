import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cryptor {

    public String crypt(String toCryptFilePath, String cryptFileResultPath) throws IOException {

        String result = "";
        String strToCrypt = reader(toCryptFilePath);

        if (strToCrypt != null) {
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
            if (Files.exists(Path.of(cryptFileResultPath))) {
                writer(result, cryptFileResultPath);
            } else Files.createFile(Path.of(cryptFileResultPath));
            writer(result, cryptFileResultPath);
            return result;
        } else {
            return result;
        }
    }

    public String decrypt(String toDecryptFilePath, String decryptFileResultPath) throws IOException {

        String result = "";
        String strToDecrypt = reader(toDecryptFilePath);

        if (strToDecrypt != null) {
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
            if (Files.exists(Path.of(decryptFileResultPath))) {
                writer(result, decryptFileResultPath);
            } else Files.createFile(Path.of(decryptFileResultPath));
            writer(result, decryptFileResultPath);
            return result;
        } else {
            return result;
        }
    }

    private void writer(String Result, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(Result);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String reader(String filePath) {
        BufferedReader reader;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader(filePath));
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

