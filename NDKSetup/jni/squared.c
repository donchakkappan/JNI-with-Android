#include <jni.h>
#include <squared.h>

jint Java_com_example_ndksetup_JNIwithHeaderFile_squared(JNIEnv * env, jobject this, jint value)
{

	return value*value;

}
