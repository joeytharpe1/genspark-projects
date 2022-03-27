import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class NumberGuesserTest {
    NumberGuesser guesser;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        guesser = new NumberGuesser();
    }

    @Test
    void getName() {
        String name = "joey";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);

        assertEquals("joey", guesser.getName(), "not a valid name");
    }

    @Test
    void getInputNum() {
        int inputNum = 10;
        InputStream in = new ByteArrayInputStream(String.valueOf(inputNum).getBytes());
        System.setIn(in);

        assertEquals("Enter any valid Integer between 0 and 20: ", guesser.getInputNum());
    }

    @AfterEach
    void tearDown() {
    }
}