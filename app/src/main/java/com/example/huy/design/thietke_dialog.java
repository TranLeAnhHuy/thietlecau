package com.example.huy.design;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thietke_dialog extends AppCompatActivity {
    //Button btn_CauDamThepLienHop , btn_CauDamKhongLienHop;
    Button btn_DamThep, btn_CauBeTongCotThep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thietke_dialog);
        btn_DamThep = (Button) findViewById(R.id.btn_DamThep);
        btn_CauBeTongCotThep = (Button) findViewById(R.id.btn_BeTongCotThep);
        thietKe();
    }

    public void thietKe() {
        btn_DamThep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog thietke_cauthep_dialog = new Dialog(thietke_dialog.this); // khai báo nó hiển thị ở màn hình chính đang đứng
                thietke_cauthep_dialog.setCancelable(false);// nếu bấm ra khỏi dialog thì ko thực thi
                thietke_cauthep_dialog.setContentView(R.layout.activity_thietke_cauthep_dialog); // et đến layout của dialog đã thiết kế
                // Khai báo thuộc tính của đối tượng trong dialog
                Button btn_CauDamThepLienHop = (Button) thietke_cauthep_dialog.findViewById(R.id.button_CauDamThep_CoLienHop);
                Button btn_CauDamKhongLienHop = (Button) thietke_cauthep_dialog.findViewById(R.id.button_CauDamThep_KhongLienHop);
                // cái này chọn button liên hợp nếu chọn không liên hợp thì sao a???

                btn_CauDamThepLienHop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent inhaplieu = new Intent(thietke_dialog.this, nhaplieuthietke.class);
                        inhaplieu.putExtra("baitoan", "co");
                        startActivity(inhaplieu);
                    }
                });

                btn_CauDamKhongLienHop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent inhaplieu = new Intent(thietke_dialog.this, nhaplieuthietke.class);
                        inhaplieu.putExtra("baitoan", "khong");
                        startActivity(inhaplieu);

                    }
                });
                Button btn_Huy_Dialog = (Button) thietke_cauthep_dialog.findViewById(R.id.button_Huy_Dialog);
                // e thu debug thu xem code chay toi day ko
                thietke_cauthep_dialog.show();
                btn_Huy_Dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        thietke_cauthep_dialog.cancel();
                    }
                });


            }

        });


    }

}
