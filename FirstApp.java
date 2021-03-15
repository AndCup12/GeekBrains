package ru.geekbrains_home_work;

import java.sql.SQLOutput;

public class FirstApp {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        long c = 20;
        int d = 2;
        float r = calculate(a,b,c,d);
        String S = "Andrey";
        int Y = 341;
        System.out.println(r);
        System.out.println(task10and20(a,b));
        System.out.println(positiveOrNegative(a));
        System.out.println(helloBoy(S));
        System.out.println(whatYearIsIt(Y));
    }

    static float calculate(int a, int b, long c, int d) {
        float result = a * (b + (c / d));
        return result;
    }
    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static String positiveOrNegative(int a){
        if (0 <= a) {
            return "positve";
        } else {
            return "negative";
         }
    }
    public static String helloBoy (String S) {
        String S1 = "Привет, " + S +"!";
        return S1;
    }
    public static String whatYearIsIt (int Y){
        if ((Y % 4 == 0) && (Y % 100 !=0) ||  (Y % 400 ==0 )){
            return "leap year";
        } else {
            return "not a leap year";
        }

    }
}
