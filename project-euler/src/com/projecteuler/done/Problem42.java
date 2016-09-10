package com.projecteuler.done;

import com.projecteuler.common.NumberUtil;
import com.projecteuler.common.FileUtil;

/**
 * @author Tobias Nilsson
 */
public class Problem42 {

    public static void main(String[] args) {

        String filePath = "resources/p042_words.txt";

        long[] longs = FileUtil.readFileToSortedCharValueSumArray(filePath);

        long maxVal = 0;
        for (long aLong : longs) {
            maxVal = maxVal < aLong ? aLong : maxVal;
        }

        long[] triangleArray = NumberUtil.generateTriangleArrayUpTo((int) maxVal);

        int numberOfTriangles = 0;
        for (long l : triangleArray) {
            for (long aLong : longs) {
                if (l == aLong) {
                    numberOfTriangles++;
                }
            }
        }

        System.out.println(numberOfTriangles);
    }
}