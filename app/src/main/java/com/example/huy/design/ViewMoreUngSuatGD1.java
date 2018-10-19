package com.example.huy.design;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ViewMoreUngSuatGD1 extends AppCompatActivity {
    //ứng suất tĩnh tải giai đoạn 1
    private LineChart lineChart;
    private LineData lineData;
    double f11,f12,f13,f14,f15,f16,f17,f18,f19,f110,f111,f112,f113,f114,f115,f116;

    float ftCD1val[]=new float[5];
    float fdCD1val[]=new float[5];
    float ftSDval[]=new float[5];
    float fdSDval[]=new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_ung_suat_gd1);
        //Láy kết quả
        Intent ViewMoreUNGSUATGD1bundle = getIntent();
        // lấy dữ liệu
        f11= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f11",0.0);
        f12= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f12",0.0);
        f13= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f13",0.0);
        f14= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f14",0.0);
        f15= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f15",0.0);
        f16= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f16",0.0);
        f17= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f17",0.0);
        f18= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f18",0.0);
        f19= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f19",0.0);
        f110= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f110",0.0);
        f111= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f111",0.0);
        f112= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f112",0.0);
        f113= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f113",0.0);
        f114= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f114",0.0);
        f115= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f115",0.0);
        f116= ViewMoreUNGSUATGD1bundle.getDoubleExtra("f116",0.0);

        // thớ trên CD1
        ftCD1val[0] = 0f;
        ftCD1val[1] = -(float)f11;
        ftCD1val[2] = -(float)f12;
        ftCD1val[3] = -(float)f13;
        ftCD1val[4] = -(float)f14;

        // thớ dưới CD1
        fdCD1val[0] = 0f;
        fdCD1val[1] = (float)f15;
        fdCD1val[2] = (float)f16;
        fdCD1val[3] = (float)f17;
        fdCD1val[4] = (float)f18;

       // thớ trên SD
        ftSDval[0] = 0f;
        ftSDval[1] = -(float)f19;
        ftSDval[2] = -(float)f110;
        ftSDval[3] = -(float)f111;
        ftSDval[4] = -(float)f112;

        // thớ dưới SD
        fdSDval[0] = 0f;
        fdSDval[1] = (float)f113;
        fdSDval[2] = (float)f114;
        fdSDval[3] = (float)f115;
        fdSDval[4] = (float)f116;


        lineChart= (LineChart) findViewById(R.id.linechartUngSuatGD1);
        lineData= new LineData(getXvalues(),getLineDataValues());
        lineChart.setData(lineData);
        lineChart.setDescription("Biểu đồ ứng suất thớ trên và thớ dưới GD1");
        lineChart.setDescriptionTextSize(20f);
        lineChart.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChart.animateY(7000);
        lineChart.invalidate();
        lineChart.setDrawGridBackground(true);
        lineChart.setDrawBorders(true);
        lineChart.setDescriptionTextSize(14);
    }
    private List<ILineDataSet> getLineDataValues() {
        ArrayList<ILineDataSet> lineDataSets = null;
        ArrayList<Entry> ftCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> fdCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> ftSDentryArrayList = new ArrayList<>();
        ArrayList<Entry> fdSDentryArrayList = new ArrayList<>();
        for (int i =0; i< ftCD1val.length;i++){
            ftCD1entryArrayList.add(new Entry(ftCD1val[i],i));
        }
        for (int i =0; i<fdCD1val.length;i++){
            fdCD1entryArrayList.add(new Entry(fdCD1val[i],i));
        }
        for (int i =0; i<ftSDval.length;i++){
            ftSDentryArrayList.add(new Entry(ftSDval[i],i));
        }
        for (int i =0; i<fdSDval.length;i++){
            fdSDentryArrayList.add(new Entry(fdSDval[i],i));
        }
//
        LineDataSet ftCD1lineDataSet= new LineDataSet(ftCD1entryArrayList, "fT TTCD1");
        ftCD1lineDataSet.setColor(Color.BLUE);
        ftCD1lineDataSet.setCircleColor(Color.BLUE);
        ftCD1lineDataSet.setCircleRadius(7);
        ftCD1lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetfdCD1= new LineDataSet(fdCD1entryArrayList, "fB TTCD1");
        lineDataSetfdCD1.setColor(Color.BLACK);
        lineDataSetfdCD1.setCircleColor(Color.BLACK);
        lineDataSetfdCD1.setCircleRadius(7);
        lineDataSetfdCD1.setValueTextColor(Color.BLACK);

        LineDataSet lineDataSetftSD= new LineDataSet(ftSDentryArrayList, "fT TTSD");
        lineDataSetftSD.setColor(Color.RED);
        lineDataSetftSD.setCircleColor(Color.RED);
        lineDataSetftSD.setCircleRadius(7);
        lineDataSetftSD.setValueTextColor(Color.RED);

        LineDataSet lineDataSetfdSD= new LineDataSet(fdSDentryArrayList, "fB TTSD");
        lineDataSetfdSD.setColor(Color.MAGENTA);
        lineDataSetfdSD.setCircleColor(Color.MAGENTA);
        lineDataSetfdSD.setCircleRadius(7);
        lineDataSetfdSD.setValueTextColor(Color.MAGENTA);


        lineDataSets= new ArrayList<>();
        lineDataSets.add(ftCD1lineDataSet);
        lineDataSets.add(lineDataSetfdCD1);
        lineDataSets.add(lineDataSetftSD);
        lineDataSets.add(lineDataSetfdSD);
        return lineDataSets;
    }

    private List<String> getXvalues() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");

        return xvalues;
    }



}
