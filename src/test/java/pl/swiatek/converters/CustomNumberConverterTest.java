package pl.swiatek.converters;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

class CustomNumberConverterTest {

    LinkedHashMap<String, Integer> values = new LinkedHashMap<String, Integer>() {{
        put("X", 1000);
        put("Y", 500);
        put("Z", 100);
    }};

    @Test
    void testConvert() {
        CustomNumberConverter customNumberConverter = new CustomNumberConverter(values);
        String result = customNumberConverter.convert(1600);
        assertEquals("XYZ", result);
        result = customNumberConverter.convert(100);
        assertEquals("Z", result);
    }
}