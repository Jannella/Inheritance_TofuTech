package mcm.edu.ph.inheritance_tofutech;

public class GameUnit {
    private double baseArmor;
    private int baseHP, baseMP;
    private String unitName;
    public GameUnit(){} //default constructor
    public GameUnit(String unitName,int baseHP, int baseMP){
        this.unitName   = unitName;
        this.baseHP     = baseHP;
        this.baseMP     = baseMP;
        baseArmor = 0;
    }
    //Getters
    public double getBaseArmor() { return baseArmor; }

    //Setters
    public void setUnitName(String unitName) { this.unitName = this.unitName; }
    public void setBaseArmor(int baseArmor) { this.baseArmor = baseArmor; }
    public void setBaseHP(int baseHP) { this.baseHP = baseHP; }
    public void setBaseMP(int baseMP) { this.baseMP = baseMP; }
}

