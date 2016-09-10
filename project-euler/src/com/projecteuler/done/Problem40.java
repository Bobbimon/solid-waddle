package com.projecteuler.done;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by TobNil on 2016-09-08.
 */
public class Problem40 {

    public static void main(String[] args) {

        String s = "";
        Integer i = 1;
        while(s.length() <= 1_000_000) {
            s+= i.toString();
            i++;
        }
        char[] c = s.toCharArray();

        System.out.println("Answer:");
        System.out.println(c[0]);
        System.out.println(c[9]);
        System.out.println(c[99]);
        System.out.println(c[999]);
        System.out.println(c[9999]);
        System.out.println(c[99999]);
        System.out.println(c[999999]);

        double product = c[0] * c[9] * c[99] * c[999] * c[9999] * c[99999] * c[999999];
        //System.out.println(product);
    }
}