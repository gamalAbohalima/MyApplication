package com.abouhalima.myapplication;

import java.util.Scanner;

public class Problem_Q {
    public static void main(String[] args) {
        // to get number from user!!
        Scanner scan=new Scanner(System.in);
        double x=scan.nextDouble();  // get x
        double y=scan.nextDouble();  // get y



        if(x>0 && y>0) // x--> positive and y--> positive (+,+)
        {
            System.out.println("Q1");
        }
        else if(x<0 && y>0) // x--> negative and y--> positive (-,+)
        {
            System.out.println("Q2");
        }
        else if(x<0 && y<0) // x--> negative and y--> negative (-,-)
        {
            System.out.println("Q3");
        }else if(x>0 && y<0) // x--> positive and y--> negative (+,-)
        {
            System.out.println("Q4");
        }else if(x==0 && y==0)
        {
            System.out.println("Origem");
        }
        else if(x==0 && y!=0)
        {
            System.out.println("Eixo Y");
        }
        else if(y==0 && x!=0)
        {
            System.out.println("Eixo X");
        }


    }
}
