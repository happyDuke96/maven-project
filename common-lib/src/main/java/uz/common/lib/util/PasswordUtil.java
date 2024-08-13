package uz.common.lib.util;


import java.util.Base64;

public final class PasswordUtil {

    public static String decodePassword(String password) {
        byte[] decodedBytes = Base64.getDecoder().decode(password);
        return new String(decodedBytes);
    }

}
