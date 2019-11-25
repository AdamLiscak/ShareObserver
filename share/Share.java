package share;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Share extends Subject
{
    private int value;
    final String NAME;

    @Override
    public void addObserver()
    {
        observer=new ShareObserver(this);
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
        if(observer!=null) observer.onUpdate();
    }
}
