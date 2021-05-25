package com.dap504.subclasses;

import com.dap504.Player;

public class TableTennisPlayer extends Player {


    int serverPower;



   public  static final int numPlayers = 8;


    public TableTennisPlayer(String firstName, String lastName, int serverPower) {
        super(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.serverPower = serverPower;

    }


    public static  void showNumPlayers(){

        System.out.println(numPlayers);

    }


    public void  getServerPower() {
        System.out.println(serverPower); ;
    }

    @Override
    public void showPlayerDetails() {

        System.out.println("Table tennis player : "+ this.firstName + " " +this.lastName);
    }

    @Override
    public void showShotPower(int shotPower) {

    }

    @Override
    public String displayPlayerCountry() {
        return null;
    }

}
