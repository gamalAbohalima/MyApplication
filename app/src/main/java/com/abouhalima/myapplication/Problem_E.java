package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_E {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float radius =scan.nextFloat();
        double π=3.141592653;
        double Area=π*Math.pow(radius,2);
        System.out.printf("%.9f",Area);
    }
}
