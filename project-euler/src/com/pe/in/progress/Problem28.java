package com.pe.in.progress;

import java.util.Arrays;

/**
 * @author Tobias Nilsson
 */
public class Problem28 {

    public static void main(String[] args) {

//        Set<Long> corners = new HashSet<Long>();
//        int size = 25;
//        long[] lArray = new long[size];
//        long[] lArrayCorners = new long[size];
//
//        for (int i = 0; i < size; i++) {
//            lArray[i] = i + 1;
//        }
//
//        corners.add(0L);

        long[] spiral = generateSpiral(3);

        System.out.println(spiral);

//        for (long l : spiral) {
//            System.out.println(l);
//        }
    }

//    private static Set<Long> circularCorners(long[] lArray, int side) {
//    }

    private static long[] generateSpiral(int size) {

        int sideSize = 1;
        int sides = 1;

        int[] slash;
        int[] backslash;

        int counter = 0;

        long[] lSpiral = new long[sideSize];

        while (sideSize != size) {

            // Increase the array size
            lSpiral = lSpiral.length != counter ? lSpiral : Arrays.copyOf(lSpiral, 2 * counter + 1);

//            if (counter == s) {
//                lSpiral[counter] = ++counter;
//            }
        }

        return lSpiral;
    }
}