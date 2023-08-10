import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
   @Test
    public void testGetLocalNumber(){
       System.out.println("Start testGetLocalNumber");
        if(this.getLocalNumber() != 14){
            System.out.println("The local number is " + this.getLocalNumber());
            Assert.fail("The local number has the wrong value");
        }else {
            System.out.println("The local number has the right value: " + this.getLocalNumber());
        }
    }
    @Test
    public void testGetClassNumber(){
        System.out.println("Start testGetClassNumber");
        if(this.getClass_number() > 45){
            System.out.println("The local number is bigger than 45. It is " + this.getClass_number());
        }else {
            System.out.println("The local number is smaller than 45. It is " + this.getClass_number());
        }
    }
}
