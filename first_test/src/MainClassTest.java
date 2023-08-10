import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

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

    @Test
    public void testGetClassString(){
       System.out.println("\nStart testGetClassString");

       String first_sample_string = "Hello";
       String second_sample_string = "hello";
       if(this.getClass_string().contains(first_sample_string) || this.getClass_string().contains(second_sample_string)){
          System.out.println("Test success passed.");
       }else{
          Assert.fail("String doesn't have any substrings.");
      }
    }
}
