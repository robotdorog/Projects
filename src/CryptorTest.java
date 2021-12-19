import org.junit.Assert;
import org.junit.Test;


public class CryptorTest {
    CryptorViaString cryptorViaString = new CryptorViaString();
    CryptorViaStringBuilder cryptorViaStringBuilder = new CryptorViaStringBuilder();
    StringBuilder testStringBuilder = new StringBuilder();


    @Test
    public void cryptBasicTest() {
        String testString = "A2a3b3z3tcz3";
        String resultString = cryptorViaString.crypt("AAaaabbbzzztczzz");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptBasicTest() {
        String testString = "AAaaabbbzzztczzz";
        String resultString = cryptorViaString.decrypt("A2a3b3z3tcz3");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptOneCharTest() {
        String testString = "a";
        String resultString = cryptorViaString.crypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptOneCharTest() {
        String testString = "a";
        String resultString = cryptorViaString.decrypt("a");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptorViaString.crypt("");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptEmptyStrTest() {
        String testString = "";
        String resultString = cryptorViaString.decrypt("");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptOneRepeatTest() {
        String testString = "a3";
        String resultString = cryptorViaString.crypt("aaa");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptOneRepeatTest() {
        String testString = "aaa";
        String resultString = cryptorViaString.decrypt("a3");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void cryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptorViaString.crypt("abcdef");
        Assert.assertEquals(testString, resultString);
    }

    @Test
    public void decryptNoRepeatTest() {
        String testString = "abcdef";
        String resultString = cryptorViaString.decrypt("abcdef");
        Assert.assertEquals(testString, resultString);

    }

    // CryptorViaStringBuilder

    @Test
    public void cryptBasicV2Test() {
        String testStringBuilder = "A2a3b3z3tcz3";
        String resultSringBuilder = cryptorViaStringBuilder.crypt("AAaaabbbzzztczzz");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void decryptBasicV2Test() {
        String testStringBuilder = "AAaaabbbzzztczzz";
        String resultSringBuilder = cryptorViaStringBuilder.decrypt("A2a3b3z3tcz3");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void cryptV2OneCharTest() {
        String testStringBuilder = "a";
        String resultSringBuilder = cryptorViaStringBuilder.crypt("a");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void decryptV2OneCharTest() {
        String testStringBuilder = "a";
        String resultSringBuilder = cryptorViaStringBuilder.decrypt("a");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void cryptV2EmptyStrTest() {
        String testStringBuilder = "";
        String resultSringBuilder = cryptorViaStringBuilder.crypt("");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void decryptV2EmptyStrTest() {
        String testStringBuilder = "";
        String resultSringBuilder = cryptorViaStringBuilder.decrypt("");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void cryptV2OneRepeatTest() {
        String testStringBuilder = "a3";
        String resultSringBuilder = cryptorViaStringBuilder.crypt("aaa");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void decryptV2OneRepeatTest() {
        String testStringBuilder = "aaa";
        String resultSringBuilder = cryptorViaStringBuilder.decrypt("a3");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void cryptV2NoRepeatTest() {
        String testStringBuilder = "abcdef";
        String resultSringBuilder = cryptorViaStringBuilder.crypt("abcdef");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }

    @Test
    public void decryptV2NoRepeatTest() {
        String testStringBuilder = "abcdef";
        String resultSringBuilder = cryptorViaStringBuilder.decrypt("abcdef");
        Assert.assertEquals(testStringBuilder, resultSringBuilder);
    }


}