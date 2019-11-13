package com.akisai.mynavdrawer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class Tools extends AppCompatActivity {
    Switch switch1;
    LinearLayout switchLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        switchLayout=(LinearLayout)findViewById(R.id.switchLayout);
        switch1=(Switch)findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked()) {
                    switchLayout.setBackgroundColor(Color.TRANSPARENT);
                    Toast.makeText(getApplicationContext(), "SwitchState :" + switch1.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
                   switchLayout.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "SwitchedState" + switch1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
