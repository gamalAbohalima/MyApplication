package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long x=scan.nextLong();
        long y=scan.nextLong();
        long a,b,c;
        a=x+y;
        b=x*y;
        c=x-y;
        System.out.println(x+" + "+y+" = "+a);
        System.out.println(x+" * "+y+" = "+b);
        System.out.println(x+" - "+y+" = "+c);
    }
}
