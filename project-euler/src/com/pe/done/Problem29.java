package com.pe.done;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author Tobias Nilsson
 */
public class Problem29 {

    public static void main(String[] args) {

        int length = 100;
        BigInteger[][] bdArray = new BigInteger[length - 1][length - 1];

        for (int i = 2; i <= length; i++) {
            for (int j = 2; j <= length; j++) {
                bdArray[i - 2][j - 2] = BigInteger.valueOf(i).pow(j);
            }
        }

        List<BigInteger> bigIntegerList = new ArrayList<BigInteger>();

        for (BigInteger[] bigIntegers : bdArray) {
            Collections.addAll(bigIntegerList, bigIntegers);
        }

        Collections.sort(bigIntegerList);

        System.out.println(bigIntegerList.size());

        // Creating LinkedHashSet
        LinkedHashSet<BigInteger> lhs = new LinkedHashSet<BigInteger>();

        /* Adding ArrayList elements to the LinkedHashSet
         * in order to remove the duplicate elements and
         * to preserve the insertion order.
         */
        lhs.addAll(bigIntegerList);

        // Removing ArrayList elements
        bigIntegerList.clear();

        // Adding LinkedHashSet elements to the ArrayList
        bigIntegerList.addAll(lhs);

        System.out.println();
        System.out.println(bigIntegerList.size());
    }
}