package observer.exam1;

import java.util.ArrayList;
import java.util.List;

interface Subject {

    //  methods to register and unregister observers
    void register(Observer observer);

    void unregister(Observer observer);

    //  methods to notify observers of changes
    void notifyObservers();

    Object getUpdate(Observer observer);

}

class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException();
        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;

        if (!changed) return;
        observerLocal = new ArrayList<>(this.observers);
        this.changed = false;

        observerLocal.forEach(Observer::update);

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("message posted to topic : " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
