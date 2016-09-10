package com.pe.in.progress;

import com.pe.common.Primes;

/**
 * @author Tobias Nilsson
 */
public class Problem50 {

    public static void main(String[] args) {

        Long[] longs = Primes.generatePrimes(10);

        for (Long aLong : longs) {
            System.out.println(aLong);
        }
    }
}
