package com.dap504.interfaces;

/**
 * Interface to force set up of a player
 */
public interface GeneralPlayer {

    int MAXGAMES = 12;   // static and final by default

    String getFirstName();
    String getLastName();
    String getPlayerType();

}
