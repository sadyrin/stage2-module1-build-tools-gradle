package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for(String s : args){
            if(!StringUtils.isPositiveNumber(s)) return false;
        }

        return true;
    }
}