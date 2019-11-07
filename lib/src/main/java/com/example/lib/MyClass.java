package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the N:");
        int input=scanner.nextInt();
        System.out.print(input+"'s Prime number:\n");
        for(int i=2;i<=input;i++) {
            boolean isPrime=true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i+"  ");
            }
        }
    }
}