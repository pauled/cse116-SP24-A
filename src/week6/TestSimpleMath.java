package week6;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
public class TestSimpleMath {
    @Test
    public void testFactorialCommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(1,1);
        testCases.put(2,2);
        testCases.put(3,6);
        testCases.put(4,24);
        testCases.put(5,120);
        testCases.put(6,720);
        testCases.put(7,5040);
        testCases.put(8,40320);
        testCases.put(9,362880);

        for (int input : testCases.keySet()){
            int expectedOut=testCases.getOrDefault(input,-1);
            int actual=SimpleMath.factorial(input);
            assertEquals("factorial("+input+")",expectedOut,actual);
        }
    }
    @Test
    public void testFactorialUncommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        for (int input : testCases.keySet()){
            int expectedOut=testCases.getOrDefault(input,-1);
            int actual=SimpleMath.factorial(input);
            assertEquals("factorial("+input+")",expectedOut,actual);
        }
    }
    @Test
    public void testFactorialEdge(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        for (int input : testCases.keySet()){
            int expectedOut=testCases.getOrDefault(input,-1);
            int actual=SimpleMath.factorial(input);
            assertEquals("factorial("+input+")",expectedOut,actual);
        }
    }
    @Test
    public void testMultiply(){
        ArrayList<MultiplyTestCase> testCases=new ArrayList<>(Arrays.asList(
                new MultiplyTestCase(10,5,50),
                new MultiplyTestCase(100,100,10000),
                new MultiplyTestCase(-4,-5,20),
                new MultiplyTestCase(-4,12,-48),
                new MultiplyTestCase(20,-3,-60),
                new MultiplyTestCase(0,0,0),
                new MultiplyTestCase(0,23,0),
                new MultiplyTestCase(105,0,0),
                new MultiplyTestCase(-80,0,0),
                new MultiplyTestCase(0,-1000,0)
        ));

        testCases.add(new MultiplyTestCase(1,1,1));

        for (MultiplyTestCase testCase : testCases){
            int in1=testCase.getInputOne();
            int in2=testCase.getInputTwo();
            int expected=testCase.getExpectedOutput();

            int actual=SimpleMath.multiplyInt(in1,in2);

            assertEquals("MultiplyInt("+in1+","+in2+")",expected,actual);
        }
    }
}
