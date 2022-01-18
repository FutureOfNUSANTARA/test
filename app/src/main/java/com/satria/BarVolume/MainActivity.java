package com.satria.BarVolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText lebar, tinggi , panjang;
    private Button   total;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lebar   = findViewById(R.id.edt_width);
        panjang = findViewById(R.id.edt_length);
        tinggi  = findViewById(R.id.edt_heght);
        total   = findViewById(R.id.btn_calculats);
        hasil   = findViewById(R.id.tv_result);

        total.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculats) {
            String inpuPanjang = panjang.getText().toString().trim();
            String inpuLebar   = lebar.getText().toString().trim();
            String inputtinggi = tinggi.getText().toString().trim();

            boolean isEmpetyField = false;

            if (TextUtils.isEmpty(inpuPanjang)) {
                isEmpetyField = true;
                panjang.setError("File ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inpuLebar)) {
                isEmpetyField = true;
                lebar.setError("File ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inputtinggi)) {
                isEmpetyField = true;
                tinggi.setError("File ini tidak boleh kosong");
            }

            double volume = Double.valueOf(inpuPanjang) * Double.valueOf(inpuLebar) * Double.valueOf(inputtinggi);
            hasil.setText(String.valueOf(volume));
        }
    }
}

