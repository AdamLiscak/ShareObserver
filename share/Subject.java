package share;

public abstract class Subject
{
    Observer observer;
    public void addObserver(Observer observer)
    {
        this.observer=observer;
    }
    public void removeObserver()
    {
        observer=null;
    }
}
