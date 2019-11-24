package shareUpdater;

import share.Share;

public class Random implements ShareUpdater
{
    public void update(Share input)
    {
        java.util.Random rand = new java.util.Random();
        float percent = rand.nextFloat() * 2;
        input.update((int)(input.getValue()*percent));
    }
}
