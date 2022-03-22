import Reverse.ReverseString;
import org.testng.Assert;
import org.testng.annotations.*;

public class ReverseStringTest {

    @Test
    void verifyTheTestForReversText(){
        Assert.assertEquals(ReverseString.reverseText( "Programming is not easy if you don't know how to swim..."), "...miws ot woh wonk t'nod uoy fi ysae ton si gnimmargorP");
    }

    @Test
    void verifyTestForReversingStringNull(){
        Assert.assertNull(ReverseString.reverseText("Programming is not easy if you don't know how to swim..."), "");
    }

    @Test
    void verifyTestForReversingStringNotNull(){
        Assert.assertNotNull(ReverseString.reverseText("Programming is not easy if you don't know how to swim..."), "");

    }
}
