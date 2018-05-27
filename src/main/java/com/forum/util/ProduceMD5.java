package com.forum.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 19:33 2018/5/27
 * @Modified By:
 */
public class ProduceMD5 {

    /**
     * 生成MD5
     */
    public static String getMD5(String message) {
        String md5 = "";
        try {
            //创建一个md5算法对象
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageByte = message.getBytes();
            // 获得MD5字节数组,16*8=128位
            byte[] md5Byte = md.digest(messageByte);
            // 转换为16进制字符串
            md5 = HexConversion.bytesToHex(md5Byte);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }

}
