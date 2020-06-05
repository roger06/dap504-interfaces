package com.dap504;

public class TableTennisPlayer implements RaquetPlayer {

    String firstName, lastName;
    int serverPower;



   public  static final int numPlayers = 8;


    public TableTennisPlayer(String firstName, String lastName, int serverPower) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.serverPower = serverPower;

    }

    public TableTennisPlayer() {
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

}
