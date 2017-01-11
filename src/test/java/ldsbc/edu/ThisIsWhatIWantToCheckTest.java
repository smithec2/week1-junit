package ldsbc.edu;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by CSmith on 1/10/2017.
 */
public class ThisIsWhatIWantToCheckTest {
  @Test
  public void getHello() throws Exception {
    ThisIsWhatIWantToCheck myObj = new ThisIsWhatIWantToCheck();
  
    assertEquals("Hello", myObj.getHello());
  }
  
}