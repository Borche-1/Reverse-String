import Reverse.ReverseString;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ReverseStringTest {

    @Test
    void verifyTheTestForReversText(){
        ReverseString reversestring = new ReverseString();
        reversestring.toString();
        assertTrue( "Programming is not easy if you don't know how to swim...", reversestring);
    }

    private void assertTrue(String s, ReverseString reversestring) {
    }
}
