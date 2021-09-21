package com.example.innopolislearn;

import java.math.BigDecimal;

public class MainActivity {
    public static void main (String[] args){

        String hi = "Привет ", world = "Мир!";
        System.out.println(hi+world);

        double x = 1.0001, y = 1.0000999;
        BigDecimal one = new BigDecimal(x), two = new BigDecimal(y);
        System.out.println(one.compareTo(two));

        StringBuilder newString = new StringBuilder(hi+world);
        newString.replace(6, 11, "Java");

        System.out.println(newString);

    }
}