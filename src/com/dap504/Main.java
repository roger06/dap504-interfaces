package com.dap504;

/**
 *
 * demo code for interfaces
 */
public class Main {


    public static void main(String[] args) {

        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("Bob", "Jones",10);
        tableTennisPlayer.showPlayerDetails();

        BadmintonPlayer badmintonPlayer = new BadmintonPlayer();
        badmintonPlayer.firstName = "Clare";
        badmintonPlayer.showPlayerDetails();

    }
}
