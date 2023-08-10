import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
   @Test
    public void testGetLocalNumber(){
        if(this.getLocalNumber() != 14){
            System.out.println("The local number is " + this.getLocalNumber());
            Assert.fail("The local number has the wrong value");
        }else {
            System.out.println("The local number has the right value: " + this.getLocalNumber());
        }
    }
}
