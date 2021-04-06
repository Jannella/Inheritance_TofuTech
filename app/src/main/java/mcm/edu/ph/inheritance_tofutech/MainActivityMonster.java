package mcm.edu.ph.inheritance_tofutech;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import mcm.edu.ph.inheritance_tofutech.R;

public class MainActivityMonster extends AppCompatActivity {
    Spinner klass;
    String scss;
    ImageView z, a;
    TextView txtMonsterHP;
    double lvln;
    EditText lvl;

    Monster Poring = new Monster(100,1,100);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main_monster);


        txtMonsterHP = findViewById(R.id.monsterHPresult);
        lvl = findViewById(R.id.monsterlvl);
        a = findViewById(R.id.imagePoring);
        a.setVisibility(View.GONE);
        a.setImageResource(R.drawable.poring);

        klass = findViewById(R.id.monsterClassResult);

        ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(this,
                R.array.Poring, android.R.layout.simple_dropdown_item_1line);
        klass.setAdapter(sub);

        klass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                scss = klass.getSelectedItem().toString();
                if (scss.equals("Poring")) {
                    a.setVisibility(View.VISIBLE);
                    lvln = Double.parseDouble(lvl.getText().toString());
                    Poring.setLevel(lvln);
                    Poring.getLevel();
                    txtMonsterHP.setText(String.valueOf((Poring.hpm())));
                }
                else {
                    a.setVisibility(View.GONE);
                    lvln = Double.parseDouble(lvl.getText().toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}