/*
The code below loads the native library in the static  initializer of the Fusionwrap.class
*/
public class FusionWrap {
    
    static 
    { 
    System.loadLibrary("fusionwrap"); 
    }
    
/*

This methods will be accessed from an external library, and that it should not look for it in the Java source code. Accordingly, notice that there is no implementation of this method present in the Java code.
  */  
    public static native int fusion_read(String path);
    public static native int fusion_write(String path);
    public static native int fusion_getattr(String path);

}
