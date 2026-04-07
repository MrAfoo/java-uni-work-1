// try-catch statement example
public class try_catch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
/*

1. e.getMessage() prints like this: "Index 5 out of bounds for length 3" which indicates that the code attempted to access an index (5) that is outside the valid range of the array (which has a length of 3).e.getMessage() provides specific details about the exception, which can be helpful for debugging and understanding the cause of the error.

2. e.toString() would print something like: "java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3" which includes the full class name of the exception along with the message. This provides more context about the type of exception that occurred, in addition to the specific error message.

3. e.printStackTrace() prints like this:
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
    at try_catch.main(try_catch.java:4)
This method provides a complete stack trace of the exception, showing the sequence of method calls that led to the exception being thrown. It includes the class name, method name, file name, and line number where the exception occurred. This is particularly useful for debugging, as it helps developers trace back the source of the error in the code.

*/