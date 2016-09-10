package com.pe.done;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tobias Nilsson
 *
 * Solved in matlab
 */
public class Problem45 {

    public static void main(String[] args) {

        List<Long> triangle = new ArrayList<>();
        List<Long> pentagonal = new ArrayList<>();
        List<Long> hexagonal = new ArrayList<>();

        int iterator = 0;
        long n = 1;
        int size = 300;
        while (n < size) {

            //triangle = triangle.length != iterator ? triangle : Arrays.copyOf(triangle, 2 * iterator + 1);
            //pentagonal = pentagonal.length != iterator ? pentagonal : Arrays.copyOf(pentagonal, 2 * iterator + 1);
            //hexagonal = hexagonal.length != iterator ? hexagonal : Arrays.copyOf(hexagonal, 2 * iterator + 1);

            //triangle[iterator] = n * (n + 1) / 2;
            //pentagonal[iterator] = n * (3 * n - 1) / 2;
            //hexagonal[iterator] = n * (2 * n - 1) / n;

            triangle.add(n * (n + 1) / 2);
            pentagonal.add(n * (3 * n - 1) / 2);
            hexagonal.add(n * (2 * n - 1) / n);

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
