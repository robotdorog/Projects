import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CryptorTest {
    Cryptor cryptor = new Cryptor();
    @org.junit.jupiter.api.Test
    void crypt() {
        String testString = "A2a3b3z3tcz3";
        String resultString = cryptor.crypt("AAaaabbbzzztczzz");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decrypt() {
        String testString = "Aa3b3z3tcz3";
        String resultString = cryptor.decrypt("Aaaabbbzzztczzzz");
        Assert.assertEquals(testString, resultString);
    }
}