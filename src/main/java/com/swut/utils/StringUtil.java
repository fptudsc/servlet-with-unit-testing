package com.swut.utils;

public class StringUtil {

    /**
     * Check blank string.
     * @param text the string to check
     * @return true if blank
     */
    public static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }
}
