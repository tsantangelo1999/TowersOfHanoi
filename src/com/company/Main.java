package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Tower of Hanoi Game.\nThis program will solve this puzzle for you.\nPlease input number of disks to solve for:");
        int disks = 0;
        while(disks < 1)
        {
            try
            {
                disks = input.nextInt();
                if(disks < 1)
                    throw new Exception();
            }
            catch(Exception e)
            {
                System.out.println("Number of disks must be positive integers.");
            }
        }
        TowersOfHanoi tower = new TowersOfHanoi(disks);
        tower.solve();
    }
}
