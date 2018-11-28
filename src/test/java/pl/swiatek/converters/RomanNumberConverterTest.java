package pl.swiatek.converters;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class RomanNumberConverterTest {

    @Test
    public void testToRomanValue() {
        RomanNumberConverter basicNumberConverter = new RomanNumberConverter();
        String result = basicNumberConverter.convert(1234);
        assertEquals("MCCXXXIV", result);
        result = basicNumberConverter.convert(3949);
        assertEquals("MMMCMXLIX", result);
    }

    @Test
    public void testExpectedException() {
        RomanNumberConverter basicNumberConverter = new RomanNumberConverter();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicNumberConverter.convert(-1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicNumberConverter.convert(0);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicNumberConverter.convert(4001);
        });
    }
}