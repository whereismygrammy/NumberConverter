package pl.swiatek.converters;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomNumberConverter implements NumberConverter {

    //This converter allows us to transfer any map based on which the number will be converted.
    private LinkedHashMap<String, Integer> values;

    public CustomNumberConverter(LinkedHashMap<String, Integer> values) {
        this.values = values;
    }

    public String convert(int number) {
        int tempValue;
        int multiplicityOfTempNumber;
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            tempValue = entry.getValue();
            multiplicityOfTempNumber = number / tempValue;
            while (multiplicityOfTempNumber > 0) {
                number = number - tempValue;
                multiplicityOfTempNumber = number / tempValue;
                stringBuilder.append(entry.getKey());
            }
        }

        String result = stringBuilder.toString();

        if (result.equals("")) {
            throw new IllegalArgumentException("Number can't be converted with provided converter");
        }

        return result;
    }
}