package com.example.huy.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.applandeo.FilePicker;
import com.applandeo.constants.FileType;
import com.applandeo.listeners.OnSelectFileListener;

import java.io.File;

public class KiemDinhTheoAASHTO extends AppCompatActivity {
    Button btnNhapFile;
    File myFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiem_dinh_theo_aashto);
        addEvents();
        addControls();
    }

    public void addEvents() {
        btnNhapFile = (Button) findViewById(R.id.btnNhapFile);

    }

    public void addControls() {
        NhapFie();

    }

    public void NhapFie() {
        btnNhapFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FilePicker.Builder(KiemDinhTheoAASHTO.this, new OnSelectFileListener() {
                    @Override
                    public void onSelect(File file) {
                        myFile = file;
                    }
                }).fileType(FileType.TEXT).show();
            }
        });
    }
}
