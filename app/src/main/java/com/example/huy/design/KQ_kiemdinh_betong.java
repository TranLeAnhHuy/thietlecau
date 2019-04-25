package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KQ_kiemdinh_betong extends AppCompatActivity {
    TextView txtHL93_inv,txtHL93_ope,txtkqRF_inv,txtkqRF_ope;
    TextView txtLegal3,txtkqRF_legal_3,txtLegal3s2,txtkqRF_legal_3s2,txtLegal33,txtkqRF_legal_33,txtLegal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kq_kiemdinh_betong);
        addConrols();
        addEvents();
    }
    public void addEvents() {
        //Láy kết quả
        Intent betong_KDintent = getIntent();
        Bundle  betong_KDbundle = betong_KDintent.getBundleExtra("betong_KDbundle");

        txtHL93_inv.setText(betong_KDbundle.getString("txtHL93_inv"));
        txtHL93_ope.setText(betong_KDbundle.getString("txtHL93_ope"));
        txtkqRF_inv.setText(betong_KDbundle.getString("txtkqRF_inv"));
        txtkqRF_ope.setText(betong_KDbundle.getString("txtkqRF_ope"));
        txtLegal3.setText(betong_KDbundle.getString("txtLegal3"));
        txtkqRF_legal_3.setText(betong_KDbundle.getString("txtkqRF_legal_3"));
        txtLegal3s2.setText(betong_KDbundle.getString("txtLegal3s2"));
        txtkqRF_legal_3s2.setText(betong_KDbundle.getString("txtkqRF_legal_3s2"));
        txtLegal33.setText(betong_KDbundle.getString("txtLegal33"));
        txtkqRF_legal_33.setText(betong_KDbundle.getString("txtkqRF_legal_33"));
        txtLegal.setText(betong_KDbundle.getString("txtLegal"));


        //txt1.setText(LHbundle.getString("txt1"));

    }
    public void addConrols(){
        txtHL93_inv=(TextView) findViewById(R.id.txtHL93_inv);
        txtHL93_ope=(TextView) findViewById(R.id.txtHL93_ope);
        txtkqRF_inv=(TextView) findViewById(R.id.txtkqRF_inv);
        txtkqRF_ope=(TextView) findViewById(R.id.txtkqRF_ope);
        txtLegal3=(TextView) findViewById(R.id.txtLegal3);
        txtkqRF_legal_3=(TextView) findViewById(R.id.txtkqRF_legal_3);
        txtLegal3s2=(TextView) findViewById(R.id.txtLegal3s2);
        txtkqRF_legal_3s2=(TextView) findViewById(R.id.txtkqRF_legal_3s2);
        txtLegal33=(TextView) findViewById(R.id.txtLegal33);
        txtkqRF_legal_33=(TextView) findViewById(R.id.txtkqRF_legal_33);
        txtLegal=(TextView) findViewById(R.id.txtLegal);
    }
    public void btnTroVe(View view) {
        Intent iTroVe = new Intent(KQ_kiemdinh_betong.this, KiemDinhTheoAASHTO_BTCT.class);
        startActivity(iTroVe);
    }
}
