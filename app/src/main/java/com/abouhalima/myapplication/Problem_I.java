package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_I {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        if(A>=B)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
