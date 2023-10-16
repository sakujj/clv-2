package org.example;

public class StringUtils {
    public static boolean isPositiveNumber(String s) {
        if (!org.apache.commons.lang3.StringUtils.isNumeric(s)) {
            return false;
        }

        char sign = s.charAt(0);
        if (sign == '-') {
            return false;
        }

        return true;
    }
}
