package com.example.huy.design;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_ThietKe, btn_KiemDinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl(); //ánh x


    }

    private void addControl() {
        //phần ánh xạ cái đối tượng có sự kiện
        btn_ThietKe = (Button) findViewById(R.id.button_ThietKe);
        btn_KiemDinh = (Button) findViewById(R.id.button_KiemDinh);
    }

    public void xuLiManHinhNhapLieuThietKe(View view) {
       /* Intent inhaplieu =new Intent(MainActivity.this, nhaplieuthietke.class);
        //gửi lệnh tới android system để mở màn hình
        startActivity(inhaplieu);*/

    }


    public void thietKe(View view) {
        // button kiểm định
        btn_KiemDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog kiemdinh_dialog = new Dialog(MainActivity.this); // khai báo nó hiển thị ở màn hình chính đang đứng
                kiemdinh_dialog.setCancelable(false);// nếu bấm ra khỏi dialog thì ko thực thi
                kiemdinh_dialog.setContentView(R.layout.activity_kiemdinh_dialog); // et đến layout của dialog đã thiết kế
                // Khai báo thuộc tính của đối tượng trong dialog
                Button btnKDnhanh = (Button) kiemdinh_dialog.findViewById(R.id.btnKDnhanh);
                Button btnKDtheoAashto = (Button) kiemdinh_dialog.findViewById(R.id.btnKDtheoAashto);


                btnKDnhanh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent iKDnhanh = new Intent(MainActivity.this, KiemDinhNhanh.class);
                        startActivity(iKDnhanh);
                    }
                });

                btnKDtheoAashto.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent iAA = new Intent(MainActivity.this, KiemDinhTheoAASHTO.class);

                        startActivity(iAA);

                    }
                });
                Button btn_Huy_Dialog = (Button)kiemdinh_dialog.findViewById(R.id.button_Huy_Dialog);
                kiemdinh_dialog.show();
                btn_Huy_Dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kiemdinh_dialog.cancel();
                    }
                });

            }
        });


        // đây là function điều khiển
        btn_ThietKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog thietke_dialog = new Dialog(MainActivity.this); // khai báo nó hiển thị ở màn hình chính đang đứng
                thietke_dialog.setCancelable(false);// nếu bấm ra khỏi dialog thì ko thực thi
                thietke_dialog.setContentView(R.layout.activity_thietke_dialog); // et đến layout của dialog đã thiết kế
                // Khai báo thuộc tính của đối tượng trong dialog
                Button btn_DamThep = (Button) thietke_dialog.findViewById(R.id.btn_DamThep);
                Button btn_BeTongCotThep = (Button) thietke_dialog.findViewById(R.id.btn_BeTongCotThep);
                // cái này chọn button liên hợp nếu chọn không liên hợp thì sao a???

                btn_DamThep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent inhaplieu = new Intent(MainActivity.this, thietke_cauthep_dialog.class);

                        startActivity(inhaplieu);
                    }
                });

                btn_BeTongCotThep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent inhaplieu2 = new Intent(MainActivity.this, thietke_caubtct_dialog.class);

                        startActivity(inhaplieu2);
                        // nè e a có thêm biến để check xem họ chọn cái bài toán trên hay dưới nè
                        // ý là check vậy nó làm viejc sao á a
                        //// đây là cách truyền dữ liệu từ activity này sang activity kia đó e
                        //nếu mình chọn 1 caisbutton sao biết mà tính cho đúng a
                        // khi bấm button liên hợp a sẽ truyền biến "co" qua activity nhập liệu, ngược lại a truyền biến "khong"
                        // qua activity nhập liệu a check nó là "co" hay "khong"
                        //thêm cái này để khi nhảy qua màn hình nhập liệu check lại là đang tính bài toán trên hay dưới
                        // nếu mình bấm vào cái
                    }
                });
                Button btn_Huy_Dialog = (Button) thietke_dialog.findViewById(R.id.button_Huy_Dialog);
                thietke_dialog.show();
                btn_Huy_Dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        thietke_dialog.cancel();
                    }
                });


            }

        });

    }
}
//   btn_ThietKe.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//
//final Dialog thietke_dialog = new Dialog(MainActivity.this); // khai báo nó hiển thị ở màn hình chính đang đứng
//        thietke_dialog.setCancelable(false);// nếu bấm ra khỏi dialog thì ko thực thi
//        thietke_dialog.setContentView(R.layout.activity_thietke_dialog); // et đến layout của dialog đã thiết kế
//        // Khai báo thuộc tính của đối tượng trong dialog
//        Button btn_CauDamThepLienHop = (Button) thietke_dialog.findViewById(R.id.button_CauDamThep_CoLienHop);
//        Button btn_CauDamKhongLienHop = (Button) thietke_dialog.findViewById(R.id.button_CauDamThep_KhongLienHop);
//        // cái này chọn button liên hợp nếu chọn không liên hợp thì sao a???
//
//        btn_CauDamThepLienHop.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        Intent inhaplieu = new Intent(MainActivity.this, nhaplieuthietke.class);
//        inhaplieu.putExtra("baitoan","co");
//        startActivity(inhaplieu);
//        }
//        });
//
//        btn_CauDamKhongLienHop.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        Intent inhaplieu = new Intent(MainActivity.this, nhaplieuthietke.class);
//        inhaplieu.putExtra("baitoan","khong");
//        startActivity(inhaplieu);
//        // nè e a có thêm biến để check xem họ chọn cái bài toán trên hay dưới nè
//        // ý là check vậy nó làm viejc sao á a
//        //// đây là cách truyền dữ liệu từ activity này sang activity kia đó e
//        //nếu mình chọn 1 caisbutton sao biết mà tính cho đúng a
//        // khi bấm button liên hợp a sẽ truyền biến "co" qua activity nhập liệu, ngược lại a truyền biến "khong"
//        // qua activity nhập liệu a check nó là "co" hay "khong"
//        //thêm cái này để khi nhảy qua màn hình nhập liệu check lại là đang tính bài toán trên hay dưới
//        // nếu mình bấm vào cái
//        }
//        });
//        Button btn_Huy_Dialog = (Button) thietke_dialog.findViewById(R.id.button_Huy_Dialog);
//        thietke_dialog.show();
//        btn_Huy_Dialog.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        thietke_dialog.cancel();
//        }
//        });
//
//
//        }
//
//        });
