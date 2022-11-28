/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
    int row = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[1]);
    int a = 0;
    int[][] grid = new int[row][col];
    int override = 0;
    int ret = 0;

    if(col == 1 ){
      override = 1;
      ret = 0;
    }

    int yes = 0;
    int yess = 0;
    int yesss = 0;
    
    if(row == 1){
      override = 2;
      for(int r = 0; r < col; r++){
        yess = Integer.parseInt(args[2 + r]);
        if(yess > yes){
          yes = yess;
          yesss = r;
        }
      }
    }

    

    // fill the grid
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {

        grid[i][j] = Integer.parseInt(args[2 + a]);
        a++;

      }
    }

    // display output
    int max1 = 0;
    int maxp = 0;
    int sum = 0;
    int b = -1;


    for (int h = 0; h < col; h++){
      sum = 0;
      b++;
      
       for (int m = 0; m < row; m++){
            sum += grid[m][h];  // Note that, I am adding to `temp[j]`.
        }
      if (sum > max1) {
        // System.out.println(sum);
        max1 = sum;
        maxp = b;
      }
    }

    if(override == 0){
    System.out.println(maxp);}

    if(override == 1){
    System.out.println(ret);}
   
    if(override == 2){
    System.out.println(yesss);}
  }
}