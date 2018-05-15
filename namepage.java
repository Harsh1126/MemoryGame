package com.example.sanjay.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class namepage extends AppCompatActivity {

    TextView tv_name, tv_np1, tv_np2;

    EditText et_p1, et_p2;

    Button b_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namepage);

        et_p1 = (EditText) findViewById(R.id.et_p1);
        et_p2 = (EditText) findViewById(R.id.et_p2);

        final Button b_play = (Button) findViewById(R.id.b_play);

        et_p2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                b_play.setEnabled(!s.equals(""));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        b_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(namepage.this, MainActivity.class);
                String p1_name = et_p1.getText().toString();
                String p2_name = et_p2.getText().toString();
                intent.putExtra("p1_name", p1_name);
                intent.putExtra("p2_name", p2_name);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return false;
    }
}