package share;

public class ShareObserver implements Observer
{
    private final int START_VALUE;
    private Share share;
    ShareObserver(Share share)
    {
        START_VALUE =share.getValue();
        this.share=share;
    }
    @Override
    public void onUpdate()
    {
        ticker();
        alarm();
    }
    private void ticker()
    {
        System.out.println("Aktie "+share.NAME+" hat den Wert "+"+"+share.getValue()/100+" Euro.");
    }
    private void alarm()
    {
        if(START_VALUE *2<=share.getValue())
        {
            System.out.println("ALARM der Wert der Aktie "+share.NAME+" hat sich verdoppelt. Neuer Wert: "+"+"+share.getValue()/100+" Euro.");
        }
    }

}
