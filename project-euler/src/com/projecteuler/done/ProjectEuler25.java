package com.projecteuler.done;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class ProjectEuler25 {

    public static void main(String[] args) {

        int size = 3;
        BigInteger[] fibonacciNumber = new BigInteger[size];
        fibonacciNumber[0] = BigInteger.valueOf(1);
        fibonacciNumber[1] = BigInteger.valueOf(1);

        int length = 1000;
        int i = 2;
        while (fibonacciNumber[i-1].toString().length() < length) {

            fibonacciNumber = fibonacciNumber.length != i ? fibonacciNumber : Arrays.copyOf(fibonacciNumber, 2 * i + 1);

            fibonacciNumber[i] = fibonacciNumber[i - 1].add(fibonacciNumber[i - 2]);
            i++;
        }
        System.out.println(i);
    }
}
