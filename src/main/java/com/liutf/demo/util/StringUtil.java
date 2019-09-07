package com.liutf.demo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {


    /**
     * @param mobile
     * @return boolean
     * @throws
     * @author HanWey
     * @Description: 验证手机号是否合法。
     */
    public static boolean isValidMobile(String mobile) {
        if (mobile == null) {
            return false;
        }
        Pattern p = null;
        Matcher m = null;
        p = Pattern.compile("^[1][3,4,5,6,7,8,9][0-9]{9}$");
        m = p.matcher(mobile);
        return m.matches();
    }
}