package com.example.enotita_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           final EditText edtxt_write = findViewById(R.id.edtxt_write);
           final EditText edtxt_showCap = findViewById(R.id.edtxt_showCap);
           Button btn_show = findViewById(R.id.btn_cap);

           btn_show.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String written = edtxt_write.getText().toString();
                   edtxt_showCap.setText(written.toUpperCase());
               }
           });

    }
}
