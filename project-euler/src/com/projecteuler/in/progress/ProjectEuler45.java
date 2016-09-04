package com.projecteuler.in.progress;

import java.util.Arrays;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class ProjectEuler45 {

    public static void main(String[] args) {

        long[] triangle = new long[1];
        long[] pentagonal = new long[1];
        long[] hexagonal = new long[1];

        int iterator = 0;
        int n = 1;
        int size = 300;
        while (n < size) {

            triangle = triangle.length != iterator ? triangle : Arrays.copyOf(triangle, 2 * iterator + 1);
            pentagonal = pentagonal.length != iterator ? pentagonal : Arrays.copyOf(pentagonal, 2 * iterator + 1);
            hexagonal = hexagonal.length != iterator ? hexagonal : Arrays.copyOf(hexagonal, 2 * iterator + 1);

            triangle[iterator] = n * (n + 1) / 2;
            pentagonal[iterator] = n * (3 * n - 1) / 2;
            hexagonal[iterator] = n * (2 * n - 1) / n;

            n++;
            iterator++;
        }

        for (long l : triangle) {
            System.out.println(l);
        }

//        List<Long> comboArray = new ArrayList<Long>();
//        comboArray.addA(triangle);
    }
}
