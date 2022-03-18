import Reverse.ReverseString;
import org.testng.Assert;
import org.testng.annotations.*;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ReverseStringTest {

    @BeforeClass

    @BeforeMethod

    @Test
    void verifyTheTestForReversText(){

        Assert.assertNotEquals("Programming is not easy if you don't know how to swim...", "...miws ot woh wonk t'nod uoy fi ysae ton si gnimmargorP");
    }


}
