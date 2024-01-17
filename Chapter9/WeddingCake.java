package Chapter9;

public class WeddingCake extends Cake{
    int Tiers;
    public WeddingCake(){
        super("Chocolate");
    }

    public int getTiers() {
        return Tiers;
    }

    public void setTiers(int tiers) {
        Tiers = tiers;
    }


}
