package com.ftninformatika.termin15vezbacas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    TextView tvBroj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String nazivBroja = getIntent().getExtras().getString("broj");

        tvBroj = findViewById(R.id.tvBroj);
        tvBroj.setText(nazivBroja);

    }
}
