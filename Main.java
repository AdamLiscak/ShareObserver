import share.Share;
import shareUpdater.FivePercent;
import shareUpdater.Random;
import shareUpdater.ShareUpdater;

public class Main
{
    public static void main(String[] args) {
        Share share=new Share(30000,"Satanic Corporation of Microsoft");
        share.addObserver();
        ShareUpdater fivePercent= new FivePercent();
        ShareUpdater random= new Random();
        Share bigBrother= new Share(50000,"Vim");
        bigBrother.addObserver();
        Share tupac= new Share(40000,"Tupac");
        tupac.addObserver();
        Share church= new Share(70000,"Church of Saint IGNUcius");
        church.addObserver();
        random.update(share);
        fivePercent.update(share);
        random.update(bigBrother);
        fivePercent.update(bigBrother);
        fivePercent.update(bigBrother);
        fivePercent.update(tupac);
        random.update(church);
        fivePercent.update(share);
        fivePercent.update(church);
        fivePercent.update(church);
        fivePercent.update(church);
        random.update(tupac);
    }
}
