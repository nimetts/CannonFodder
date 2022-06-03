package com.company;

import java.util.ArrayList;

public abstract class Location {

   protected ArrayList<Player> players;
   protected String areaName;

   public Location(ArrayList<Player> players) {
      this.players = players;

   }

   public abstract boolean getLocation();


   public ArrayList<Player> getPlayers() {
      return players;
   }

   public void setPlayers(ArrayList<Player> players) {
      this.players = players;
   }

   public String getAreaName() {
      return areaName;
   }

   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }
}


