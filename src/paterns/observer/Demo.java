package paterns.observer;

public class Demo {
    public static void main(String[] args) {
        WeatherCenter weatherCenter = new WeatherCenter(new WeatherControlAgentAsia(), new WeatherControlAgentEurope());
        weatherCenter.setSituationCritical(true);
    }
}
