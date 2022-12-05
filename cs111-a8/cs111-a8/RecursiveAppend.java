/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
    if(n >= 0){
        return original + appendNTimes(original, n - 1);
    }

    return "";
    }

    public static void main (String[] args) {

        String str = appendNTimes("cat", 2);
        System.out.println(str);
    }
}
