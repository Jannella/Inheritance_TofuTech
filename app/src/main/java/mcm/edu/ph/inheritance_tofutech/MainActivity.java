package mcm.edu.ph.inheritance_tofutech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import mcm.edu.ph.inheritance_tofutech.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button heroButton = findViewById(R.id.heroesBtn);
        Button monsterButton = findViewById(R.id.monstersBtn);

        heroButton.setOnClickListener(this);
        monsterButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.heroesBtn:
                Intent Hero = new Intent(this, MainActivityHero.class);
                startActivity(Hero);
                break;
            case R.id.monstersBtn:
                Intent Monster = new Intent (this, MainActivityMonster.class);
                startActivity(Monster);
                break;
        }
    }
}