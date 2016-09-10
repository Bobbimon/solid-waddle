package com.projecteuler.in.progress;

/**
 * @author Tobias Nilsson
 */
public class Problem19_fail {

    private int sundayFirstDayOfTheMonth = 0;

    public static void main(String[] args) {

        int startYear = 1901;
        int endYear = 2000;

        int daysFirstYear = daysOfYear(1900);


        int totalAmountOfDays = 0;
        for (int year = startYear; year <= endYear ; year++) {
            totalAmountOfDays += daysOfYear(year);
        }

        System.out.println(totalAmountOfDays / 7);

    }

    private static int daysOfYear(int year) {

        int daysPerYear = 0;

        for (int month = 1; month <= 12 ; month++) {
            daysPerYear += daysOfMonth(year, month);
        }

        return daysPerYear;
    }

    private static int daysOfMonth(int year, int month) {

        int daysPerMonth = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysPerMonth = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysPerMonth = 31;
                break;
            case 2:
                if (year % 100 == 0) {
                    daysPerMonth = year % 400 == 0 ? 29 : 28;
                } else {
                    daysPerMonth = year % 4 == 0 ? 29 : 28;
                }
                break;
        }

        return daysPerMonth;
    }

    private static boolean isSundayTheFirstDayOfTheMonth(int lastDay) {
        return lastDay % 7 == 6;
    }
}