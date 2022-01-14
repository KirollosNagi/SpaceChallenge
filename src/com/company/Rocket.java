package com.company;

import java.util.ArrayList;

public class Rocket implements SpaceShip{
    int cost;
    int weight;
    int limit;
    private double explosionChance;
    private double crashChance;
    ArrayList<Item> items;

    Rocket()
    {
        items = new ArrayList<>();
    }
    public boolean launch()
    {
        return true;
    }
    public boolean land()
    {
        return true;
    }
    public boolean canCarry(Item item)
    {
        if(weight+item.weight>limit)
            return false;
        else
            return true;
    }
    public void carry(Item item)
    {
        weight+=item.weight;
        items.add(item);
    }
}
