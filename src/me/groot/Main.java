package me.groot;
import java.util.Scanner;
import java.util.Random;

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
        int euphoris = 0;
        int comb = 0;
        int health = 30;
        int dmg = 3;


        ArrayList<Enemy> enems = new ArrayList<>();

        enems.add(new Enemy("Glob", 12, 12, 12, 0));
        enems.add(new Enemy("Oxilis", 20, 15, 13, 3));
        enems.add(new Enemy("Metallic Golem", 30, 40, 3, 10));
        enems.add(new Enemy("Fire Elemental", 15, 15, 15, 1));

        Scanner scan = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Welcome to the HiveMind, an advanced civilization in a fantasy world. What will you call it? " + ANSI_RESET);

        hName = scan.nextLine();

        System.out.println(ANSI_GREEN + "Your HiveMind is now called " + hName + "!" + ANSI_RESET);



        while (level != 10) {

            System.out.println(ANSI_PURPLE + "In order to make your civilization thrive, you need to forge comb. Comb is an important structure needed in all Hive Minds. They are nodes of energy and power. However, you need to harvest Euphoris to create comb.\nWhat would you like to do? HARVEST, BUILD, VIEWLEVEL, or VIEWRESOURCES?" + ANSI_RESET);
            Scanner scani = new Scanner(System.in);

            if (scani.hasNext("HARVEST")) {

                System.out.println(ANSI_BLUE + "You go outside of your advanced Hive Mind civilization. \nYou go deep into the mines of Delaxaris, where unlimited sources of euphoris can be found. \nYou need to cast a spell to get some, however. \nThere's also have to fend off enemies trying to prevent you from getting Euphoris." + ANSI_RESET);
                Random rand = new Random();
                Enemy enem = enems.get(rand.nextInt(enems.size()));

                System.out.println(ANSI_RED + "An enemy stands in your way!" + ANSI_RESET);
                enem.getStats();


            } else if (scani.hasNext("BUILD")) {

                if (euphoris > 10 * level || euphoris == 10 * level ) {

                    euphoris -= 10 * level;
                    comb += 1;

                    System.out.println(ANSI_YELLOW + "Built one comb with " + 10 * level + " euphoris.");

                } else {
                    System.out.println(ANSI_RED + "Can't create comb, you need more euphoris.");
                }

            } else if (scani.hasNext("VIEWLEVEL")) {

                System.out.println(ANSI_BLUE + hName + "'s level is " + level + "." + ANSI_RESET);

            } else if (scani.hasNext("VIEWRESOURCES")) {

                System.out.println(ANSI_YELLOW + "Comb: " + comb + "\nEuphoris: " + euphoris + ANSI_RESET);

            } else if (scani.hasNext("easteregg")) {
                euphoris = 100;
            }

        }



    }
}
