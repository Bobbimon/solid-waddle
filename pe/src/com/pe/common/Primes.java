package com.pe.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tobias Nilsson
 */
public class Primes {

    public static Long[] generatePrimes(int n) {

        Long[] primes = new Long[1];

        int i = 1;
        int nrOfPrimes = 0;

        while (nrOfPrimes < n) {

            primes = primes.length != nrOfPrimes ? primes : Arrays.copyOf(primes, 2 * nrOfPrimes + 1);

            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primes[nrOfPrimes] = (long) i;
                nrOfPrimes++;
            }
            i++;
        }

        Long[] generatedPrimes = new Long[nrOfPrimes];
        System.arraycopy(primes, 0, generatedPrimes, 0, nrOfPrimes);

        return generatedPrimes;
    }

    public static Long[] generatePrimesUpTo(long n) {

        Long[] primes = new Long[1];
        primes[0] = 0L;

        int i = 1;
        int val = 0;
        int nrOfPrimes = 0;

        while (primes[val] < n) {

            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primes[nrOfPrimes] = (long) i;
                nrOfPrimes++;
            }
            val = nrOfPrimes;
            primes = primes.length != nrOfPrimes ? primes : Arrays.copyOf(primes, 2 * nrOfPrimes + 1);
            i++;
        }

        Long[] generatedPrimes = new Long[nrOfPrimes];
        System.arraycopy(primes, 0, generatedPrimes, 0, nrOfPrimes);

        return generatedPrimes;
    }

    public static List<Long> generatePrimes(int n) {
        List<Long> primes = new ArrayList<>();
        long i;
        long iterator = 1;

        while (primes.size() < n ) {

            for (i)

            iterator++;
        }

        return null;
    }
}