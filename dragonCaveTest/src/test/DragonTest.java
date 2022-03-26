import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class DragonTest {
    Dragon drag;

    @BeforeEach
    void setUp() {
        System.out.println("before each ----");
        drag = new Dragon();
    }

    @Test
    void getDragon() {
        int answer = 11;
        InputStream in = new ByteArrayInputStream(String.valueOf(answer).getBytes()); //convert to string
        System.setIn(in);
        assertEquals("Sorry wrong number u cant escape the dragons would u like to retry ?",
                drag.getDragon() ,
                "number cant be 1 or 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each---");
    }
}