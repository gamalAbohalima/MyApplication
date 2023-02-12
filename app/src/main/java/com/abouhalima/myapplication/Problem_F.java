package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_F {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        long N=scan.nextLong();
        long M=scan.nextLong();

        long x= N % 10;
        long y= M % 10;

        long z=x+y;
        System.out.println(z);

    }
}
