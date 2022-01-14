package com.company;

public class U2 extends Rocket{
    U2()
    {
        super();
        cost = 120; //millions
        weight = 18000; //kg
        limit = 29000; //kg
    }

    private double getExplosionChance()
    {
        return 0.04 * weight/limit;
    }
    private double getCrashChance()
    {
        return 0.08 * weight/limit;
    }
    @Override
    public boolean launch()
    {
        return Math.random() <= getExplosionChance();
    }
    @Override
    public boolean land()
    {
        return Math.random() <= getCrashChance();
    }
}
