package pl.swiatek;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberConverter implements NumberConverter {


    private final Map<String, Integer> VALUES = new LinkedHashMap<String, Integer>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    public String convert(int number) {
        if (number <= 0 || number > 4000) {
            return null;
        }

        int tempRomanValue;
        double multiplicityOfTempNumber;
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : VALUES.entrySet()) {
            tempRomanValue = entry.getValue();
            multiplicityOfTempNumber = number / tempRomanValue;

            while (multiplicityOfTempNumber > 0) {
                number = number - tempRomanValue;
                multiplicityOfTempNumber = number / tempRomanValue;
                stringBuilder.append(entry.getKey());
            }
        }

        return stringBuilder.toString();
    }

}
