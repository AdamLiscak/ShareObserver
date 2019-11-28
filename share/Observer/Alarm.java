package share.Observer;

import share.Share;

public class Alarm implements Observer
{
    private final int START_VALUE;
    private final Share SUBJECT;
    public Alarm(Share share)
    {
        START_VALUE =share.getValue();
        this.SUBJECT =share;
    }
    @Override
    public void onUpdate()
    {
        if(START_VALUE *2<= SUBJECT.getValue())
        {
            System.out.println("ALARM der Wert der Aktie "+ SUBJECT.NAME+" hat sich verdoppelt. Neuer Wert: "+"+"+ SUBJECT.getValue()/100+" Euro.");
        }
    }
}
