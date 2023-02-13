package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_G {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        long summation=n*(n+1)/2;
        System.out.println(summation);
    }
}
