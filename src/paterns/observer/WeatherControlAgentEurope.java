package paterns.observer;

import java.sql.SQLOutput;

public class WeatherControlAgentEurope implements Observer {

    @Override
    public void update(boolean result) {
        System.out.println("Update Europe Observer happened because of updating critical parameter to " + result);
    }
}
