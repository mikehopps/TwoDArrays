/**
 * Created by michael_hopps on 11/13/17.
 */
public class TwoDIntroMain {

    public static void main(String[] args) {

        int[][] grid = new int[3][3]; //3 rows, 3 cols
                            //3 arrays, with 3 elements each

        //grid.length --> number of rows / number of 1D arrays
        //grid[0].length --> number of cols / length of the 0th 1D array
        //this is called ROW MAJOR order - go across first row, then next row...
        int num = 2;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = num;
                num += 2;
            }
        }

        //print the 2D array...
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + "\t\t");
            }
            System.out.println();
        }

    }
}
