package share.Observer;

import share.Share;

public class Ticker implements Observer
{
    private final Share SUBJECT;
    public Ticker(Share share)
    {
        this.SUBJECT =share;
    }
    @Override
    public void onUpdate()
    {
        System.out.println("Aktie "+ SUBJECT.NAME+" hat den Wert "+"+"+ SUBJECT.getValue()/100+" Euro.");
    }
}
