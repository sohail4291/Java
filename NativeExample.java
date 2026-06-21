public class NativeExample {
    // Declaration of a native method
    public native void printMessage();

    // Load the native library containing the implementation
    static {
        System.loadLibrary("NativeLib");
    }

    public static void main(String[] args) {
        new NativeExample().printMessage();
    }
}
