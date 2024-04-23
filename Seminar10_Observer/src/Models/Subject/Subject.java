package Models.Subject;

import Models.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void adaugaAbonat(Observer observer) {
        observers.add(observer);
    }

    public void stergeAbonat(Observer observer) {
        observers.remove(observer);
    }

    public void notificaAbonati(String mesaj) {
        for (Observer observer : observers) {
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();

    public abstract void notificaMeciHandbal();

    public abstract void notificaMeciVolei();
}
