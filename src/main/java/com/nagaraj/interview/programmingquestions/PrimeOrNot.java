package com.nagaraj.interview.programmingquestions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test : ");
        int a = scanner.nextInt();
        int count =0;
        for(int i=2; i<=a; i++){
            if(a%i ==0){
                count++;
            }
            if(count>1){
                System.out.println("Not a prime number");
                break;
            }
        }
        if(count==1){
            System.out.println("prime number");
        }
    }
}
