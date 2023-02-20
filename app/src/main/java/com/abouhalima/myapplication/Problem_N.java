package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_N {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char mychar = scan.next().charAt(0);
            int asc=mychar;
            if(asc >= 97 && asc <= 122)
            {
                asc=asc-32;
                char rechar= (char) asc;
                System.out.println(rechar);
            }else if(asc >= 65 && asc <=90)
            {
                asc=asc+32;
                char rechar= (char) asc;
                System.out.println(rechar);

        }
    }
}
