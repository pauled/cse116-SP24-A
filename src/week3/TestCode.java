package week3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestCode {
    @Test
    public void testAddPositives() {
        assertEquals(CodeToTest.add(1, 2) , 3);
        assertEquals(CodeToTest.add(8, 3) , 11);
        assertEquals(CodeToTest.add(5, 5) , 10);
    }
    @Test
    public void testAddZeroInputs() {
        assertEquals(CodeToTest.add(0, 2) , 2);
        assertEquals(CodeToTest.add(8, 0) , 8);
        assertEquals(CodeToTest.add(0, 0) , 0);
    }
    @Test
    public void testAddNegativeFirstParam() {
        assertEquals(CodeToTest.add(-1, 2) , 1);
        assertEquals(CodeToTest.add(-8, 3) , -5);
    }
    @Test
    public void testAddNegativeSecondParam() {
        assertEquals(CodeToTest.add(11, -20) , -9);
        assertEquals(CodeToTest.add(18, -3) , 15);
    }
    @Test
    public void testAddBothNegative() {
        int actual=CodeToTest.add(-1, -2);
        assertEquals("add(-1,-2) expected:-3 got:"+actual,-3,actual);
        assertEquals(CodeToTest.add(-8, -8) , -16);
    }
    @Test
    public void testAddZeroResult(){
        assertEquals(CodeToTest.add(-1,1),0);
        assertEquals(CodeToTest.add(5,-5),0);
    }
    @Test
    public void testStrings(){
        String a="hello ";
        String b="bye";
        String c=a+b;
        System.out.println(c);
        assertTrue(c.equals("hello bye"));
        assertEquals(c,"hello bye");
    }
    @Test
    public void testDoubles(){
        double bad=0;
        for (int x=0;x<10;x++){
            bad+=.1;
        }
        System.out.println("bad:"+bad);
        assertEquals(bad,1.0,.001);
    }
    @Test
    public void testPMCommon(){
        String actual=PlusMinus.pm(87);
        assertEquals("pm(87) expect:+ got"+actual,"+",actual);
        actual=PlusMinus.pm(78);
        assertEquals("pm(78) expect:+ got"+actual,"+",actual);
        actual=PlusMinus.pm(66);
        assertEquals("pm(66) expect: got"+actual,"",actual);
        actual=PlusMinus.pm(93);
        assertEquals("pm(93) expect: got"+actual,"",actual);
        actual=PlusMinus.pm(80);
        assertEquals("pm(80) expect:- got"+actual,"-",actual);
        actual=PlusMinus.pm(62);
        assertEquals("pm(62) expect:- got"+actual,"-",actual);
    }
    @Test
    public void testPMUncommon(){
        String actual=PlusMinus.pm(100);
        assertEquals("pm(100) expect:+ got"+actual,"+",actual);
        actual=PlusMinus.pm(105);
        assertEquals("pm(105) expect:+ got"+actual,"+",actual);
        actual=PlusMinus.pm(2);
        assertEquals("pm(2) expect: got"+actual,"",actual);
        actual=PlusMinus.pm(8);
        assertEquals("pm(8) expect: got"+actual,"",actual);
    }
}
