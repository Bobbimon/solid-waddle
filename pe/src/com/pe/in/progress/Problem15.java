package com.pe.in.progress;

/**
 * @author Tobias Nilsson
 */
public class Problem15 {

    public static void main(String[] args) {

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                System.out.println(routes(i, j));
            }
            System.out.println("hej");
        }


    }

    private static long routes(int cols, int rows) {

        long routes = 0;
        long[][] matrix = new long[rows][cols];
        int currentCols = 0;

        for (int i = 0; i < rows; i++) {
//            matrix[i][0]

//            while
//            for (int j = 0; j < cols; j++) {
//
//            }
        }

        routes = cols * rows * 2;

        return routes;
    }
}
