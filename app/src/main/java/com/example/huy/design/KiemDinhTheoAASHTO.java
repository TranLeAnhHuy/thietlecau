package com.example.huy.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.applandeo.FilePicker;
import com.applandeo.constants.FileType;
import com.applandeo.listeners.OnSelectFileListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class KiemDinhTheoAASHTO extends AppCompatActivity {
    Button btnNhapFile;
    TextView txtViewTxt;
    File myFile;
    StringBuilder text = new StringBuilder();
    String s,s1,s2;

    String sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10,sen11,sen12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiem_dinh_theo_aashto);
        addEvents();
        addControls();
    }
    public void addEvents(){
        btnNhapFile=(Button) findViewById(R.id.btnNhapFile);
        txtViewTxt=(TextView) findViewById(R.id.txtViewTxt);

    }
    public void addControls(){
        NhapFie();

    }
    public void NhapFie(){
        btnNhapFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FilePicker.Builder(KiemDinhTheoAASHTO.this, new OnSelectFileListener() {
                    @Override
                    public void onSelect(File file) {
                        myFile = file;
                        BufferedReader br = null;
                        try {
                            br = new BufferedReader(new FileReader(myFile));
                            String line;
                            while ((line = br.readLine()) != null) {
                                text.append(line);
                                text.append('\n');


                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                br.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        // KẾT QUẢ ĐÂY
                        //////////////tách chuỗi//////////////
                        s = text.toString();
                        int vtc1=s.lastIndexOf("* Intelliducer Names");
                        int vtc2=s.lastIndexOf("* Box Names");
                        int vtc3=s.lastIndexOf("* Data");
                        int vtc4=s.lastIndexOf("* Starting position");
                        //////////////////////////////
                        s1= s.substring(vtc1+20,vtc2);
                        s1=s1.trim();
                        s2=s.substring(vtc3+6,vtc4);
                        s2=s2.trim();
                        ///////////tách dữ liệu//////////////
                        // tách hàng
                        String []name=s1.split(",");
                        String []row=s2.split(",\n");
                        int c=s1.split(",").length;
                        int d=s2.split(",\n").length;
                        for(int i=0; i<=d;i++){
                            for (int k=0; k<=c; k++){
                                String []data=row[i].split(",");
                                sen1=data[0];
                            }
                        }


                        txtViewTxt.setText(sen1);

//
//                        txtViewTxt.setText("Tên cảm biến: "+s1+"\nGiá trị cảm biến đo đc"+s2);
                    }
                }).fileType(FileType.TEXT).show();
            }
        });
    }
}
