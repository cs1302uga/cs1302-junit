package cs1302.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Contains test cases for REPLACE-ME.
 */
@DisplayName("REPLACE-ME")
public class Tests {

    @Test
    @DisplayName("descriptive name for testThis()")
    public void testThis() {
        String expected = "hello";
        String actual = "h" + "ell" + "o";
        assertEquals(expected, actual);
    } // testThis

    @Test
    @DisplayName("descriptive name for testThat()")
    public void testThat() {
        String expected = "hello";
        String actual = new String("hello");
        assertSame(expected, actual);
    } // testThat

} // Tests
