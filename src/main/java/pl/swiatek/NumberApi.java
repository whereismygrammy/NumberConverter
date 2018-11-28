package pl.swiatek;

import pl.swiatek.converters.CustomNumberConverter;
import pl.swiatek.converters.RomanNumberConverter;

import java.util.LinkedHashMap;

public class NumberApi {

    public static String convertToRoman(int number) {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        return romanNumberConverter.convert(number);
    }

    public static String convertToCustom(LinkedHashMap values, int number) {
        CustomNumberConverter customNumberConverter = new CustomNumberConverter(values);
        return customNumberConverter.convert(number);
    }
}
