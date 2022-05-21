package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Knight extends  Player{

    public Knight(String type, String characterName, int money) {
        super(type, characterName, money);
    }

    @Override
    public void assigningWeapons() {
        Objects objects = new Objects();
        SecureRandom secureRandom = new SecureRandom();
        ArrayList<Weapons> arrayList = new ArrayList<>();
        objects.swordArrayList(arrayList);
        setWeapons(arrayList.get(secureRandom.nextInt(arrayList.size() - 1)));
    }
}
