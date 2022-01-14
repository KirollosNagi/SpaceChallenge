package com.company;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        double c1 = simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase-1.txt")));
        System.out.println(c1);
        double c2 = simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase-2.txt")));
        System.out.println(c2);
        System.out.println("U1 Total Budget= " + (c1+c2));
        c1 = simulation.runSimulation(simulation.loadU2(simulation.loadItems("phase-1.txt")));
        System.out.println(c1);
        c2 = simulation.runSimulation(simulation.loadU2(simulation.loadItems("phase-2.txt")));
        System.out.println(c2);
        System.out.println("U1 Total Budget= " + (c1+c2));


    }
}
