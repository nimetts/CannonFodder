package com.company;

public class Monk extends Enemy{
    public Monk( int damage, int award, int health, int maxNumber) {
        super("Monk", damage,95, health, maxNumber);
    }

    @Override

    public int enemyCounter() {

  

        int number=2;
        for(int i = 0 ; i<game.getAdventureRank();i++){
            number*=2;
        }

        setMaxNumber(number);
        return number;



    }
}
