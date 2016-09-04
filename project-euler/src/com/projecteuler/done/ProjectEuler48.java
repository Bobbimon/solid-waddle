package com.projecteuler.done;

import java.math.BigInteger;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class ProjectEuler48 {

    public static void main(String[] args) {

        BigInteger biSum = new BigInteger("0");
        BigInteger newSum = new BigInteger("0");

        for (int i = 1; i <= 1000; i++) {
            newSum = BigInteger.valueOf(i).pow(i);
            biSum = biSum.add(newSum);
        }

        char[] chars = biSum.toString().toCharArray();

        for (int i = chars.length - 10; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
