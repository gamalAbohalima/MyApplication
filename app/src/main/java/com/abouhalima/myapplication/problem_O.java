package com.abouhalima.myapplication;

import java.util.Scanner;

public class problem_O {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String equ=scan.nextLine();
        int indexOperator = 0;
        char charOperator='+';
        String num1,num2;
        for(int i=0;i<equ.length();i++)
        {
            if(equ.charAt(i)=='+'
                    ||equ.charAt(i)=='-'
                    ||equ.charAt(i)=='*'
                    || equ.charAt(i)=='/')
            {
                    indexOperator=i; //2
                    charOperator=equ.charAt(i); //+,-,*,/
                    break;
            }
        }
        num1=equ.substring(0,indexOperator);
        num2=equ.substring(indexOperator+1);

        int num1Int=Integer.parseInt(num1);
        int num2Int=Integer.parseInt(num2);


        switch (charOperator)
        {
            case '+':
                System.out.println(num1Int+num2Int);
                break;
            case '-':
                System.out.println(num1Int-num2Int);
                break;
            case '*':
                System.out.println(num1Int*num2Int);
                break;
            case '/':
                System.out.println(num1Int/num2Int);
                break;
        }



    }
}
