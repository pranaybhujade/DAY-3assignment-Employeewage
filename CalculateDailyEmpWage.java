package com.bridgelabz;

public class CalculateDailyEmpWage {
    public static void main(String[] args) {
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HOUR=20;
        int empHrs=0;
        int empWage=0;
        double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==IS_FULL_TIME)
            empHrs=8;
        else empHrs=0;
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("emp wage:" +empWage);
    }
}
