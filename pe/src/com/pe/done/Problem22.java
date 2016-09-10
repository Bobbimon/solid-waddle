package com.pe.done;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tobias Nilsson
 */
public class Problem22 {

    public static void main(String[] args) {
        String filePath = "resources/p022_names.txt";
        String content;
        int rows = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath)).useDelimiter("\\,");

            while (scanner.hasNext()) {
                content = scanner.useDelimiter(",").next().replace("\"", "");
                System.out.println(content);
                rows++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] contents = new String[rows];
        int iterator = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath)).useDelimiter("\\,");

            while (scanner.hasNext()) {
                contents[iterator] = scanner.useDelimiter(",").next().replace("\"", "");
                iterator++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Arrays.sort(contents);

        long multiplier = 1;
        long[] productArray = new long[rows];
        int val = 0;
        for (String s : contents) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                val += Character.getNumericValue(aChar) - 9;
            }
            productArray[(int) multiplier - 1] = multiplier * val;
            val = 0;
            multiplier++;
        }

        long sum = 0;
        for (long l : productArray) {
            sum += l;
        }

        System.out.println(sum);
    }
}