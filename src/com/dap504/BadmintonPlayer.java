package com.dap504;

public class BadmintonPlayer extends GeneralPlayer implements RaquetPlayer {

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
