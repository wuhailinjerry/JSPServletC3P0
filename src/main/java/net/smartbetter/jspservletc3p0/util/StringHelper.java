package net.smartbetter.jspservletc3p0.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串处理工具类
 * Created by gc on 17/1/6.
 */
public class StringHelper {
    /**
     * MD5加密
     */
    public static String encryptMD5(String securityStr) throws NoSuchAlgorithmException {
        if (securityStr == null) {
            return null;
        }
        byte[] data = securityStr.getBytes();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(data);
        byte[] resultBytes = md5.digest();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < resultBytes.length; i++) {
            if (Integer.toHexString(0xFF & resultBytes[i]).length() == 1) {
                builder.append("0").append(
                        Integer.toHexString(0xFF & resultBytes[i]));
            } else {
                builder.append(Integer.toHexString(0xFF & resultBytes[i]));
            }
        }
        return builder.toString();
    }

    /**
     * 获取当前格式化时间（yyyy-MM-dd hh:mm:ss）
     *
     * @return
     */
    public static String getCurrentFormatDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String datetime = sdf.format(date);
        return datetime;
    }

    /**
     * 获取当前时间戳
     *
     * @return
     */
    public static long getCurrentTimeStamp() {
        return System.currentTimeMillis();
    }

    /**
     * 将时间戳转换成时间格式为 yyy-MM-dd hh:mm:ss 的时间
     *
     * @param timestamp
     * @return
     */
    public static String getDateByTimeStamp(long timestamp) {
        if (timestamp != 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String date = sdf.format(new Date(timestamp));
            System.out.println(date);
            return date;
        } else {
            return "";
        }
    }

    /**
     * 配置自定义的EL函数方法
     * 将时间戳转换成时间格式为 yyy-MM-dd hh:mm:ss或者yyy-MM-dd 的时间
     *
     * @param timestamp
     * @param format
     * @return
     */
    public static String getDateByTimeStamp(long timestamp, String format) {
        if (timestamp != 0) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            String date = sdf.format(new Date(timestamp));
            return date;
        } else {
            return "";
        }
    }

    /**
     * 将时间字符串转换成时间戳
     *
     * @param user_time
     * @return
     */
    public static Long getTime(String user_time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = simpleDateFormat.parse(user_time);
            Long timeStemp = date.getTime();
            return timeStemp;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0L;
    }

}
