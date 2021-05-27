package com.dap504.subclasses;

import com.dap504.Player;

/**
 * sub class of player
 */

public class TableTennisPlayer extends Player {


    int serverPower;



   public  static final int numPlayers = 8;


    public TableTennisPlayer(String firstName, String lastName, int serverPower) {
        super(firstName,lastName, "Table tennis player");
        this.firstName = firstName;
        this.lastName = lastName;
        this.serverPower = serverPower;

    }




    public void  getServerPower() {
        System.out.println(serverPower);
    }



}
