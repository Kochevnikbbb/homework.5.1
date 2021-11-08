package com.company;

public class Hero {
    private int health;
    private int damage;
    private String power;
    private String name;

    public Hero(String name, int health, int damage, String power) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.power = power;

    }

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}
