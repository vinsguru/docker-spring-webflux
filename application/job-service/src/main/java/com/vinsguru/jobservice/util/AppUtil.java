package com.vinsguru.jobservice.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppUtil {

    private static final String HOSTNAME;

    static {
        try {
            HOSTNAME = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getHostName(){
        return HOSTNAME;
    }

}
