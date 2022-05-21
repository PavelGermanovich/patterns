package paterns.observer;

public class WeatherControlAgentAsia implements Observer{
    @Override
    public void update(boolean result) {
        System.out.println("Update Asia Observer happened because of updating critical parameter to " + result);
    }
}
