package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems(String fileName)
    {
        File file;
        Scanner input= null;
        try {
             file = new File(fileName);
            input = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: "+ fileName);
            return null;
        }
        ArrayList<Item> items = new ArrayList<>();
        while(input.hasNextLine())
        {
            String[] line = input.nextLine().split("=");
            items.add(new Item(line[0],Integer.parseInt(line[1])));
        }

        return items;
    }

    ArrayList<U1> loadU1(ArrayList<Item> items)
    {
        ArrayList<U1> u1s = new ArrayList<>();
        U1 tempU1 = new U1();
        Iterator<Item> itr = items.iterator();
        for (Item item : items)
        {
            if(tempU1.canCarry(item))
                tempU1.carry(item);
            else
            {
                u1s.add(tempU1);
                tempU1 = new U1();
            }
        }
        return u1s;
    }
    ArrayList<U2> loadU2(ArrayList<Item> items)
    {
        ArrayList<U2> u2s = new ArrayList<>();
        U2 tempU2 = new U2();
        Iterator<Item> itr = items.iterator();
        for (Item item : items)
        {
            if(tempU2.canCarry(item))
                tempU2.carry(item);
            else
            {
                u2s.add(tempU2);
                tempU2 = new U2();
            }
        }
        return u2s;
    }
    double runSimulation(ArrayList<? extends Rocket> rockets)
    {
        double cost=0;
        for (Rocket rocket : rockets) {
            cost+=rocket.cost;
            while(!rocket.launch())
                cost+=rocket.cost;
            while(!rocket.land())
                cost+=rocket.cost;
        }
        return cost;
    }


}
