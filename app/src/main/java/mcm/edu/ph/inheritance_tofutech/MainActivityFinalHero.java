package mcm.edu.ph.inheritance_tofutech;

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

import java.lang.reflect.Array;

import mcm.edu.ph.inheritance_tofutech.R;

public class MainActivityFinalHero extends AppCompatActivity {
    private String classs, scss;
    private ImageView a, b, c, d, e, f, g, h;
    private Spinner spin;
    private TextView txtheroHP, txtheroMP, txtHeroSTR, txtHeroAGI, txtHeroINT, txtClass, txtheroArmor;
    double lvln;
    EditText lvl;
    private Button back;

    Hero Knight = new Hero(100, 100, 8, 2, 0, 100, 100, 8, 2, 0, 1);
    Hero Crusader = new Hero(100, 100, 7, 2, 6, 100, 100, 7, 2, 6, 1);
    Hero Wizard = new Hero(100, 100, 1, 8, 12, 100, 100, 1, 8, 12, 1);
    Hero Sage = new Hero(100, 100, 5, 5, 9, 100, 100, 5, 5, 9, 1);
    Hero Hunter = new Hero(100, 100, 4, 6, 4, 100, 100, 4, 6, 4, 1);
    Hero Bard = new Hero(100, 100, 2, 7, 5, 100, 100, 2, 7, 5, 1);
    Hero Blacksmith = new Hero(100, 100, 6, 2, 2, 100, 100, 6, 2, 2, 1);
    Hero Alchemist = new Hero(100, 100, 5, 6, 7, 100, 100, 5, 6, 7, 1);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main_finalhero);

        classs = getIntent().getStringExtra("classs");
        a = findViewById(R.id.imageKnight);
        b = findViewById(R.id.imageCrusader);
        c = findViewById(R.id.imageWizard);
        d = findViewById(R.id.imageSage);
        e = findViewById(R.id.imageHunter);
        f = findViewById(R.id.imageBard);
        g = findViewById(R.id.imageBlacksmith);
        h = findViewById(R.id.imageAlchemist);
        back = findViewById(R.id.heroClassesBtn);
        a.setImageResource(R.drawable.knight);
        b.setImageResource(R.drawable.crusader);
        c.setImageResource(R.drawable.wizard);
        d.setImageResource(R.drawable.sage);
        e.setImageResource(R.drawable.hunter);
        f.setImageResource(R.drawable.bard);
        g.setImageResource(R.drawable.blacksmith);
        h.setImageResource(R.drawable.alchemist);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        f.setVisibility(View.GONE);
        g.setVisibility(View.GONE);
        h.setVisibility(View.GONE);
        txtheroHP = findViewById(R.id.heroHPresult);
        txtheroMP = findViewById(R.id.heroMPresult);
        txtheroArmor = findViewById(R.id.heroARMORresult);
        txtHeroSTR = findViewById(R.id.heroSTRresult);
        txtHeroAGI = findViewById(R.id.heroAGIresult);
        txtHeroINT = findViewById(R.id.heroINTresult);
        txtClass = findViewById(R.id.Classtxt);
        lvl = findViewById(R.id.lvl);
        spin = findViewById(R.id.heroClass);


        if (classs.equals("Swordsman")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(this,
                    R.array.Swordsman, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scss = spin.getSelectedItem().toString();
                    if (scss.equals("Knight")) {
                        a.setVisibility(View.VISIBLE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Knight.setLevel(lvln);
                        Knight.getLevel();
                        txtheroHP.setText(String.valueOf((Knight.hpp())));
                        txtheroMP.setText(String.valueOf((Knight.mpp())));
                        txtheroArmor.setText(String.valueOf((Knight.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Knight.strr())));
                        txtHeroAGI.setText(String.valueOf(Knight.agii()));
                        txtHeroINT.setText(String.valueOf(Knight.intt()));
                    } else {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.VISIBLE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Crusader.setLevel(lvln);
                        Crusader.getLevel();
                        txtheroHP.setText(String.valueOf((Crusader.hpp())));
                        txtheroMP.setText(String.valueOf((Crusader.mpp())));
                        txtheroArmor.setText(String.valueOf((Crusader.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Crusader.strr())));
                        txtHeroAGI.setText(String.valueOf(Crusader.agii()));
                        txtHeroINT.setText(String.valueOf(Crusader.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        } else if (classs.equals("Mage")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Mage, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scss = spin.getSelectedItem().toString();
                    if (scss.equals("Wizard")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.VISIBLE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Wizard.setLevel(lvln);
                        Wizard.getLevel();
                        txtheroHP.setText(String.valueOf((Wizard.hpp())));
                        txtheroMP.setText(String.valueOf((Wizard.mpp())));
                        txtheroArmor.setText(String.valueOf((Wizard.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Wizard.strr())));
                        txtHeroAGI.setText(String.valueOf(Wizard.agii()));
                        txtHeroINT.setText(String.valueOf(Wizard.intt()));
                    } else {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.VISIBLE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Sage.setLevel(lvln);
                        Sage.getLevel();
                        txtheroHP.setText(String.valueOf((Sage.hpp())));
                        txtheroMP.setText(String.valueOf((Sage.mpp())));
                        txtheroArmor.setText(String.valueOf((Sage.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Sage.strr())));
                        txtHeroAGI.setText(String.valueOf(Sage.agii()));
                        txtHeroINT.setText(String.valueOf(Sage.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

        } else if (classs.equals("Archer")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Archer, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scss = spin.getSelectedItem().toString();
                    if (scss.equals("Hunter")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.VISIBLE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Hunter.setLevel(lvln);
                        Hunter.getLevel();
                        txtheroHP.setText(String.valueOf((Hunter.hpp())));
                        txtheroMP.setText(String.valueOf((Hunter.mpp())));
                        txtheroArmor.setText(String.valueOf((Hunter.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Hunter.strr())));
                        txtHeroAGI.setText(String.valueOf(Hunter.agii()));
                        txtHeroINT.setText(String.valueOf(Hunter.intt()));
                    } else {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.VISIBLE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Bard.setLevel(lvln);
                        Bard.getLevel();
                        txtheroHP.setText(String.valueOf((Bard.hpp())));
                        txtheroMP.setText(String.valueOf((Bard.mpp())));
                        txtheroArmor.setText(String.valueOf((Bard.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Bard.strr())));
                        txtHeroAGI.setText(String.valueOf(Bard.agii()));
                        txtHeroINT.setText(String.valueOf(Bard.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        } else if (classs.equals("Merchant")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Merchant, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scss = spin.getSelectedItem().toString();
                    if (scss.equals("Blacksmith")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.VISIBLE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Blacksmith.setLevel(lvln);
                        Blacksmith.getLevel();
                        txtheroHP.setText(String.valueOf((Blacksmith.hpp())));
                        txtheroMP.setText(String.valueOf((Blacksmith.mpp())));
                        txtheroArmor.setText(String.valueOf((Blacksmith.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Blacksmith.strr())));
                        txtHeroAGI.setText(String.valueOf(Blacksmith.agii()));
                        txtHeroINT.setText(String.valueOf(Blacksmith.intt()));
                    } else {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.VISIBLE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Alchemist.setLevel(lvln);
                        Alchemist.getLevel();
                        txtheroHP.setText(String.valueOf((Alchemist.hpp())));
                        txtheroMP.setText(String.valueOf((Alchemist.mpp())));
                        txtheroArmor.setText(String.valueOf((Alchemist.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Alchemist.strr())));
                        txtHeroAGI.setText(String.valueOf(Alchemist.agii()));
                        txtHeroINT.setText(String.valueOf(Alchemist.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
    }
}
