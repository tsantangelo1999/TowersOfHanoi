package com.company;

public class TowersOfHanoi
{
    public int disks;
    public int[] location;
    public int iterations;

    public TowersOfHanoi(int d)
    {
        disks = d;
        location = new int[d];
        for(int i = 0; i < location.length; i++)
        {
            location[i] = 1;
        }
        iterations = 0;
    }

    public void solve()
    {
        for(int i = 1; i <= disks; i++)
        {
            moveSubtower(i);
        }
    }

    public void moveSubtower(int size)
    {
        if(size > 0)
        {
            iterations++;
            System.out.print(iterations + ": Move one disk from tower " + location[size - 1] + " to ");
            location[size - 1] = (location[size - 1] + (disks % 2 == size % 2 ? -1 : 1) + 3) % 3;
            if(location[size - 1] == 0)
                location[size - 1] = 3;
            System.out.println(location[size - 1] + ".");
            for(int i = 1; i < size; i++)
            {
                moveSubtower(i);
            }
        }
    }
}
