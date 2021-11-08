package com.company;

public class Main {


    public static void main(String[] args) {
        Boss Satana = new Boss();
        Satana.setHealth(1000);
        Satana.setDamage(80);
        Satana.setShield("Барьер");
        System.out.println("Сатана " + Satana.getHealth() + "XP " + Satana.getDamage()+ " DD " + Satana.getShield()+" PP");

    }
}
