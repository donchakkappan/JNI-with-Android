package com.example.ndksetup;

public class JNIwithHeaderFile {

	 // Declare native method (and make it public to expose it directly)
    public static native int squared(int base);
     
   
    // Load library
    static {
        System.loadLibrary("ndksetup");
    }
	
}
