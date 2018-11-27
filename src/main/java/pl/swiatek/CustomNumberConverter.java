package pl.swiatek;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomNumberConverter implements NumberConverter {

    //This converter allows us to transfer any map based on which the number will be converted.
    private LinkedHashMap<String, Integer> values;
    private int maxValidNumber = -1;

    public CustomNumberConverter(LinkedHashMap<String, Integer> values) {
        this.values = values;
    }

    public CustomNumberConverter(LinkedHashMap<String, Integer> values, int maxValidNumber) {
        this.values = values;
        this.maxValidNumber = maxValidNumber;
    }

    public String convert(int number) {

        if (maxValidNumber == -1 || maxValidNumber <= number) {
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

            return stringBuilder.toString();
        }
        return null;


    }

}
