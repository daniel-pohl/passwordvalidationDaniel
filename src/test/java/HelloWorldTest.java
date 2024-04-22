import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    @Test
    public void helloWorldPrintHelloWorld(){
        String actual = HelloWorld.helloWorld();
        String expected = "Hello World!";
        assertEquals(expected, actual);
    }


}


