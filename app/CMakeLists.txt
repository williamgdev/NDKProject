cmake_minimum_required(VERSION 3.4.1)


add_library(gl2jni SHARED src/main/cpp/gl_code.cpp)
add_library(native-lib SHARED src/main/cpp/native-lib.cpp)

find_library(log-lib
              log )

target_link_libraries(
                 gl2jni
                 native-lib
                 android
                 log
                 EGL
                 GLESv2
                 ${log-lib} )