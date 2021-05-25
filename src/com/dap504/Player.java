package com.dap504;

import com.dap504.interfaces.TestInterface;

/**
 * super / general class
 */
public  class Player implements TestInterface.GeneralPlayer {

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

