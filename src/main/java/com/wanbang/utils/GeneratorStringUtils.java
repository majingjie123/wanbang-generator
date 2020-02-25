package com.wanbang.utils;

import org.apache.commons.lang.StringUtils;

import java.util.Properties;

public class GeneratorStringUtils {

    private GeneratorStringUtils() {

    }

    /**
     * format database type into java type, eg format "card_type" into "cardType"
     *
     * @param string
     * @return
     */
    public static String format(String string) {
        if (!StringUtils.contains(string, "_")) {
            return string != null ? string.toLowerCase() : null;
        }

        StringBuilder sb = new StringBuilder();
        char[] cArr = string.trim().toLowerCase().toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c == '_') {
                i++;
                sb.append(Character.toUpperCase(cArr[i]));
            } else {
                sb.append(c);
            }
        }


        return sb.toString();
    }



    public static String firstUpper(String string) {
        String str = format(string);
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        return str;
    }



    public static String firstUpperNoFormat(String string) {
        String str = string.substring(0, 1).toUpperCase() + string.substring(1);
        return str;
    }
}
