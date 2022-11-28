package com.yearup.week4.code;

public class YearUpStudent extends Student {
    public static final int enrolledTimeInYears = 1;


    public YearUpStudent(String name, int age, int enrolledTimeInYears) {
        super(name, age);
    }

    public static void main(String[] args) {
        YearUpStudent ysu1 = new YearUpStudent( "Marie", 20, 2);
        YearUpStudent ysu2 = new YearUpStudent( "Donald", 15, 2);
        System.out.println(ysu1.enrolledTimeInYears);
        System.out.println(ysu2.enrolledTimeInYears);

        System.out.println(YearUpStudent.enrolledTimeInYears);
    }
}

