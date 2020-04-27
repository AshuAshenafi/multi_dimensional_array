/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     PSEUDOCODE    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Start
 * // First requirement of the exercise
 * // INPUT
 * declare and initialize two-dimensional array col[][] with 10 rows and 5 columns
 * declare and initialize two-dimensional array row[][] with 1 rows and 10 columns
 * // PROCESS & OUTPUT
 * print notification for First output
 * print new line for presentable display of the output
 * 	FOR LOOP1
 * 		index starts from zero and less than number of rows
 * 		FOR LOOP2
 * 			index starts from zero and less than number of column
 * 			introduce new index k = 0 for row[][] has only one row that does not change
 * 			print array or row[][] first and col[][] next for current index
 * 		END FOR LOOP2
 * 		print new line
 * 	END FOR LOOP1
 *
 * // Second requirement starts here
 * //INPUT
 * declare two-dimensional array col_arr[][] with twelve rows and twelve columns
 * declare two-dimensional array row_arr[][] with one row and twelve columns
 * 	FOR LOOP1
 * 		index starts from zero and less than number of rows
 * 		introduce new index k = 0 for row[][] has only one row that does not change
 * 		FOR LOOP2
 * 			index starts from zero and less than number of column
 * 			initialize col_arr[][] values (1-12) with current index plus one
 * 		END FOR LOOP2
 * 		initialize row_arr[][] with value (1-12) equal to current index plus one
 * 	END FOR LOOP1
 * print notification for Second output
 * // PROCESS & OUTPUT
 * 	FOR LOOP1
 * 		index starts from zero and less than number of rows
 * 		FOR LOOP2
 * 			index starts from zero and less than number of column
 * 			introduce new index k = 0 for row[][] has only one row that does not change
 * 			print array or row[][] first and col[][] next for current index
 * 		END FOR LOOP2
 * 		print new line
 * 	END FOR LOOP1
 * end
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *     TEST DATA -1    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * First output.
 * ------------------------
 * row 0 col 0 row 0 col 1 row 0 col 2 row 0 col 3 row 0 col 4
 * row 1 col 0 row 1 col 1 row 1 col 2 row 1 col 3 row 1 col 4
 * row 2 col 0 row 2 col 1 row 2 col 2 row 2 col 3 row 2 col 4
 * row 3 col 0 row 3 col 1 row 3 col 2 row 3 col 3 row 3 col 4
 * row 4 col 0 row 4 col 1 row 4 col 2 row 4 col 3 row 4 col 4
 * row 5 col 0 row 5 col 1 row 5 col 2 row 5 col 3 row 5 col 4
 * row 6 col 0 row 6 col 1 row 6 col 2 row 6 col 3 row 6 col 4
 * row 7 col 0 row 7 col 1 row 7 col 2 row 7 col 3 row 7 col 4
 * row 8 col 0 row 8 col 1 row 8 col 2 row 8 col 3 row 8 col 4
 * row 9 col 0 row 9 col 1 row 9 col 2 row 9 col 3 row 9 col 4
 *
 * Second output required.
 * ------------------------
 *   1 	  2 	  3 	  4 	  5 	  6 	  7 	  8 	  9 	 10 	 11 	 12
 *   2 	  4 	  6 	  8 	 10 	 12 	 14 	 16 	 18 	 20 	 22 	 24
 *   3 	  6 	  9 	 12 	 15 	 18 	 21 	 24 	 27 	 30 	 33 	 36
 *   4 	  8 	 12 	 16 	 20 	 24 	 28 	 32 	 36 	 40 	 44 	 48
 *   5 	 10 	 15 	 20 	 25 	 30 	 35 	 40 	 45 	 50 	 55 	 60
 *   6 	 12 	 18 	 24 	 30 	 36 	 42 	 48 	 54 	 60 	 66 	 72
 *   7 	 14 	 21 	 28 	 35 	 42 	 49 	 56 	 63 	 70 	 77 	 84
 *   8 	 16 	 24 	 32 	 40 	 48 	 56 	 64 	 72 	 80 	 88 	 96
 *   9 	 18 	 27 	 36 	 45 	 54 	 63 	 72 	 81 	 90 	 99 	108
 *  10 	 20 	 30 	 40 	 50 	 60 	 70 	 80 	 90 	100 	110 	120
 *  11 	 22 	 33 	 44 	 55 	 66 	 77 	 88 	 99 	110 	121 	132
 *  12 	 24 	 36 	 48 	 60 	 72 	 84 	 96 	108 	120 	132 	144
 *
 */

public class Q1PrintRowColumn {
    public static void main(String[] args) {

        // declare and initialize two dimensional arrays
        // first array
        int[][] col = {{0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}};
        // second array
        int[][] row = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};

        // notify user about the next output
        System.out.println("First output.");
        for (int i = 0; i < 6; i++) {
            System.out.print("----");
        }

        // print new line
        System.out.println();
        // print arrays content in row and column
        for (int i = 0; i < 10; i++) {
            for (int j = 0, k = 0; j < 5; j++) {
                System.out.printf("row %d col %d ", row[k][i], col[i][j]);
            }
            System.out.println();
        }
        /*
        Second exercise on multidimensional array
         */

        // declare two dimensional arrays
        int[][] col_arr = new int[12][12];
        int[][] row_arr = new int[1][12];

        // initialize two dimensional arrays
        for (int i = 0, k = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                col_arr[i][j] = (j + 1);
            }
            row_arr[k][i] = (i + 1);
        }

        // notify user about the next output
        System.out.println("\nSecond output.");
        for (int i = 0; i < 6; i++) {
            System.out.print("----");
        }
        System.out.println();

        // print arrays content multiplication in row and column
        for (int i = 0; i < 12; i++) {
            for (int j = 0, k = 0; j < 12; j++) {
                System.out.printf("%3d \t", (row_arr[k][i] * col_arr[i][j]));
            }
            System.out.println();
        }
    }   // end of main
}   // end of class
