package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_K {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        long x=scan.nextLong();
        long y=scan.nextLong();
        long z=scan.nextLong();
        if(x>=y && x>=z ) // x
        {
          if(y>=z){
              System.out.println(z+" "+x);
          }
          else
          {
              System.out.println(y+" "+x);
          }
        }
        else if(y>=x && y>=z ) // y
        {
            if(x>=z)
            {
                System.out.println(z+" "+y);
            }
            else
            {
                System.out.println(x+" "+y);
            }

        }
        else if(z>=x && z>=y) // z
        {
            if(x>=y)
            {
                System.out.println(y+" "+z);
            }
            else
            {
                System.out.println(x+" "+z);
            }
            {

            }
        }

    }
}
