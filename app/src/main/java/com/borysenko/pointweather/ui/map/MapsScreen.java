package com.borysenko.pointweather.ui.map;


/**
 * Created by Android Studio.
 * User: Iryna
 * Date: 29/01/19
 * Time: 13:59
 */
public interface MapsScreen {
    interface View {

        void findPlace(String query);
    }

    interface Presenter {

        void getEnteredData(String inputString);
    }
}
