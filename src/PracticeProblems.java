/**
 * Created by michael_hopps on 11/14/17.
 */
public class PracticeProblems {

    public static void main(String[] args) {

        //1. Write a code segment to create a 2D array of Strings that...
        //has 4 rows and 5 columns.  The odd columns contain "x",
        //the even columns contain "y".
        //Print it using the method below.



        //2. Write a code segment to create a 2D array of ints
        //that has 4 rows and 6 columns.  It looks like this:
        /*
        111111
        222222
        333333
        444444
         */






    }




    public static void printArray(int[][] grid){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void printArray(String [][] grid){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + "\t\t");
            }
            System.out.println();
        }
    }

}
