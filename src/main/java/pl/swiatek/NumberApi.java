package pl.swiatek;

import java.util.LinkedHashMap;

public class NumberApi {

    public static void main(String[] args) {


        LinkedHashMap<String, Integer> VALUES = new LinkedHashMap<String, Integer>() {{
            put("X", 1000);
            put("Y", 500);
            put("Z", 100);
        }};

        NumberConverter nc = new CustomNumberConverter(VALUES);

        System.out.println( nc.convert(1900));


    }

}
