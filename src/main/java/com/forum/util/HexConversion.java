package com.forum.util;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 19:39 2018/5/27
 * @Modified By:
 */
public class HexConversion {

    /**
     * 二进制转十六进制
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuffer hexStr = new StringBuffer();
        int num;
        for (int i = 0; i < bytes.length; i++) {
            num = bytes[i];
            if(num < 0) {
                num += 256;
            }
            if(num < 16){
                hexStr.append("0");
            }
            hexStr.append(Integer.toHexString(num));
        }
        return hexStr.toString().toUpperCase();
    }


}
