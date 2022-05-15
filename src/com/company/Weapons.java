package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Weapons  extends Inventory{


    private int damage;
    private int level;
    private int quality;
    private double weight;

    public Weapons(String name, String itemType, int rarity, int priceOfItem, int damage, int level,int quality,double weight) {
        super(name, itemType, rarity, priceOfItem);
        this.damage = damage;
        this.level = level;
        this.quality = quality ;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }




    Wand wand = new Wand("Exiled Heart","Wand",4,50000,50,1,getQuality(),0.5);
    Wand wand1 = new Wand(" Touch of Woe","Wand",3,40000,40,1,getQuality(),0.9);
    Wand wand2 = new Wand(" Bag of the Night","Wand",5,60000,60,1,getQuality(),0.4);

    Catalyst catalyst = new Catalyst(" Pact of the Night","Catalyst",5,68200,60,1,getQuality(),0.7);
    Catalyst catalyst1 = new Catalyst("Nightfall","Catalyst",4,45000,45,1,getQuality(),0.9);
    Catalyst catalyst2 = new Catalyst("Starlight","Catalyst",3,33000,30,1,getQuality(),1);

    Sword sword = new Sword("summit sharper", "Sword",4,70000,70,1,getQuality(),1.5);
    Sword sword1 = new Sword("mistspiltter reforged","Sword",5,68000,55,1,getQuality(),1.6);
    Sword sword2 = new Sword("skyword blade","Sword",3,65000,40,1,getQuality(),1.9);

    Polearms polearms = new Polearms(" Incarnation of Immortality","Polearms",3,55000,35,1,getQuality(),1.2);
    Polearms polearms1 = new Polearms(" Breaker of Horrid Dreams","Polearms",4,60000,40,1,getQuality(),1.1);
    Polearms polearms2 = new Polearms("Misery's End","Polearms",5,65000,50,1,getQuality(),0.75);

    Scythe scythe = new Scythe("Anguish","Scythe",4,80500,55,1,getQuality(),2.2);
    Scythe scythe1 = new Scythe("Stormfury Blade","Scythe",5,80000,60,1,getQuality(),2.1);
    Scythe scythe2 = new Scythe("Death's Claw","Scythe",3,75000,45,1,getQuality(),2.4);

    Claymore claymore = new Claymore("Amnesia","Claymore",4,48000,65,1,getQuality(),3.5);
    Claymore claymore1 = new Claymore("Hope's End","Claymore",5,50000,80,1,getQuality(),3.3);
    Claymore claymore2 = new Claymore(" Emissary of the Whispers","Claymore",3,54000,70,1,getQuality(),3.4);

    ArrayList<Weapons> getWandArrayList = new ArrayList<>();
    ArrayList<Weapons> getSwordArrayList = new ArrayList<>();
    ArrayList<Weapons> getClaymoreArrayList = new ArrayList<>();
    ArrayList<Weapons> getPolearmsArrayList = new ArrayList<>();
    ArrayList<Weapons> getScytheArrayList = new ArrayList<>();

    public ArrayList<Weapons> getWandArrayList() {
        getWandArrayList.add(wand);
        getWandArrayList.add(wand1);
        getWandArrayList.add(wand2);
        getWandArrayList.add(catalyst);
        getWandArrayList.add(catalyst1);
        getWandArrayList.add(catalyst2);

        return getWandArrayList;
    }

    public ArrayList<Weapons> getClaymoreArrayList(){
        getClaymoreArrayList.add(claymore);
        getClaymoreArrayList.add(claymore1);
        getClaymoreArrayList.add(claymore2);
        return getClaymoreArrayList;

    }
    public ArrayList<Weapons> getSwordArrayList(){
        getSwordArrayList.add(sword);
        getSwordArrayList.add(sword1);
        getSwordArrayList.add(sword2);
        return getSwordArrayList;
    }

    public ArrayList<Weapons> getPolearmsArrayList(){
        getPolearmsArrayList.add(polearms);
        getPolearmsArrayList.add(polearms1);
        getPolearmsArrayList.add(polearms2);
        return getPolearmsArrayList;
    }

    public ArrayList<Weapons>  getScytheArrayList(){
        getScytheArrayList.add(scythe);
        getScytheArrayList.add(scythe1);
        getScytheArrayList.add(scythe2);
        return getScytheArrayList;

    }

    public static void assigningWeapons(Player player,ArrayList<Weapons> arrayList){
        SecureRandom secureRandom = new SecureRandom();

            for(int i = 0 ; i<arrayList.size();i++){
                player.setWeapons(arrayList.get(secureRandom.nextInt(arrayList.size()-1)));
            }


        }

    }




