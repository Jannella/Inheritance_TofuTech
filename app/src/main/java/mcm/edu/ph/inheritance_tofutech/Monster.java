package mcm.edu.ph.inheritance_tofutech;

public class Monster extends GameUnit {
    private int gbaseHPP;
    private double level;

    public Monster (){

    }
    public Monster(int baseHP,
                   double level, int gbaseHPP) {

        setBaseHP(baseHP);
        setBaseArmor(0);
        this.gbaseHPP = gbaseHPP;
        this.level = level;
    }
    //borrowed getters
    public int getGbaseHPP() { return gbaseHPP; }

    //borrowed setters
    public void setLevel(double level) { this.level = level; }
    public double getLevel() { return level; }

    //formula
    public double hpm(){return getGbaseHPP() * (level); }
}
