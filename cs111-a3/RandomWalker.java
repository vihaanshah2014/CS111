/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
    
    int time = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    int change = 0;
    double square = 0;
    double return1 = 0;

    
    for(int i = 0; i < time; i++){
    change = (int)(Math.random()*4);
    System.out.println("(" + x + "," + y + ")");
    if(change == 0){
      x++;
    }
    if(change == 1){
      x--;
    }
    if(change == 2){
      y++;
    }
    if(change == 3){
      y--;
    }

    
    }//end for
    System.out.println("(" + x + "," + y + ")");
    square = (x * x) + (y * y) * (1.0);

    // return1 = Math.sqrt(square);

    System.out.println("Squared distance = " + square);

    }
}
