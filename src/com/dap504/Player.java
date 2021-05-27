package com.dap504;

import com.dap504.interfaces.GeneralPlayer;

/**
 * super / general class
 */
public  class Player implements GeneralPlayer {

    public  String firstName, lastName, country;

    private String playerType;

    public Player(String firstName, String lastName, String playerType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerType = playerType;
    }



    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }



    @Override
    public String getPlayerType() {
        return this.playerType;
    }


}

