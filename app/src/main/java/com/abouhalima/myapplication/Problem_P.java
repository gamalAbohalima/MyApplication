package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_P {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String num=scan.nextLine();
        // to get first digit
        char x=num.charAt(0);
        // convert from char to integer
        int new_Num=(int)(x);
        //to check even or odd
        if(new_Num  %2 ==0)
        {
            System.out.println("EVEN");
        }
        else
            System.out.println("ODD");



    }
}
