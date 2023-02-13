package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_J {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long x=scan.nextLong();
        long y=scan.nextLong();
        if(x%y==0)
        {
            System.out.println("Multiples");
        }else if(y%x==0)
        {
            System.out.println("Multiples");
        }else
        {
            System.out.println("No Multiples");
        }

    }
}
