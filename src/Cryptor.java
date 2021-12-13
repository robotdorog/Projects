import java.io.IOException;

public class Cryptor implements Crypt {

    CryptorViaString cryptorViaString;
    CryptorViaStringBuilder cryptorViaStringBuilder;

    public Cryptor(CryptorViaString cryptorViaString, CryptorViaStringBuilder cryptorViaStringBuilder) {
        this.cryptorViaString = cryptorViaString;
        this.cryptorViaStringBuilder = cryptorViaStringBuilder;

    }

    public String crypt(String strToCrypt) {
        long m = System.currentTimeMillis();
        String cryptedStringViaString = cryptorViaString.crypt(strToCrypt);
        String cryptedStringViaStringBuilder = cryptorViaStringBuilder.crypt(strToCrypt);
        double timeResult = (double) (System.currentTimeMillis() - m);
        System.out.println("Время выполнения шифрования с ипсользованием StringBuilder: " + timeResult);

        return cryptedStringViaStringBuilder;
    }

    public String decrypt(String strToDecrypt) {
        long m = System.currentTimeMillis();
        String cryptedStringViaString = cryptorViaString.decrypt(strToDecrypt);
        String cryptedStringViaStringBuilder = cryptorViaStringBuilder.decrypt(strToDecrypt);
        double timeResult = (double) (System.currentTimeMillis() - m);
        System.out.println("Время выполнения шифрования с ипсользованием StringBuilder: " + timeResult);

        return cryptedStringViaStringBuilder;

    }


}




