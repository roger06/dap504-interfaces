package com.dap504;

public class Skills {

    int serverPower;
    int backHandPower;
    int foreHandPower;
    int servePower;

    int serveSkill;
    int backHandSkill;

    public Skills(int serverPower, int backHandPower, int foreHandPower, int servePower, int serveSkill, int backHandSkill) {
        this.serverPower = serverPower;
        this.backHandPower = backHandPower;
        this.foreHandPower = foreHandPower;
        this.servePower = servePower;
        this.serveSkill = serveSkill;
        this.backHandSkill = backHandSkill;
    }

    public double getOverAllRating() {

        // arbitrary calc here just for demo;
        double rating = (servePower * serveSkill * backHandPower * backHandSkill) / 100;
        return rating;
    }

    public double getServeRating() {

        // arbitrary calc here just for demo;
        double serveRating = (servePower * serveSkill) / 100;
        return serveRating;
    }








}
