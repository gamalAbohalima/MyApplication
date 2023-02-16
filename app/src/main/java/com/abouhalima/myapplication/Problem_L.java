package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_L {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String p1=scan.nextLine();
        String p2=scan.nextLine();
        String [] s1=p1.split(" ");
        String [] s2=p2.split(" ");
        if (s1[1].equals(s2[1]))
        {
            System.out.println("ARE Brothers");
        }
        else
            System.out.println("NOT");

    }
}
