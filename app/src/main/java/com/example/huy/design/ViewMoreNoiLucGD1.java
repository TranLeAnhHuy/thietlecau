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
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc_gd1);
//        Intent LHintent = getIntent();
//        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//        txtAnc.setText(roundString(LHbundle.getDouble("Anc"), 4));
        //Láy kết quả
        Intent ViewMoreNOILUCGD1intent = getIntent();
        Bundle ViewMoreNOILUCGD1bundle = ViewMoreNOILUCGD1intent.getBundleExtra("ViewMoreNOILUCGD1bundle");
        // lấy dữ liệu
        double M11= ViewMoreNOILUCGD1bundle.getDouble("M11",0.0);
        double M12= ViewMoreNOILUCGD1bundle.getDouble("M12",0.0);
        double M13= ViewMoreNOILUCGD1bundle.getDouble("M13",0.0);
        double M14= ViewMoreNOILUCGD1bundle.getDouble("M14",0.0);
        double M15= ViewMoreNOILUCGD1bundle.getDouble("M15",0.0);
        double M16= ViewMoreNOILUCGD1bundle.getDouble("M16",0.0);
        double M17= ViewMoreNOILUCGD1bundle.getDouble("M17",0.0);
        double M18= ViewMoreNOILUCGD1bundle.getDouble("M18",0.0);

        double Q11= ViewMoreNOILUCGD1bundle.getDouble("Q11",0.0);
        double Q12= ViewMoreNOILUCGD1bundle.getDouble("Q12",0.0);
        double Q13= ViewMoreNOILUCGD1bundle.getDouble("Q13",0.0);
        double Q14= ViewMoreNOILUCGD1bundle.getDouble("Q14",0.0);
        double Q15= ViewMoreNOILUCGD1bundle.getDouble("Q15",0.0);
        double Q16= ViewMoreNOILUCGD1bundle.getDouble("Q16",0.0);
        double Q17= ViewMoreNOILUCGD1bundle.getDouble("Q17",0.0);
        double Q18= ViewMoreNOILUCGD1bundle.getDouble("Q18",0.0);


        M1val[0] = 0f;
        M1val[1] = (float)M11;
        M1val[2] = (float)M12;
        M1val[3] = (float)M13;
        M1val[4] = (float)M14;
        M2val[0] = 0f;
        M2val[1] = (float)M15;
        M2val[2] = (float)M16;
        M2val[3] = (float)M17;
        M2val[4] = (float)M18;


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
  //  System.out.println("M11");


}

