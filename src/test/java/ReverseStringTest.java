import Reverse.ReverseString;
import org.testng.Assert;
import org.testng.annotations.*;

import static Reverse.ReverseString.reverseString;

public class ReverseStringTest {

    @Test
    void verifyTheTestForReversText(){
        Assert.assertEquals(ReverseString.reverseText( "Programming is not easy if you don't know how to swim..."), "...miws ot woh wonk t'nod uoy fi ysae ton si gnimmargorP");
    }
    @Test
    void verifyTestForReversingStringNull(){
        Assert.assertTrue(ReverseString.reverseString("Hello World"), "");
    }

}
