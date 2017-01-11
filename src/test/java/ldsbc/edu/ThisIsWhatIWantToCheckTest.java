package ldsbc.edu;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by CSmith on 1/10/2017.
 */
public class ThisIsWhatIWantToCheckTest {
  @Test
  public void getHelloTest() throws Exception {
    ThisIsWhatIWantToCheck myObj = new ThisIsWhatIWantToCheck();
  
    assertEquals("Hello", myObj.getHello());
  }
  
  @Test
  public void addSomeNumbersTest() throws Exception {
    ThisIsWhatIWantToCheck myObj = new ThisIsWhatIWantToCheck();
  
    assertEquals(10, myObj.addSomeNumbers(4,6,2));
    assertEquals(7, myObj.addSomeNumbers(5,0,2));
    assertEquals(100, myObj.addSomeNumbers(40,65,20));
  }
  
}