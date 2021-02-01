package me.groot;

public class Enemy {

    private String name;
    private int health;
    private int damage;
    private int toughness;


    public Enemy(String name, int health, int damage, int toughness) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.toughness = toughness;

    }

    public void getStats() {

        System.out.println("\nName: " + name + "\nHealth: " + health + "\nDamage: " + damage + "\nToughness: " + toughness);

    }

    public String getName() {

        return name;

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
