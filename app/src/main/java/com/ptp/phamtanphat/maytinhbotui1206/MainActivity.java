package com.ptp.phamtanphat.maytinhbotui1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1,edtNum2;
    TextView txtKetqua;
    Button btnCong,btnTru,btnNhan,btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edittextNumber1);
        edtNum2 = findViewById(R.id.edittextNumber2);
        txtKetqua = findViewById(R.id.textviewResult);
        btnChia = findViewById(R.id.buttonChia);
        btnCong = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);
        btnNhan = findViewById(R.id.buttonNhan);
    }
}
