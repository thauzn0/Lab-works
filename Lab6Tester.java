import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Lab6Tester extends Lab6{
@Test
public void testCountSpace(){
  assertEquals(0, Lab6.countSpaces("abcde"));
  /*assertEquals(5, Lab6.countSpaces("a b c d e"));
  assertEquals(0, Lab6.countSpaces("a bcde"));
  assertEquals(0, Lab6.countSpaces("a b cde"));
  assertEquals(0, Lab6.countSpaces(" abcde"));
  assertEquals(0, Lab6.countSpaces("abcde "));
*/
}
@Test
public void testRemoveSpaces(){
  assertEquals("The test with no spaces fail",0, Lab6.removeSpaces("a b c d e"));
  assertEquals("The test of five letters fails",5, Lab6.removeSpaces("a b c d e"));
}



@Test
public void testEveryNthChar(){
  assertEquals("This string is empty",0, Lab6.everyNthChar("", 1)); 
  assertEquals(1, Lab6.everyNthChar("a", 1)); 
  assertEquals(0, Lab6.everyNthChar("abc ", 2));   
  assertEquals(0, Lab6.everyNthChar("abcdef ", 3));   

}


}