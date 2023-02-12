package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        long A=scan.nextLong();
        long B=scan.nextLong();
        long C=scan.nextLong();
        long D=scan.nextLong();

        long Difference=(A*B)-(C*D);
        System.out.println("Difference = "+Difference);
    }
}
