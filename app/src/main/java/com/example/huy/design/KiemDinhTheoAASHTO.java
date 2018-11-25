package com.example.huy.design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nbsp.materialfilepicker.MaterialFilePicker;

import java.util.regex.Pattern;

//import com.nbsp.materialfilepicker.MaterialFilePicker;
//import com.nbsp.materialfilepicker.ui.FilePickerActivity;

public class KiemDinhTheoAASHTO extends AppCompatActivity {
    Button btnNhapFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiem_dinh_theo_aashto);
        addEvents();
        addControls();
    }
    public void addEvents(){
        btnNhapFile=(Button) findViewById(R.id.btnNhapFile);

    }
    public void addControls(){
        NhapFie();

    }
    public void NhapFie(){
        btnNhapFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialFilePicker()
                        ////dàed
                        .withActivity(KiemDinhTheoAASHTO.this)
                        .withRequestCode(1000)
                        .withFilter(Pattern.compile(".*\\.txt$")) // Filtering files and directories by file name using regexp
                        .withFilterDirectories(true) // Set directories filterable (false by default)
                        .withHiddenFiles(true) // Show hidden files and folders
                        .start();

            }
        });
    }
}
