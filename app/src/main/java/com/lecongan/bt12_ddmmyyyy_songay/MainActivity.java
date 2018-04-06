package com.lecongan.bt12_ddmmyyyy_songay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button btnThucHien;
    private EditText edtNgayDen, edtNgayDi;
    private TextView tv_kq;
    private Date den,di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNgayDen = (EditText) findViewById(R.id.edt_den);
        edtNgayDi = (EditText) findViewById(R.id.edt_di);
        tv_kq = (TextView) findViewById(R.id.tv_kq);
        btnThucHien = (Button) findViewById(R.id.btn_thuc_hien);
        btnThucHien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat sdf=new SimpleDateFormat();
                sdf.applyPattern("dd/MM/yyyy");
//                sdf.setLenient(true);

                try {
//                    String a = "29/08/1992";
//                    String b = "03/04/2018";
//                    Date den =sdf.parse(a);
//
//                    Date di =sdf.parse(b);
                    den = sdf.parse(edtNgayDen.getText().toString());

                    di =sdf.parse(edtNgayDi.getText().toString());


                } catch (ParseException e) {
                    e.printStackTrace();
                }
                tv_kq.setText("ngay den: "+den.getDate()+" thang "+(den.getMonth()+1)+" nam "+den.getYear()+"\n"
                        +"ngay di: "+di.getDate()+" thang "+(di.getMonth()+1)+" nam "+di.getYear());

            }
        });



    }
}
