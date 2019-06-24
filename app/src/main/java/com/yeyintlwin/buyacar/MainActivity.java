package com.yeyintlwin.buyacar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements Switch.OnCheckedChangeListener {
    private Switch aSwitch, bSwitch, cSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        aSwitch.setOnCheckedChangeListener(this);
        bSwitch.setOnCheckedChangeListener(this);
        cSwitch.setOnCheckedChangeListener(this);
    }

    private void init() {
        aSwitch = findViewById(R.id.switch_good);
        bSwitch = findViewById(R.id.switch_cheap);
        cSwitch = findViewById(R.id.switch_fast);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.switch_good:
                if (isChecked && bSwitch.isChecked() && cSwitch.isChecked())
                    cSwitch.setChecked(false);
                break;
            case R.id.switch_cheap:
                if (isChecked && aSwitch.isChecked() && cSwitch.isChecked())
                    aSwitch.setChecked(false);
                break;
            case R.id.switch_fast:
                if (isChecked && bSwitch.isChecked() && aSwitch.isChecked())
                    bSwitch.setChecked(false);
                break;
        }
    }
}
