package week3;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class TestCode {
    @Test
    public void testAddPositives() {
        assertTrue(CodeToTest.add(1, 2) == 3);
        assertTrue(CodeToTest.add(8, 3) == 11);
        assertTrue(CodeToTest.add(5, 5) == 10);
    }
    @Test
    public void testAddZeroInputs() {
        assertTrue(CodeToTest.add(0, 2) == 2);
        assertTrue(CodeToTest.add(8, 0) == 8);
        assertTrue(CodeToTest.add(0, 0) == 0);
    }
    @Test
    public void testAddNegativeFirstParam() {
        assertTrue(CodeToTest.add(-1, 2) == 1);
        assertTrue(CodeToTest.add(-8, 3) == -5);
    }
    @Test
    public void testAddNegativeSecondParam() {
        assertTrue(CodeToTest.add(11, -20) == -9);
        assertTrue(CodeToTest.add(18, -3) == 15);
    }
    @Test
    public void testAddBothNegative() {
        assertTrue(CodeToTest.add(-1, -2) == -3);
        assertTrue(CodeToTest.add(-8, -8) == -16);
    }
    @Test
    public void testAddZeroResult(){
        assertTrue(CodeToTest.add(-1,1)==0);
        assertTrue(CodeToTest.add(5,-5)==0);
    }
}
