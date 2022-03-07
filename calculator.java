package com.company;

import java.util.Scanner;

public class calculator {

    static double addition(double n1, double n2){
        return n1+n2;
    }

    static double substraction(double n1, double n2){
        return n1-n2;
    }

    static double multiplication(double n1, double n2){
        return n1*n2;
    }

    static double division(double n1, double n2){
        return n1/n2;
    }

    static double operations(){
        System.out.println("Hello !");
        System.out.println("What do you want to do ?\n\n");
        System.out.println("press num 1 for sum");
        System.out.println("press num 2 for diff");
        System.out.println("press num 3 for multi");
        System.out.println("press num 4 for divid");

        Scanner scn1 = new Scanner(System.in);
        System.out.print("\n\n Press your option......");
        int x = scn1.nextInt();

        System.out.println("Enter number1 .......");
        double n1 = scn1.nextInt();
        System.out.println("Enter number2 .......");
        double n2 = scn1.nextInt();

        double ans = 0;
        switch(x){
            case 1:
                ans = addition(n1,n2);
                break;
            case 2:
                ans = substraction(n1, n2);
                break;
            case 3:
                ans = multiplication(n1,n2);
                break;
            case 4:
                ans = division(n1,n2);
                break;
        }
        return ans;
    }

    public static void main( String[] args){
        double ans = operations();
        System.out.println("Answer is "+ans);
    }
}
