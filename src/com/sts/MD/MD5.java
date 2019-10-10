package com.sts.MD;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author ：gb
 * @date ：Created in 2019/9/29 16:11
 */
public class MD5 {

    public static void main(String[] args){
        String s1 = stringMD("Aa123456");
        System.out.println(s1);
        System.out.println("22修改");
        System.out.println(1111);
        System.out.println(2222);
    }


    public static String stringMD(String password){
        if ("".equals(password.trim()) || password == null){
            return "";
        }

        MessageDigest md5 = null;

        try {
            md5 = MessageDigest.getInstance("MD5");

            //转化成2进制
            byte[] bytes = md5.digest(password.trim().getBytes());

            String result = "";
            for (byte by : bytes){
                String temp = Integer.toHexString(by & 0xff);
                if (temp.length() == 1){
                    temp = "0" + temp;
                }
                result = result + temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

}
