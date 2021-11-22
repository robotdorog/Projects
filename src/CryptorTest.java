import org.junit.Assert;

class CryptorTest {
    Cryptor cryptor = new Cryptor();

    @org.junit.jupiter.api.Test
    void cryptBasicTest() {
        String testString = "A2a3b3z3tcz3";
        String resultString = cryptor.crypt("AAaaabbbzzztczzz");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decryptBasicTest() {
        String testString = "AAaaabbbzzztczzz";
        String resultString = cryptor.decrypt("A2a3b3z3tcz3");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void cryptOneCharTest() {
        String testString = "a";
        String resultString = cryptor.decrypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decryptOneCharTest() {
        String testString = "a";
        String resultString = cryptor.decrypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void cryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptor.decrypt("");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptor.decrypt("");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void cryptOneRepeatTest() {
        String testString = "a3";
        String resultString = cryptor.crypt("aaa");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decryptOneRepeatTest() {
        String testString = "aaa";
        String resultString = cryptor.decrypt("a3");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void cryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptor.decrypt("abcdef");
        Assert.assertEquals(testString, resultString);
    }

    @org.junit.jupiter.api.Test
    void decryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptor.decrypt("abcdef");
        Assert.assertEquals(testString, resultString);

    }
}