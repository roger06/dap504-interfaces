package com.dap504;

import com.dap504.interfaces.GeneralPlayer;
import com.dap504.subclasses.BadmintonPlayer;
import com.dap504.subclasses.SquashPlayer;
import com.dap504.subclasses.TableTennisPlayer;

/**
 *
 * demo code for interfaces
 */
public class Main {


    public static void main(String[] args) {





        showPlayerDetails(new BadmintonPlayer("Trev", "Jones"));
        showPlayerDetails(new TableTennisPlayer("Bob", "Jones",10));
        showPlayerDetails(new SquashPlayer("Jason", "Khan"));

        // use what is effectively a constant from the interface
        System.out.println("Max games = " + GeneralPlayer.MAXGAMES);

    } // end main()

    /**
     *
     * @param thePlayer
     *
     * method passed the Interface.
     *  this can be used with anything that implements the interface
     */

    public static void showPlayerDetails(GeneralPlayer thePlayer){

        String details = thePlayer.getClass().getSimpleName() +
                " is a " + thePlayer.getPlayerType() + " whose name is " +
                thePlayer.getFirstName() + " " + thePlayer.getLastName();

     //   System.out.println(thePlayer.getPlayerType());

        System.out.println(details);
    }


} //end class
