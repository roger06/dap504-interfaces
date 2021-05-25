package com.dap504;

import com.dap504.interfaces.GeneralPlayer;
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

        badmintonPlayer.showPlayerDetails();




    } // end main()




} //end class
