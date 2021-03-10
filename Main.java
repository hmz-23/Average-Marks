package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3;
        double avg ;
        System.out.println("Marks in Subject 1:");
        m1 = sc.nextInt();
        System.out.println("Marks in Subject 2:");
        m2 = sc.nextInt();
        System.out.println("Marks in Subject 3:");
        m3 = sc.nextInt();
        avg = (m1 + m2 + m3)/3;

        if(avg>=85 && avg<=100)
        {
            System.out.println("EXCELLENT");
        }
        else if(avg>=75 && avg<=84)
        {
            System.out.println("DISTINCTION");
        }
        else if(avg>=60 && avg <=74)
        {
            System.out.println("FIRST CLASS");
        }
        else if(avg>=40 && avg<=59)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        System.out.println("The average is :" +avg);

    }
}
