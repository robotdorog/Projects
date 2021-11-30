import org.junit.Assert;
import org.junit.Test;


public class CryptorTest {
    Cryptor cryptor = new Cryptor();
    CryptorV2 cryptorV2 = new CryptorV2();
    StringBuilder testStringBuilder = new StringBuilder();
    StringBuilder resultSringBuilder = new StringBuilder();

    @Test
    public void cryptBasicTest() {
        String testString = "A2a3b3z3tcz3";
        String resultString = cryptor.crypt("AAaaabbbzzztczzz");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptBasicTest() {
        String testString = "AAaaabbbzzztczzz";
        String resultString = cryptor.decrypt("A2a3b3z3tcz3");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptOneCharTest() {
        String testString = "a";
        String resultString = cryptor.decrypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptOneCharTest() {
        String testString = "a";
        String resultString = cryptor.decrypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptor.decrypt("");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptor.decrypt("");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptOneRepeatTest() {
        String testString = "a3";
        String resultString = cryptor.crypt("aaa");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptOneRepeatTest() {
        String testString = "aaa";
        String resultString = cryptor.decrypt("a3");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptor.decrypt("abcdef");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptor.decrypt("abcdef");
        Assert.assertEquals(testString, resultString);

    }

    // CryptorV2

    @Test
    public void cryptBasicV2Test() {
        StringBuilder testStringBuilder = new StringBuilder("A2a3b3z3tcz3");
        StringBuilder resultSringBuilder = cryptorV2.crypt(new StringBuilder("AAaaabbbzzztczzz"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void decryptBasicV2Test() {
        StringBuilder testStringBuilder = new StringBuilder("AAaaabbbzzztczzz");
        StringBuilder resultSringBuilder = cryptorV2.decrypt(new StringBuilder("A2a3b3z3tcz3"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void cryptV2OneCharTest() {
        StringBuilder testStringBuilder = new StringBuilder("a");
        StringBuilder resultSringBuilder = cryptorV2.crypt(new StringBuilder("a"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void decryptV2OneCharTest() {
        StringBuilder testStringBuilder = new StringBuilder("a");
        StringBuilder resultSringBuilder = cryptorV2.decrypt(new StringBuilder("a"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void cryptV2EmptyStrTest() {
        String emptyStrTest = "";
        StringBuilder testStringBuilder = new StringBuilder(emptyStrTest);
        StringBuilder resultSringBuilder = cryptorV2.crypt(new StringBuilder(emptyStrTest));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void decryptV2EmptyStrTest() {
        String emptyStrTest = "";
        StringBuilder testStringBuilder = new StringBuilder(emptyStrTest);
        StringBuilder resultSringBuilder = cryptorV2.decrypt(new StringBuilder(emptyStrTest));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void cryptV2OneRepeatTest() {
        StringBuilder testStringBuilder = new StringBuilder("a3");
        StringBuilder resultSringBuilder = cryptorV2.crypt(new StringBuilder("aaa"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void decryptV2OneRepeatTest() {
        StringBuilder testStringBuilder = new StringBuilder("aaa");
        StringBuilder resultSringBuilder = cryptorV2.decrypt(new StringBuilder("a3"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void cryptV2NoRepeatTest() {
        StringBuilder testStringBuilder = new StringBuilder("abcdef");
        StringBuilder resultSringBuilder = cryptorV2.crypt(new StringBuilder("abcdef"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }

    @Test
    public void decryptV2NoRepeatTest() {
        StringBuilder testStringBuilder = new StringBuilder("abcdef");
        StringBuilder resultSringBuilder = cryptorV2.decrypt(new StringBuilder("abcdef"));
        Assert.assertEquals(testStringBuilder.toString(), resultSringBuilder.toString());
    }


}