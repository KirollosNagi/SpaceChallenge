package com.company;

public class U1 extends Rocket{
    U1()
    {
        super();
        cost = 100; //millions
        weight = 10000; //kg
        limit = 18000; //kg
    }

    private double getExplosionChance()
    {
        return 0.05 * weight/limit;
    }
    private double getCrashChance()
    {
        return 0.01 * weight/limit;
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
