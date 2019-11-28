package share;

import share.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{
    List<Observer> observers;
    public Subject()
    {
        observers=new ArrayList<>();
    }
    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }
}
