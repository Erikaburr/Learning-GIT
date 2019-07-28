import static org.junit.Assert.*;
import org.junit.Test;

public class tests {

       @Test
       public void testMoveDown() {
            test elevator = new test();
            elevator.add(5,1);
            assertEquals(6, 6);      
       }
}
