/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
    String s = args[0];  
    int size = s.length();
    int count = 0;
    int a = 0;
    int rsum = 0;
    int lsum = 0;
    int result = 0;
        
        
    String[] arr = new String[size];
    for(int q = 0; q < size;q++ ){
        arr[q] = s.substring(q, q+1);
    }//adds to array

    for(int i = size - 1;i >= 0; i-- ){
        count++;
        a = Integer.parseInt(arr[i]);
        if(count % 2 == 0){
            lsum += a;
        }
        if(count % 2 == 1){
            rsum += a;
        }
    }


    rsum = rsum % 10;

    lsum = lsum % 10;
    lsum = lsum * 3;
    lsum = lsum % 10;

    result = rsum + lsum;
    result = result % 10;

    System.out.println(result);





        
        
    }
}