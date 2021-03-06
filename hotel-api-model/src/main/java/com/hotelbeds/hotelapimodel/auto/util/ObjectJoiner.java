/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.util;

import java.util.Collection;
import java.util.StringJoiner;


/**
 * The Class ObjectJoiner.
 *
 * @author 
 */
public class ObjectJoiner {

    private ObjectJoiner() {
    }

    /**
     * Join.
     *
     * @param separator the separator
     * @param arguments the arguments
     * @return the string
     */
    public static String join(CharSequence separator, Object... arguments) {
        StringJoiner st = new StringJoiner(separator);
        if (arguments != null) {
            for (Object object : arguments) {
                if (object != null) {
                    st.add(object.toString());
                } else {
                    st.add("");
                }
            }
        }
        return st.toString();
    }

    /**
     * Join.
     *
     * @param separator the separator
     * @param arguments the arguments
     * @return the string
     */
    public static String join(CharSequence separator, Collection<? extends Object> arguments) {
        StringJoiner st = new StringJoiner(separator);
        if (arguments != null) {
            for (Object object : arguments) {
                if (object != null) {
                    st.add(object.toString());
                } else {
                    st.add("");
                }
            }
        }
        return st.toString();
    }

    /**
     * Simply join.
     *
     * @param arguments the arguments
     * @return the string
     */
    public static String simplyJoin(Object... arguments) {
        return join("", arguments);
    }
}
