/**
 * Created by michael_hopps on 11/14/17.
 */
public class PracticeProblems {

    public static void main(String[] args) {

        //1. Write a code segment to create a 2D array of Strings that...
        //has 4 rows and 5 columns.  The odd columns contain "x",
        //the even columns contain "y".
        //Print it using the method below.

        String[][] strs = new String[4][5];
        for (int r = 0; r < strs.length; r++) {
            for (int c = 0; c < strs[0].length; c++) {
                if(c % 2 == 1)
                    strs[r][c] = "x";
                else
                    strs[r][c] = "y";
            }
        }
        printArray(strs);


        //2. Write a code segment to create a 2D array of ints
        //that has 4 rows and 6 columns.  It looks like this:
        /*
        111111
        222222
        333333
        444444
         */
        int[][] intGrid = new int[4][6];
        for (int r = 0; r < intGrid.length; r++) {
            for (int c = 0; c < intGrid[0].length; c++) {
                intGrid[r][c] = r + 1;
            }
        }
        printArray(intGrid);




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
