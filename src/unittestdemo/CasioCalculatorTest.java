package unittestdemo;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class CasioCalculatorTest {

    CasioCalculator casio5500 = new CasioCalculator();
    /**
     * As soon as a method is being annotated by @Test it will be considered as
     * test case or test method not an application source code
     *
     */

    @Test
    public void addTest(){

      int actualValue = casio5500.add(4,4); //9
      int expectedValue = 9;
      //Validate actualValue = expectedValue, if this is true test is passed
        Assert.assertEquals(actualValue, expectedValue);// 9,  8==
        System.out.println("addTest() Passed");
    }

    @Test
    public void divideTest(){
        int actualValue = casio5500.divide(8, 4); // 2
        int expectedValue = 2;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println("divideTest() Passed");
    }

}
