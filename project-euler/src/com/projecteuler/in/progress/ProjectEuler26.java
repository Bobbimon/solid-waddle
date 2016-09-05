package com.projecteuler.in.progress;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author Tobias Nilsson
 */
public class ProjectEuler26 {

    public static void main(String[] args) {

        final BigDecimal nominator = new BigDecimal(1);
        BigDecimal denominator;
        BigDecimal product;

        for (int i = 1; i <= 10; i++) {

            denominator = BigDecimal.valueOf(i);
            product = nominator.divide(denominator, 1000, BigDecimal.ROUND_HALF_UP);
            System.out.println(product);

            String[] split = product.stripTrailingZeros().toString().split("\\.");
//            try {
                // Kan inte splitta!!!!
//            }
            char[] chars = split[1].toCharArray();

            char firstChar = chars[0];
            System.out.println(firstChar);
            int[] repPosition = new int[1];
            int iterator = 0;
            for (int j = 1; j < chars.length; j++) {
                if (chars[i] == firstChar) {

                    repPosition = repPosition.length != iterator ? repPosition : Arrays.copyOf(repPosition, 2 * iterator + 1);
                    repPosition[iterator] = i;

                    if (repPosition.length >= 2){
                        System.out.println("Here!!");
                        break;
                    }
                    iterator++;
                }
            }
            System.out.println();
        }
    }
}