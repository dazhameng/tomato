package com.dzm.tomato.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * io helper
 */

public class IoUtil {

    /**
     * execute close
     * @param closeable
     */
    public static void closeQuietly(final Closeable closeable){
        try{
            if (closeable != null){
                closeable.close();
            }
        }catch (final IOException ioException){
            // ignore
        }
    }
}
