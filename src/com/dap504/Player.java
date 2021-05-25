package com.dap504;

import com.dap504.interfaces.GeneralPlayer;

/**
 * super / general class
 */
public  class Player implements GeneralPlayer {

    public  String firstName, lastName, country;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public void showPlayerDetails() {

    }

    @Override
    public void showShotPower(int shotPower) {

    }

    @Override
    public String displayPlayerCountry() {
        return null;
    }


}

