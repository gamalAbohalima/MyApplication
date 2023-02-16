package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_M {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char x=scan.next(".").charAt(0);
        if (x>=97&&x<=122)
        {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
        else if(x>=65&&x<=90)
        {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
        else
            System.out.println("IS DIGIT");


    }
}
