package shareUpdater;

import share.Share;

public class FivePercent implements ShareUpdater
{
    public void update(Share input)
    {
        input.update((int)(input.getValue()*1.05));
    }
}
