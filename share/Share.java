package share;


import share.Observer.Alarm;
import share.Observer.Observer;
import share.Observer.Ticker;

public class Share extends Subject
{
    private int value;
    public final String NAME;

    public void addObservers()
    {
        addObserver(new Alarm(this));
        addObserver(new Ticker(this));
    }
    public Share(int value, String NAME)
    {
        this.value = value;
        this.NAME = NAME;
    }
    public int getValue() {
        return value;
    }

    public void update(int value)
    {
        this.value = value;
        if(observers!=null)
        {
            for (Observer observer:observers)
            {
                observer.onUpdate();
            }
        }
    }
}
