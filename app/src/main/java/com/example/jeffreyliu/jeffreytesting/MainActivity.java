package com.example.jeffreyliu.jeffreytesting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonJeffrey = (Button) findViewById(R.id.button);
        buttonJeffrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button myButton = new Button(MainActivity.this);
                myButton.setText("And I am addicted to games");

                RelativeLayout layout = (RelativeLayout) findViewById(R.id.relative_layout);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                layout.addView(myButton, lp);
                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(myIntent);
            }
        });
        SpecialButton button1 = (SpecialButton)findViewById(R.id.specialbutton);
        button1.jeffreyMethod();
        SpecialButton.hello();
    }


}
