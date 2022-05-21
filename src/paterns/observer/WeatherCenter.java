package paterns.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherCenter implements Observable{
    List<Observer> observers = new LinkedList<>();
    boolean isSituationCritical;

    public WeatherCenter(paterns.observer.WeatherControlAgentAsia weatherControlAgentAsia, paterns.observer.WeatherControlAgentEurope weatherControlAgentEurope, Observer... observers) {
        for (Observer observer: observers) {
            this.observers.add(observer);
        }
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(boolean result) {
        for (Observer observer: observers) {
            observer.update(result);
        }
    }

    public void setSituationCritical(boolean isCritical) {
        this.isSituationCritical = isCritical;
        notifyObserver(isCritical);
    }
}
