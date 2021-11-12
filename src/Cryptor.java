import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cryptor {


    public String crypt(String strToCrypt) throws IOException {

        String result = "";

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
            return result;
        } else {
            return result;
        }
    }

    public String decrypt(String strToDecrypt) throws IOException {

        String result = "";

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

            return result;
        } else {
            return result;
        }
    }

}


