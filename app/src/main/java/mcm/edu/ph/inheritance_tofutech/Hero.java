package mcm.edu.ph.inheritance_tofutech;

public class Hero extends GameUnit {
    private int gbaseHP,gbaseMP;
    private double gheroSTR, gheroAGI,gheroINT, heroSTR, heroAGI, heroINT, level;
    public Hero(){
    }
    public Hero(int baseHP, int baseMP,
                double heroSTR, double heroAGI,
                double heroINT,int gbaseHP, int gbaseMP, double gheroSTR,double gheroAGI
            ,double gheroINT,double level) {

        setBaseHP(baseHP);
        setBaseMP(baseMP);
        setBaseArmor(1);
        this.gbaseHP = gbaseHP;
        this.gbaseMP = gbaseMP;
        this.gheroSTR = gheroSTR;
        this.gheroAGI = gheroAGI;
        this.gheroINT = gheroINT;
        this.heroSTR = heroSTR;
        this.heroAGI = heroAGI;
        this.heroINT = heroINT;
        this.level   = level;

    }
    //borrowed getters
    public int getGbaseHP() { return gbaseHP; }
    public int getGbaseMP() { return gbaseMP; }

    //formula
    public double strr(){return heroSTR * (level); }
    public double agii(){return heroAGI * (level); }
    public double intt(){return heroINT * (level); }
    public double hpp(){return getGbaseHP() * (level); }
    public double mpp(){return getGbaseMP() * (level); }
    public double getLevel() { return level; }


    public void setLevel(double level) { this.level = level; }
}