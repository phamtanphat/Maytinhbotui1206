package com.ptp.phamtanphat.maytinhbotui1206;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1, edtNum2;
    TextView txtKetqua;
    Button btnCong, btnTru, btnNhan, btnChia;

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
        //su kien click cua button
        // to hop phim sua loi Alt + enter
        // to hop phim xem tham so truyen vao

        //Lay du lieu trong edittext

        //Cap nhat code : Ctrl + K

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int a = 10;
//                int b = 8;
//
//                int c = a + b;
//                Log.d("BBB",c + "");
                //Kiem tra gia tri ben trong phan mem
//                Log.d("BBB",String.valueOf(a));
//                Hien thi thong bao cho nguoi dung biet
//                Toast.makeText(MainActivity.this, "Chao", Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this,"Chao android",Toast.LENGTH_LONG).show();

                String num1 = edtNum1.getText().toString();
                String num2 = edtNum2.getText().toString();

                if ( !num1.equals("") || !num2.equals("")){
                    int ketqua = Integer.parseInt(num1) + Integer.parseInt(num2);
                    txtKetqua.setText(String.valueOf(ketqua));
                }
            }
        });
    }
}
