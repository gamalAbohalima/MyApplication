package com.abouhalima.myapplication;

import java.util.Scanner;
public class Problem_H {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float a=scan.nextFloat();
        float b=scan.nextFloat();
        int aa=(int)a;
        int bb=(int)b;
        int x= (int) Math.floor(a/b);
        int y= (int) Math.ceil(a/b);
        int z= (int) Math.round(a/b);

        System.out.println("floor "+aa+" / "+ bb+" = "+x);
        System.out.println("ceil "+ aa+" / "+ bb+" = "+y);
        System.out.println("round "+ aa+" / "+ bb+" = "+z);
    }
}
