package com.projecteuler.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tobias Nilsson {@literal <mailto:tobias.nilsson@so4it.com/>}
 */
public class FileUtil {

    public static String[] readFileToSortedStringArray(String filePath) {

        int rows = 0;
        try {
            Scanner scanner = new Scanner(new File(filePath)).useDelimiter("\\,");

            // Reads how many rows the file contains
            while (scanner.hasNext()) {
                scanner.useDelimiter(",").next().replace("\"", "");
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

        return contents;
    }

    public static long[] readFileToSortedCharValueSumArray(String filePath) {

        String[] stringArray = readFileToSortedStringArray(filePath);

        long[] charSumArray = new long[stringArray.length];
        int val = 0;
        int i = 0;
        for (String s : stringArray) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                val += Character.getNumericValue(aChar) - 9;
            }
            charSumArray[i] = val;
            i++;
            val = 0;
        }

        return charSumArray;
    }
}