package com.projecteuler.common;

import java.util.Arrays;

/**
 * @author Tobias Nilsson
 */
public class NumberUtil {

    public static long[] generateTriangleArray(int size) {

        long[] triangle = new long[1];

        int iterator = 0;
        int n = 1;
        while (n < size) {

            triangle = triangle.length != iterator ? triangle : Arrays.copyOf(triangle, 2 * iterator + 1);

            triangle[iterator] = n * (n + 1) / 2;

            n++;
            iterator++;
        }

        return Arrays.copyOfRange(triangle, 0, iterator);
    }

    public static long[] generateTriangleArrayUpTo(int value) {

        long[] triangle = new long[1];

        int iterator = 0;
        int pos = 0;
        int n = 1;
        while (triangle[pos] < value) {

            triangle[iterator] = n * (n + 1) / 2;

            n++;
            pos = iterator;
            iterator++;

            triangle = triangle.length != iterator ? triangle : Arrays.copyOf(triangle, 2 * iterator + 1);
        }

        return Arrays.copyOfRange(triangle, 0, iterator);
    }


}