package com.company;

public class Main {


    public static void main(String[] args) {

        Boss satana = new Boss();
        satana.setHealth(1000);
        satana.setDamage(80);
        satana.setShield("Барьер");
        System.out.println("Сатана " + satana.getHealth() + "XP " + satana.getDamage()+ " DD " + satana.getShield()+" PP");

        createHeroes();



    }
    public static Hero[] createHeroes () {
        Hero spiderMan = new Hero("Спайдермен",300,25,"chuika");
        Hero batMan = new Hero("Бэтмен",200,20,"money");
        Hero superMan = new Hero("Супермен",800,100);
        Hero[] dc = {spiderMan,batMan,superMan};

        for (int i = 0; i < dc.length; i++) {
            System.out.println(dc[i].getName() + " - " + dc[i].getHealth() + "хп " + dc[i].getDamage() + "дд суперспособность: " + dc[i].getPower());

        }
        return dc;
    }
}
