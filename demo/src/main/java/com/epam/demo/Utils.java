/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Boolean isNegativeAbsent = true;

        for(String s : args){
            if(!StringUtils.isPositiveNumber(s)) isNegativeAbsent = false;
        }

        return isNegativeAbsent;
    }
}
