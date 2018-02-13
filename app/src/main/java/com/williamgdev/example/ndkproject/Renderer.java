package com.williamgdev.example.ndkproject;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by willimail on 2/13/18.
 */

public class Renderer implements GLSurfaceView.Renderer {
    public void onDrawFrame(GL10 gl) {
        GL2JNILib.step();
    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GL2JNILib.init(width, height);
    }

    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Do nothing.
    }
}
