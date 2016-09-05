package com.projecteuler.in.progress;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by TobNil on 2016-09-05.
 */
public class ProjectEuler44 {

    public static void main(String[] args) {

        List<Long> pentagonalNumbers = getPentagonalNumbers(10);

        Optional<Long> first = pentagonalNumbers.stream().filter(x -> x == 2).findFirst();

        System.out.println(first.isPresent());

        for (long number : pentagonalNumbers) {
            System.out.println(number);
        }
    }

    private static List<Long> getPentagonalNumbers(int n) {

        List<Long> pentagonals = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            pentagonals.add(i * (3 * i - 1) / 2);
        }

        return pentagonals;
    }

 /*   private static long[] getPentagonalSumAndDiff(long[] pentagonals) {

        int length = pentagonals.length;
        long diff;
        long sum;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                sum = pentagonals[i] + pentagonals[j];
                diff = pentagonals[i] - pentagonals[j];

                LongStream.of(pentagonals).filter(x -> x == diff)
                        .collect(Collectors.toSet());
                Object collect = LongStream.of(pentagonals).filter(x -> x == sum).collect();
                if(pentagonals[i] + )
            }
        }

        return result;
    }*/
}