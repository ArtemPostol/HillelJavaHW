package second_lesson;

import java.util.Arrays;

public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 18;
        int day = 4;
//        ifElseStatement(age);
//        switchStatement(day);
//        cyclesFor();
//        cyclesWhile();
//        array();
//        forEachStatment();
        cycle2();

    }

    public static void ifElseStatement(int age) {
        String message;
        if (age < 18) {
            message = "Sorry bro you are young!";
        } else if (age >= 18 || age <= 55) {
            message = "Ok, job yours!";
        } else {
            message = "You are old";
        }
        System.out.println(message);
    }

    public static void switchStatement(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void cyclesFor() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void cyclesWhile() {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown--;
        }

        do {
            System.out.println("До старта: " + countDown);
            countDown--;
        } while (countDown >= 0);
    }

    public static void forEachStatment() {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        for (String season : seasons) {
            System.out.println("Foreach " + season);
        }

        for (int i = 0; i < seasons.length; i++) {
            System.out.println("For " + seasons[i]);
        }

    }

    public static void array() {
        int[] dayMonth;

        dayMonth = new int[31];

        for (int i = 1; i <= dayMonth.length; i++) {
            dayMonth[i - 1] = i;
        }
        System.out.print("Method 1:" + Arrays.toString(dayMonth) + "\n");

        for (int i = 0; i < dayMonth.length; i++) {
            dayMonth[i] = i + 1;
        }

        System.out.print("Method 2:" + Arrays.toString(dayMonth));
    }

    public static void cycle2() {
        switch (4) {
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
        }
    }
}
