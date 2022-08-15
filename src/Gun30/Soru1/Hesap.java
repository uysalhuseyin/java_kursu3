package Gun30.Soru1;

public class Hesap {

    private int dep;
    private int  wd;
    private int amount;

    public  void moneydep(int transfermoney){
        this.amount+=transfermoney;
        this.dep+=transfermoney;

    }

    public  void wd(int moneywd){
        this.amount-=moneywd;
        this.wd+=moneywd;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "dep=" + dep +
                ", wd=" + wd +
                ", amount=" + amount +
                '}';
    }
}
