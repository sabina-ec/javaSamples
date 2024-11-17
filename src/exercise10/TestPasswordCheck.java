package exercise10;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {
@Test
    public void testSendingText(){
    //Arrange
    PasswordCheck pass =new PasswordCheck();
    boolean expected= true;

     //Act
    boolean actual = pass.check("Password");

    //Assert
    assertEquals(expected,actual);


}



}
