
public class Cryptor {

    public String crypt(String strToCrypt) {

        String result = "";

        if (strToCrypt != null && !strToCrypt.equals("")) {
            int count = 0;
            char currentChar = 0;

            for (int i = 0; i < strToCrypt.length(); i++) {
                if (currentChar == strToCrypt.charAt(i)) {
                    count++;
                } else {
                    if (currentChar != 0)
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
        }
        return result;
    }

    public String decrypt(String strToDecrypt) {

        String result = "";
        char currentChar = 0;
        int count;

        if (strToDecrypt != null && !strToDecrypt.equals("")) {

            for (int i = 0; i < strToDecrypt.length(); i++) {
                if (Character.isDigit(strToDecrypt.charAt(i))) {
                    count = Character.getNumericValue(strToDecrypt.charAt(i));
                    for (int j = 1; j < count; j++) {
                        result += currentChar;
                    }
                } else {
                    currentChar = strToDecrypt.charAt(i);
                    if (currentChar != 0)
                        result += currentChar;
                }
            }

            if (!Character.isDigit(strToDecrypt.charAt(strToDecrypt.length() - 1)) &&
                    !(currentChar == (strToDecrypt.charAt(strToDecrypt.length() - 1))))
                result += currentChar;
        }
        return result;
    }
}


