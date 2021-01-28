package me.groot;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static void main(String[] args) {

        String hName;
        int level = 1;
        int euphoris;
        int comb;

        ArrayList<Enemy> enems = new ArrayList<>();

        enems.add(new Enemy("Glob", 12, 12, 12, 0));
        enems.add(new Enemy("Oxilis", 20, 15, 13, 3));
        enems.add(new Enemy("Metallic Golem", 30, 40, 3, 10));
        enems.add(new Enemy("Fire Elemental", 15, 15, 15, 1));

        Scanner scan = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Welcome to the HiveMind, an advanced civilization in a fantasy world. What will you call it? " + ANSI_RESET);

        hName = scan.nextLine();

        System.out.println(ANSI_GREEN + "Your HiveMind is now called " + hName + "!" + ANSI_RESET);

        Scanner scani = new Scanner(System.in);

        System.out.println(ANSI_PURPLE + "In order to make " + hName + " thrive, you need to forge comb. Comb is an important structure needed in all Hive Minds. They are nodes of energy and power. However, you need to harvest Euphoris to create comb.\nWhat would you like to do? HARVEST, BUILD, VIEWLEVEL, or VIEWRESOURCES?" + ANSI_RESET);





    }
}
