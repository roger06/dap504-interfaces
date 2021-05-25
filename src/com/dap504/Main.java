package com.dap504;

import com.dap504.interfaces.TestInterface;
import com.dap504.subclasses.BadmintonPlayer;
import com.dap504.subclasses.TableTennisPlayer;

/**
 *
 * demo code for interfaces
 */
public class Main {


    public static void main(String[] args) {

        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("Bob", "Jones",10);
        tableTennisPlayer.showPlayerDetails();

        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("Trev", "Jones");
        badmintonPlayer.firstName = "Clare";
        badmintonPlayer.showPlayerDetails();

        tableTennisPlayer.showName(new TestInterface() {

            @Override
            public void showName(TableTennisPlayer ttp) {
                System.out.println("name = " + ttp.firstName);
            }
        });

    }
}
