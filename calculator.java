package com.company;

import java.util.Scanner;

public class calculator {

    static int operations(){
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
        int n1 = scn1.nextInt();
        System.out.println("Enter number2 .......");
        int n2 = scn1.nextInt();

        int ans = 0;
        switch(x){
            case 1:
                ans = n1+n2;
                break;
            case 2:
                ans = n1-n2;
                break;
            case 3:
                ans = n1*n2;
                break;
            case 4:
                ans = n1/n2;
                break;
        }
        return ans;
    }

    public static void main( String[] args){
        int ans = operations();
        System.out.println("Answer is "+ans);
    }
}
