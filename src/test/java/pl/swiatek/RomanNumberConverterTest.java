package pl.swiatek;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberConverterTest {


    @Test
    public void testToRomanValue() {
        RomanNumberConverter basicNumberConverter = new RomanNumberConverter();
        String result = basicNumberConverter.convert(1234);
        assertEquals("MCCXXXIV", result);

        result = basicNumberConverter.convert(3949);
        assertEquals("MMMCMXLIX", result);
    }
}