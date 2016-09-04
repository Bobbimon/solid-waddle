package com.projecteuler.in.progress;

import com.projecteuler.common.Primes;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class ProjectEuler50 {

    public static void main(String[] args) {

        Long[] longs = Primes.generatePrimes(10);

        for (Long aLong : longs) {
            System.out.println(aLong);
        }
    }
}
