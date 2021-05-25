package com.dap504.subclasses;

import com.dap504.Player;

public class BadmintonPlayer extends Player  {

    public BadmintonPlayer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showPlayerDetails() {

         System.out.println("Badminton player : "+ this.firstName + " " +this.lastName);


    }


    @Override
    public String displayPlayerCountry() {
        return null;
    }
}
