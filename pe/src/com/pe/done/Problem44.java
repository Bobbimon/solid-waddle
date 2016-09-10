package com.pe.done;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TobNil on 2016-09-05.
 */
public class Problem44 {

    public static void main(String[] args) {

        long startTime = System.nanoTime();


        List<Long> pentagonalNumbers = getPentagonalNumbers(2_300);
        //for (long number : pentagonalNumbers) {
        //    System.out.println(number);
        //}

        List<Long> pentagonalSumAndDiff = getPentagonalSumAndDiff(pentagonalNumbers);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println(duration);
        for (Long aLong : pentagonalSumAndDiff) {
            System.out.println(aLong.longValue());
        }
    }

    private static List<Long> getPentagonalNumbers(int n) {

        List<Long> pentagonals = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            pentagonals.add(i * (3 * i - 1) / 2);
        }

        return pentagonals;
    }

    private static List<Long> getPentagonalSumAndDiff(List<Long> pentagonals) {

        int length = pentagonals.size();
        Long diff;
        Long sum;
        List<Long> sumAndDiffIsPent = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            //System.out.println(i);
            for (int j = i; j < length; j++) {

                sum = pentagonals.get(i) + pentagonals.get(j);

                int i1 = isNthPentagonal(sum);

                if ( i1 != -1){
                    diff = pentagonals.get(j) - pentagonals.get(i);
                    int i2 = isNthPentagonal(diff);
                    if ( i2 != -1){
                        //long abs = Math.abs(pentagonals.get(i2) - pentagonals.get(i1));
                        sumAndDiffIsPent.add(diff);

                        return sumAndDiffIsPent;
                        // the answer NOOB!!
                        //System.out.println(diff);
                    }
                }

                /*int i1 = pentagonals.indexOf(sum);
                if (i1 != -1){
                    diff = pentagonals.get(j) - pentagonals.get(i);
                    int i2 = pentagonals.indexOf(Math.abs(diff));
                    if (i2 != -1) {
                        long abs = Math.abs(pentagonals.get(i2) - pentagonals.get(i1));
                        sumAndDiffIsPent.add(abs);

                        System.out.println(abs);
                    }
                }*/
            }
        }
        return sumAndDiffIsPent;
    }

    private static int isNthPentagonal(Long penta) {

        double n = (Math.sqrt(24.0 * penta + 1.0) + 1.0) / 6.0;
        double v = n % 1;

        if (v == 0) {
            return (int) n;
        } else {
            return -1;
        }
    }
}