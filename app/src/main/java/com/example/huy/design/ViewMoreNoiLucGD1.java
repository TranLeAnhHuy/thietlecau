package com.example.huy.design;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ViewMoreNoiLucGD1 extends AppCompatActivity {
    private LineChart lineChart;
    private LineData lineData;
    ///   float x=0;
//    float M1val[];
//    float M2val[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc_gd1);

        //Láy kết quả
        Intent ViewMoreNOILUCGD1intent = getIntent();
        Bundle ViewMoreNOILUCGD1bundle = ViewMoreNOILUCGD1intent.getBundleExtra("ViewMoreNOILUCGD1bundle");
        // lấy dữ liệu
        double M1= ViewMoreNOILUCGD1intent.getDoubleExtra("M1",0.0);
        double M2= ViewMoreNOILUCGD1intent.getDoubleExtra("M2",0.0);
        double M3= ViewMoreNOILUCGD1intent.getDoubleExtra("M3",0.0);
        double M4= ViewMoreNOILUCGD1intent.getDoubleExtra("M4",0.0);
        double M5= ViewMoreNOILUCGD1intent.getDoubleExtra("M5",0.0);
        double M6= ViewMoreNOILUCGD1intent.getDoubleExtra("M6",0.0);
        double M7= ViewMoreNOILUCGD1intent.getDoubleExtra("M7",0.0);
        double M8= ViewMoreNOILUCGD1intent.getDoubleExtra("M8",0.0);
        double Q1= ViewMoreNOILUCGD1intent.getDoubleExtra("Q1",0.0);
        double Q2= ViewMoreNOILUCGD1intent.getDoubleExtra("Q2",0.0);
        double Q3= ViewMoreNOILUCGD1intent.getDoubleExtra("Q3",0.0);
        double Q4= ViewMoreNOILUCGD1intent.getDoubleExtra("Q4",0.0);
        double Q5= ViewMoreNOILUCGD1intent.getDoubleExtra("Q5",0.0);
        double Q6= ViewMoreNOILUCGD1intent.getDoubleExtra("Q6",0.0);
        double Q7= ViewMoreNOILUCGD1intent.getDoubleExtra("Q7",0.0);
        double Q8= ViewMoreNOILUCGD1intent.getDoubleExtra("Q8",0.0);
        float M1val[] = {0f, (float)M1, (float)M2, (float)M3, (float)M4};
        float M2val[] = {0f, (float)M5, (float)M6, (float)M7, (float)M8};

        lineChart= (LineChart) findViewById(R.id.linechartNoiLucGD1);
        lineData= new LineData(getXvalues(),getLineDataValues());
        lineChart.setData(lineData);
        lineChart.setDescription("Biểu đồ Momen và lực cắt ");
        lineChart.setDescriptionTextSize(20f);
        lineChart.setDescriptionColor(Color.DKGRAY);
        lineChart.animateY(5000);
        lineChart.invalidate();
    }
    private List<ILineDataSet> getLineDataValues() {
        ArrayList<ILineDataSet> lineDataSets = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> M2entryArrayList = new ArrayList<>();
        for (int i =0; i< M1val.length;i++){
            entryArrayList.add(new Entry(M1val[i],i));
        }
        for (int i =0; i<M2val.length;i++){
            M2entryArrayList.add(new Entry(M2val[i],i));
        }
//        Entry e1 = new Entry(x,0);
//        Entry e2 = new Entry(3000f,1);
//        Entry e3 = new Entry(-50000f,2);
//        Entry e4 = new Entry(89865f,3);
//        Entry e5 = new Entry(40000f,4);
//        entryArrayList.add(e1);
//        entryArrayList.add(e2);
//        entryArrayList.add(e3);
//        entryArrayList.add(e4);
//        entryArrayList.add(e5);
        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "M1 kN.m");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(7);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2= new LineDataSet(M2entryArrayList, "M2 kN.m");
        lineDataSetM2.setColor(Color.RED);
        lineDataSetM2.setCircleColor(Color.RED);
        lineDataSetM2.setCircleRadius(7);
        lineDataSetM2.setValueTextColor(Color.RED);


        lineDataSets= new ArrayList<>();
        lineDataSets.add(lineDataSet);
        lineDataSets.add(lineDataSetM2);


        return lineDataSets;
    }

    private List<String> getXvalues() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }


}
