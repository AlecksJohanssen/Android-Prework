#include <jni.h>
#include <string>
#include <sstream>

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_alecksjohanssen_testkolin1_MainActivity_intFromJNI(
        JNIEnv* env,
        jobject ) {
    int a = 1;
    int b = 2;
    int c = a + b;
    return c;
}
JNIEXPORT jstring JNICALL
Java_com_example_alecksjohanssen_testkolin1_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

