import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromTest {
    private Palindrom p;

    public PalindromTest() {}

    @Before
    public void setUp() {
        this.p = new Palindrom();
    }


    @After
    public void tearDown(){
        this.p = null;
    }

    @Test
    public void testIsPalindrom_posiviteTestCase()  {
        Assert.assertTrue(this.p.isPalindrom("AABAA"));
        Assert.assertTrue(this.p.isPalindrom("M"));
    }

    @Test
    public void testIsPalindrom_negativeTestCase() {
        Assert.assertFalse(this.p.isPalindrom("CAAA"));
        Assert.assertFalse(this.p.isPalindrom("CAAAQQ"));
    }

    @Test
    public void searchPal_povisiteTestCase()  {
        Assert.assertEquals(this.p.searchPal("BBBABBB"), "BBBABBB");
        Assert.assertTrue("Este palindrom", this.p.searchPal("B").equals("B"));
    }

    @Test
    public void searchPal_negativeTestCase()  {
        Assert.assertNotEquals(this.p.searchPal("BBBABBEB"), "BBBABBB");
        Assert.assertFalse("Nu este palindrom", this.p.searchPal("B12321").equals("B"));
    }

    @Test
    public void searchPal_negativeTestCase_notMax()  {
        Assert.assertTrue(this.p.searchPal("abc").equals( ""));
    }

    /**
     * Returned last max sequence.
     */
    @Test
    public void searchPal_negativeTestCase_multipleMax()  {
        Assert.assertTrue(this.p.searchPal("aa3bbbbaaaa").equals( "bbbb"));
    }
}
