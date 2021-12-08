import java.io.IOException;

public class TestClass implements Crypt {

    public TestClass(CryptorViaString cryptorViaString, CryptorViaStringBuilder cryptorViaStringBuilder){

    }

    public String crypt(String strToCrypt){
        long m = System.currentTimeMillis();
        String cryptedStringViaString = cryptorViaString.crypt(strToCrypt);
        String cryptedStringViaStringBuilder = cryptorViaStringBuilder.crypt(strToCrypt);
        double timeResult = (double)(System.currentTimeMillis() - m);
    }

    public String decrypt(String strToDecrypt){
    String cryptedStringViaString = decrypt(strToDecrypt);
    String cryptedStringViaStringBuilder = decrypt(strToDecrypt);

    }


    }



}
