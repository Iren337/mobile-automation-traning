import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{
   @Before
   public void textStartTest()
   {
      System.out.println("Start test");
   }

   @After
   public void textFinishTest()
   {
      System.out.println("Finish test");
   }

   @Test
   public void myFirstTest()
   {
      int expected = 25;
      int actual = 5 * 5;

      Assert.assertTrue("5*5 != 25", actual == expected);

   }
   @Test
   public void mySecondTest()
   {
      int expected = 25;
      int actual = 5 * 5;

      Assert.assertTrue("5*5 != 25", actual == expected);

   }

}
