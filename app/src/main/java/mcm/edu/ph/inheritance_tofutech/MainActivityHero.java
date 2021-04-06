package mcm.edu.ph.inheritance_tofutech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import mcm.edu.ph.inheritance_tofutech.R;

public class MainActivityHero extends AppCompatActivity {
    Spinner classs;
    String scss;
    EditText lvl;
    Button secondclassbtn;
    double lvln;
    ImageView a,b,c,d;
    TextView txtheroHP,txtheroMP,txtHeroSTR,txtHeroAGI,txtHeroINT,txtClass,txtheroArmor;

    Hero Swordsman = new Hero(100,100,7,2,0,100,100,7,2,0,1);
    Hero Mage   = new Hero(100,100,0,4,8,100,100,0,4,8,1);
    Hero Archer = new Hero(100,100,3,3,1,100,100,3,3,1,1);
    Hero Merchant = new Hero(100,100,5,1,1,100,80,5,1,1,1);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main_hero);


        secondclassbtn = findViewById(R.id.heroClassesBtn);
        txtheroHP = findViewById(R.id.heroHPresult);
        txtheroMP = findViewById(R.id.heroMPresult);
        txtheroArmor = findViewById(R.id.heroARMORresult);
        txtHeroSTR = findViewById(R.id.heroSTRresult);
        txtHeroAGI = findViewById(R.id.heroAGIresult);
        txtHeroINT = findViewById(R.id.heroINTresult);
        txtClass = findViewById(R.id.Classtxt);
        lvl = findViewById(R.id.lvl);
        a = findViewById(R.id.imageSwordsman);
        b = findViewById(R.id.imageMage);
        c = findViewById(R.id.imageArcher);
        d = findViewById(R.id.imageMerchant);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        secondclassbtn.setVisibility(View.GONE);
        a.setImageResource(R.drawable.swordsman);
        b.setImageResource(R.drawable.mage);
        c.setImageResource(R.drawable.archer);
        d.setImageResource(R.drawable.merchant);

        classs =findViewById(R.id.heroClass);

        ArrayAdapter<CharSequence> cLass = ArrayAdapter.createFromResource(
                this, R.array.Class, android.R.layout.simple_dropdown_item_1line);
        classs.setAdapter(cLass);

        classs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                scss = classs.getSelectedItem().toString();
                secondclassbtn.setVisibility(View.VISIBLE);
                if (scss.equals("Swordsman")){
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Swordsman.setLevel(lvln);
                    Swordsman.getLevel();
                    txtheroHP.setText(String.valueOf((Swordsman.hpp())));
                    txtheroMP.setText(String.valueOf((Swordsman.mpp())));
                    txtheroArmor.setText(String.valueOf((Swordsman.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Swordsman.strr())));
                    txtHeroAGI.setText(String.valueOf(Swordsman.agii()));
                    txtHeroINT.setText(String.valueOf(Swordsman.intt()));

                }
                else if(scss.equals("Mage")) {
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Mage.setLevel(lvln);
                    Mage.getLevel();
                    txtheroHP.setText(String.valueOf((Mage.hpp())));
                    txtheroMP.setText(String.valueOf((Mage.mpp())));
                    txtheroArmor.setText(String.valueOf((Mage.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Mage.strr())));
                    txtHeroAGI.setText(String.valueOf(Mage.agii()));
                    txtHeroINT.setText(String.valueOf(Mage.intt()));

                }
                else if(scss.equals("Archer")) {
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Archer.setLevel(lvln);
                    Archer.getLevel();
                    txtheroHP.setText(String.valueOf((Archer.hpp())));
                    txtheroMP.setText(String.valueOf((Archer.mpp())));
                    txtheroArmor.setText(String.valueOf((Archer.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Archer.strr())));
                    txtHeroAGI.setText(String.valueOf(Archer.agii()));
                    txtHeroINT.setText(String.valueOf(Archer.intt()));

                }
                else if(scss.equals("Merchant")) {
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.VISIBLE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Merchant.setLevel(lvln);
                    Merchant.getLevel();
                    txtheroHP.setText(String.valueOf((Merchant.hpp())));
                    txtheroMP.setText(String.valueOf((Merchant.mpp())));
                    txtheroArmor.setText(String.valueOf(Merchant.getBaseArmor()));
                    txtHeroSTR.setText(String.valueOf((Merchant.strr())));
                    txtHeroAGI.setText(String.valueOf(Merchant.agii()));
                    txtHeroINT.setText(String.valueOf(Merchant.intt()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        secondclassbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back =new Intent(MainActivityHero.this,MainActivityFinalHero.class);
                        back.putExtra("classs", scss);
                        startActivity(back);
                    }
                });
    }
}
