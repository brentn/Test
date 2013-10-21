package com.brentandjody.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton numbar = (ImageButton) findViewById(R.id.number_bar);
        ImageButton key_S = (ImageButton) findViewById(R.id.S);
        ImageButton key_T = (ImageButton) findViewById(R.id.T);
        ImageButton key_K = (ImageButton) findViewById(R.id.K);
        ImageButton key_P = (ImageButton) findViewById(R.id.P);
        ImageButton key_W = (ImageButton) findViewById(R.id.W);
        ImageButton key_H = (ImageButton) findViewById(R.id.H);
        ImageButton key_R = (ImageButton) findViewById(R.id.R);
        ImageButton key_A = (ImageButton) findViewById(R.id.A);
        ImageButton key_O = (ImageButton) findViewById(R.id.O);
        ImageButton key_star = (ImageButton) findViewById(R.id.star);
        ImageButton key__E = (ImageButton) findViewById(R.id._E);
        ImageButton key__U = (ImageButton) findViewById(R.id._U);
        ImageButton key__F = (ImageButton) findViewById(R.id._F);
        ImageButton key__R = (ImageButton) findViewById(R.id._R);
        ImageButton key__P = (ImageButton) findViewById(R.id._P);
        ImageButton key__B = (ImageButton) findViewById(R.id._B);
        ImageButton key__L = (ImageButton) findViewById(R.id._L);
        ImageButton key__G = (ImageButton) findViewById(R.id._G);
        ImageButton key__T = (ImageButton) findViewById(R.id._T);
        ImageButton key__S = (ImageButton) findViewById(R.id._S);
        ImageButton key__D = (ImageButton) findViewById(R.id._D);
        ImageButton key__Z = (ImageButton) findViewById(R.id._Z);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
