package share;

public abstract class Subject
{
    Observer observer;
    public void addObserver()
    {
    }
    public void removeObserver()
    {
        observer=null;
    }
}
