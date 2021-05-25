package com.dap504.interfaces;

import com.dap504.subclasses.TableTennisPlayer;

public interface TestInterface {

     void showName(TableTennisPlayer tableTennisPlayer);

    interface GeneralPlayer {

        public static final int MAXGAMES = 12;
        int age = 0;


        public void showPlayerDetails();

        public void showShotPower(int shotPower);

        public String displayPlayerCountry();


    }
}
