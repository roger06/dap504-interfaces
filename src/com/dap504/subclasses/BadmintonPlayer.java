package com.dap504.subclasses;

import com.dap504.Player;

public class BadmintonPlayer extends Player  {

    public BadmintonPlayer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showPlayerDetails() {

        System.out.println("For a Badminton player - first name = " + this.firstName);

    }

    @Override
    public void showShotPower(int shotPower) {

    }

    @Override
    public String displayPlayerCountry() {
        return null;
    }
}
