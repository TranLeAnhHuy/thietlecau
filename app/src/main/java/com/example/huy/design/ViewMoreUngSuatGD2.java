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

public class ViewMoreUngSuatGD2 extends AppCompatActivity {
    private LineChart lineChartDT,lineChartDN;
    private LineData lineDataDT,lineDataDN;
    //ứng suất tĩnh tải giai đoạn 2
  double f21,f22,f23,f24,f25,f26,f27,f28,f29,f210,f211,f212,f213,f214,f215,f216,f217,f218,f219,f220,f221,f222,f223,f224,f225,f226,f227,f228,f229,f230,f231,f232;

    //DT
    float ftCD1valDT[]=new float[5];
    float fdCD1valDT[]=new float[5];
    float ftSDvalDT[]=new float[5];
    float fdSDvalDT[]=new float[5];

    //DT
    float ftCD1valDN[]=new float[5];
    float fdCD1valDN[]=new float[5];
    float ftSDvalDN[]=new float[5];
    float fdSDvalDN[]=new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_ung_suat_gd2);
        //Láy kết quả
        Intent ViewMoreUNGSUATGD2bundle = getIntent();
        // lấy dữ liệu
        f21= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f21",0.0);
        f22= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f22",0.0);
        f23= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f23",0.0);
        f24= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f24",0.0);
        f25= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f25",0.0);
        f26= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f26",0.0);
        f27= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f27",0.0);
        f28= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f28",0.0);
        f29= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f29",0.0);
        f210= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f210",0.0);
        f211= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f211",0.0);
        f212= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f212",0.0);
        f213= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f213",0.0);
        f214= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f214",0.0);
        f215= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f215",0.0);
        f216= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f216",0.0);
        f217= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f217",0.0);
        f218= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f218",0.0);
        f219= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f219",0.0);
        f220= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f220",0.0);
        f221= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f221",0.0);
        f222= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f222",0.0);
        f223= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f223",0.0);
        f224= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f224",0.0);
        f225= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f225",0.0);
        f226= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f226",0.0);
        f227= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f227",0.0);
        f228= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f228",0.0);
        f229= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f229",0.0);
        f230= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f230",0.0);
        f231= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f231",0.0);
        f232= ViewMoreUNGSUATGD2bundle.getDoubleExtra("f232",0.0);

        // thớ trên CD1 DT
        ftCD1valDT[0] = 0f;
        ftCD1valDT[1] = -(float)f21;
        ftCD1valDT[2] = -(float)f22;
        ftCD1valDT[3] = -(float)f23;
        ftCD1valDT[4] = -(float)f24;
        // thớ dưới CD1 DT
        fdCD1valDT[0] = 0f;
        fdCD1valDT[1] = (float)f25;
        fdCD1valDT[2] = (float)f26;
        fdCD1valDT[3] = (float)f27;
        fdCD1valDT[4] = (float)f28;
        // thớ trên SD DT
        ftSDvalDT[0] = 0f;
        ftSDvalDT[1] = -(float)f29;
        ftSDvalDT[2] = -(float)f210;
        ftSDvalDT[3] = -(float)f211;
        ftSDvalDT[4] = -(float)f212;
        // thớ dưới SD
        fdSDvalDT[0] = 0f;
        fdSDvalDT[1] = (float)f213;
        fdSDvalDT[2] = (float)f214;
        fdSDvalDT[3] = (float)f215;
        fdSDvalDT[4] = (float)f216;

        /// thớ trên CD1 DN
        ftCD1valDN[0] = 0f;
        ftCD1valDN[1] = -(float)f217;
        ftCD1valDN[2] = -(float)f218;
        ftCD1valDN[3] = -(float)f219;
        ftCD1valDN[4] = -(float)f220;
        // thớ dưới CD1 DN
        fdCD1valDN[0] = 0f;
        fdCD1valDN[1] = (float)f221;
        fdCD1valDN[2] = (float)f222;
        fdCD1valDN[3] = (float)f223;
        fdCD1valDN[4] = (float)f224;
        // thớ trn SD DN
        ftSDvalDN[0] = 0f;
        ftSDvalDN[1] = -(float)f225;
        ftSDvalDN[2] = -(float)f226;
        ftSDvalDN[3] = -(float)f227;
        ftSDvalDN[4] = -(float)f228;
        // thớ dưới SD
        fdSDvalDN[0] = 0f;
        fdSDvalDN[1] = (float)f229;
        fdSDvalDN[2] = (float)f230;
        fdSDvalDN[3] = (float)f231;
        fdSDvalDN[4] = (float)f232;
        lineChartDT= (LineChart) findViewById(R.id.linechartUngSuatDTGD2);
        lineDataDT= new LineData(getXvalues(),getLineDataValues());
        lineChartDT.setData(lineDataDT);
        lineChartDT.setDescription("Biểu đồ ỨNG SUẤT fT và fD DẦM TRONG GD2 ");
        lineChartDT.setDescriptionTextSize(20f);
        lineChartDT.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartDT.animateY(7000);
        lineChartDT.invalidate();
        lineChartDT.setDrawGridBackground(true);
        lineChartDT.setDrawBorders(true);
        lineChartDT.setDescriptionTextSize(14);

        //
        lineChartDN= (LineChart) findViewById(R.id.linechartUngSuatDNGD2);
        lineDataDN= new LineData(getXvaluesDN(),getLineDataValuesDN());
        lineChartDN.setData(lineDataDN);
        lineChartDN.setDescription("Biểu đồ ỨNG SUẤT fT và fD DẦM NGOÀI GD2");
        lineChartDN.setDescriptionTextSize(20f);
        lineChartDN.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartDN.animateY(7000);
        lineChartDN.invalidate();
        lineChartDN.setDrawGridBackground(true);
        lineChartDN.setDrawBorders(true);
        lineChartDN.setDescriptionTextSize(14);

    }
    private List<ILineDataSet> getLineDataValuesDN() {
        ArrayList<ILineDataSet> lineDataSetsDN = null;
        ArrayList<Entry> DNftCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> DNfdCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> DNftSDentryArrayList = new ArrayList<>();
        ArrayList<Entry> DNfdSDentryArrayList = new ArrayList<>();
        for (int i =0; i< ftCD1valDN.length;i++){
            DNftCD1entryArrayList.add(new Entry(ftCD1valDN[i],i));
        }
        for (int i =0; i<fdCD1valDN.length;i++){
            DNfdCD1entryArrayList.add(new Entry(fdCD1valDN[i],i));
        }
        for (int i =0; i<ftSDvalDN.length;i++){
            DNftSDentryArrayList.add(new Entry(ftSDvalDN[i],i));
        }
        for (int i =0; i<fdSDvalDN.length;i++){
            DNfdSDentryArrayList.add(new Entry(fdSDvalDN[i],i));
        }
//
        LineDataSet DNftCD1lineDataSet= new LineDataSet(DNftCD1entryArrayList, "fT TTCD1");
        DNftCD1lineDataSet.setColor(Color.BLUE);
        DNftCD1lineDataSet.setCircleColor(Color.BLUE);
        DNftCD1lineDataSet.setCircleRadius(7);
        DNftCD1lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet DNlineDataSetfdCD1= new LineDataSet(DNfdCD1entryArrayList, "fB TTCD1");
        DNlineDataSetfdCD1.setColor(Color.BLACK);
        DNlineDataSetfdCD1.setCircleColor(Color.BLACK);
        DNlineDataSetfdCD1.setCircleRadius(7);
        DNlineDataSetfdCD1.setValueTextColor(Color.BLACK);

        LineDataSet DNlineDataSetftSD= new LineDataSet(DNftSDentryArrayList, "fT TTSD");
        DNlineDataSetftSD.setColor(Color.RED);
        DNlineDataSetftSD.setCircleColor(Color.RED);
        DNlineDataSetftSD.setCircleRadius(7);
        DNlineDataSetftSD.setValueTextColor(Color.RED);

        LineDataSet DNlineDataSetfdSD= new LineDataSet(DNfdSDentryArrayList, "fB TTSD");
        DNlineDataSetfdSD.setColor(Color.MAGENTA);
        DNlineDataSetfdSD.setCircleColor(Color.MAGENTA);
        DNlineDataSetfdSD.setCircleRadius(7);
        DNlineDataSetfdSD.setValueTextColor(Color.MAGENTA);


        lineDataSetsDN= new ArrayList<>();
        lineDataSetsDN.add(DNftCD1lineDataSet);
        lineDataSetsDN.add(DNlineDataSetfdCD1);
        lineDataSetsDN.add(DNlineDataSetftSD);
        lineDataSetsDN.add(DNlineDataSetfdSD);
        return lineDataSetsDN;
    }
    private List<String> getXvaluesDN() {
        ArrayList<String> DNxvalues = new ArrayList<>();
        DNxvalues.add("0");
        DNxvalues.add("L/8");
        DNxvalues.add("L/4");
        DNxvalues.add("3L/8");
        DNxvalues.add("L/2");

        return DNxvalues;
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
    private List<ILineDataSet> getLineDataValues() {
        ArrayList<ILineDataSet> lineDataSets = null;
        ArrayList<Entry> ftCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> fdCD1entryArrayList = new ArrayList<>();
        ArrayList<Entry> ftSDentryArrayList = new ArrayList<>();
        ArrayList<Entry> fdSDentryArrayList = new ArrayList<>();
        for (int i =0; i< ftCD1valDT.length;i++){
            ftCD1entryArrayList.add(new Entry(ftCD1valDT[i],i));
        }
        for (int i =0; i<fdCD1valDT.length;i++){
            fdCD1entryArrayList.add(new Entry(fdCD1valDT[i],i));
        }
        for (int i =0; i<ftSDvalDT.length;i++){
            ftSDentryArrayList.add(new Entry(ftSDvalDT[i],i));
        }
        for (int i =0; i<fdSDvalDT.length;i++){
            fdSDentryArrayList.add(new Entry(fdSDvalDT[i],i));
        }
//
        LineDataSet ftCD1lineDataSet= new LineDataSet(ftCD1entryArrayList, "fT TTCD1");
        ftCD1lineDataSet.setColor(Color.BLUE);
        ftCD1lineDataSet.setCircleColor(Color.BLUE);
        ftCD1lineDataSet.setCircleRadius(7);
        ftCD1lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetfdCD1= new LineDataSet(fdCD1entryArrayList, "fB TTCD1");
        lineDataSetfdCD1.setColor(Color.GRAY);
        lineDataSetfdCD1.setCircleColor(Color.GRAY);
        lineDataSetfdCD1.setCircleRadius(7);
        lineDataSetfdCD1.setValueTextColor(Color.GRAY);

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



}
