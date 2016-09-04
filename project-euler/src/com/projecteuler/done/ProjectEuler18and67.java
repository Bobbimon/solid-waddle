package com.projecteuler.done;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class ProjectEuler18and67 {

    public static void main(String[] args) {

//        String filePath = "resources/p018_pyramid.txt";
        String filePath = "resources/p067_pyramid.txt";

        long[][] fromFile = populateArrayFromFile(filePath);

        System.out.println();

        long[] sumRow = largestRowSum(fromFile[0], fromFile[1]);

        for (long aLong : sumRow) {
            System.out.print(aLong + " ");
        }
        System.out.println();

        for (int i = 1; i < fromFile.length - 1; i++) {
            sumRow = largestRowSum(sumRow, fromFile[i + 1]);
            for (long aLong : sumRow) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }

        long maxVal = 0;

        for (long l : sumRow) {
            maxVal= maxVal <= l ? l : maxVal;

        }

        System.out.println();
        System.out.println(maxVal);


//        for (long aLong : longs) {
//            System.out.print(aLong + " ");
//        }
    }

    public static long[][] populateArrayFromFile(String filePath) {

        int rows = 0;

        try {
            FileReader reader = new FileReader(new File(filePath));
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                rows++;
            }
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }

        long[][] lArray = new long[rows][rows];

        try {
            FileReader reader = new FileReader(new File(filePath));
            Scanner scan = new Scanner(reader);

            int x;
            int y = 0;

            while (scan.hasNextLine()) {
                x = 0;
                String[] split = scan.nextLine().split(" ");
                for (String s : split) {
                    lArray[y][x] = Long.parseLong(s);
                    x++;
                }
                y++;
            }

            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }

        return lArray;
    }

    public static long[] largestRowSum(long[] row1, long[] row2) {

        long[] sumRow = new long[row1.length];

        for (int i = 0; i < row1.length; i++) {
            if (row1[i] != 0) {
                sumRow[i] = sumRow[i] >= row1[i] + row2[i] ? sumRow[i] : row1[i] + row2[i];
                sumRow[i + 1] = sumRow[i + 1] >= row1[i] + row2[i + 1] ? sumRow[i + 1] : row1[i] + row2[i + 1];
            }
        }

        return sumRow;
    }
}