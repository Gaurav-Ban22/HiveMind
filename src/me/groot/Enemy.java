package me.groot;

public class Enemy {

    private String name;
    private int etaken;
    private int health;
    private int damage;
    private int toughness;


    public Enemy(String name, int etaken, int health, int damage, int toughness) {

        this.name = name;
        this.etaken = etaken;
        this.health = health;
        this.damage = damage;
        this.toughness = toughness;

    }

    public void getStats() {

        System.out.println("\nName: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nToughness: " + toughness + "\nEuphoris Taken if wins: " + etaken);

    }

    public String getName() {

        return name;

    }

    public int getEtaken() {

        return etaken;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getToughness() {
        return toughness;
    }




}
