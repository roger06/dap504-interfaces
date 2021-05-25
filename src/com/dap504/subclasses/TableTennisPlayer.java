package com.dap504.subclasses;

import com.dap504.Player;
import com.dap504.interfaces.TestInterface;

public class TableTennisPlayer extends Player {

    String firstName, lastName;
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

        System.out.println("First name : "+ this.firstName + " Last name: " +this.lastName);
    }

    @Override
    public void showShotPower(int shotPower) {

    }

    @Override
    public String displayPlayerCountry() {
        return null;
    }

    public void showName(TestInterface testInterface) {

//        System.out.println(testInterface.getClass().getMethods());

    }

}
