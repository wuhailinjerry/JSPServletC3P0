package net.smartbetter.jspservletc3p0.test;

import net.smartbetter.jspservletc3p0.util.StringHelper;

import java.security.NoSuchAlgorithmException;

/**
 * Created by macmini on 17/1/9.
 */
public class MD5Test {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        //能够获取到链接对象
        System.out.println(StringHelper.encryptMD5("1"));
    }

}
