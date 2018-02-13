package com.williamgdev.example.ndkproject;

/**
 * Created by willimail on 2/13/18.
 */

class GL2JNILib {
    static {
        System.loadLibrary("gl2jni");
    }

    /**
     * @param width the current view width
     * @param height the current view height
     */
    public static native void init(int width, int height);
    public static native void step();
}
