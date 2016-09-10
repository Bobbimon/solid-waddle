package com.projecteuler.in.progress;

/**
 * @author Tobias Nilsson
 */
public class Problem19 {

    private int sundayFirstDayOfTheMonth;

    public Problem19(int sundayFirstDayOfTheMonth) {
        this.sundayFirstDayOfTheMonth = sundayFirstDayOfTheMonth;
    }

    public int getSundayFirstDayOfTheMonth() {
        return sundayFirstDayOfTheMonth;
    }

    public void setSundayFirstDayOfTheMonth(int sundayFirstDayOfTheMonth) {
        this.sundayFirstDayOfTheMonth = sundayFirstDayOfTheMonth;
    }

    public static void main(String[] args) {

        Problem19 problem19 = new Problem19(0);

        int totalAmountOfDays = 0;
        problem19.daysOfYear(1900, totalAmountOfDays);

        int sundaysFirstYear = problem19.getSundayFirstDayOfTheMonth();

        totalAmountOfDays = 0;
        problem19.setSundayFirstDayOfTheMonth(0);

        int startYear = 1901;
        int endYear = 2000;

        for (int year = startYear; year <= endYear; year++) {
            totalAmountOfDays += problem19.daysOfYear(year, totalAmountOfDays);
        }

        System.out.println(problem19.getSundayFirstDayOfTheMonth() - sundaysFirstYear);

    }


    private int daysOfYear(int year, int previewsDays) {

        for (int month = 1; month <= 12; month++) {
            previewsDays += daysOfMonth(year, month);
            if (isSundayTheFirstDayOfTheMonth(previewsDays) && month != 12)
                this.sundayFirstDayOfTheMonth++;
        }

        return previewsDays;
    }

    private int daysOfMonth(int year, int month) {

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