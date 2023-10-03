package com.greatlearning.preWorkAssignment;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome() {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int i = number;
        int rev = 0;
        while (i != 0) {
            rev = (rev*10) + (i%10);
            i /= 10;
        }
        if (number == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    //function to printPattern
    public void printPattern() {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Neither prime nor composite");
            return;
        }
        for (int i=2; i*i <= n; i++) {
            if (n%i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1;
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ans;
        if (n == 1) {
            System.out.println(first);
        }

        else if (n>=2) {
            System.out.print(first + " ");
            System.out.print(second + " ");

            for (int i=3; i<=n; i++) {
                ans = first + second;
                System.out.print(ans + " ");
                first = second;
                second = ans;
            }
        }


    }

//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();
        int choice;

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {


                case 0:
                    choice = 0;
                    break;

                case 1:
                    obj.checkPalindrome();
                    break;

                case 2:
                    obj.printPattern();
                    break;

                case 3:
                    obj.checkPrimeNumber();
                    break;

                case 4:
                    obj.printFibonacciSeries();
                    break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");

            }


        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }
}
