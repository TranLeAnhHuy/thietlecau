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
    double M11,M12,M13,M14,M15,M16,M17,M18,Q11,Q12,Q13,Q14,Q15,Q16,Q17,Q18;
    ///   float x=0;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float Q1val[]=new float[5];
    float Q2val[]=new float[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc_gd1);
//        Intent LHintent = getIntent();
//        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//        txtAnc.setText(roundString(LHbundle.getDouble("Anc"), 4));
        //Láy kết quả
        Intent ViewMoreNOILUCGD1bundle = getIntent();
        // lấy dữ liệu
        M11= ViewMoreNOILUCGD1bundle.getDoubleExtra("M11",0.0);
        M12= ViewMoreNOILUCGD1bundle.getDoubleExtra("M12",0.0);
        M13= ViewMoreNOILUCGD1bundle.getDoubleExtra("M13",0.0);
        M14= ViewMoreNOILUCGD1bundle.getDoubleExtra("M14",0.0);
        M15= ViewMoreNOILUCGD1bundle.getDoubleExtra("M15",0.0);
        M16= ViewMoreNOILUCGD1bundle.getDoubleExtra("M16",0.0);
        M17= ViewMoreNOILUCGD1bundle.getDoubleExtra("M17",0.0);
        M18= ViewMoreNOILUCGD1bundle.getDoubleExtra("M18",0.0);

        Q11= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q11",0.0);
        Q12= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q12",0.0);
        Q13= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q13",0.0);
        Q14= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q14",0.0);
        Q15= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q15",0.0);
        Q16= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q16",0.0);
        Q17= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q17",0.0);
        Q18= ViewMoreNOILUCGD1bundle.getDoubleExtra("Q18",0.0);

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

        Q1val[0]= (float)Q14;
        Q1val[1]= (float)Q13;
        Q1val[2]= (float)Q12;
        Q1val[3]= (float)Q11;
        Q1val[4]= 0f;
        Q2val[0]=(float)Q18;
        Q2val[1]=(float)Q17;
        Q2val[2]=(float)Q16;
        Q2val[3]=(float)Q15;
        Q2val[4]= 0f;



        lineChart= (LineChart) findViewById(R.id.linechartNoiLucGD1);
        lineData= new LineData(getXvalues(),getLineDataValues());
        lineChart.setData(lineData);
        lineChart.setDescription("Biểu đồ Momen và lực cắt ");
        lineChart.setDescriptionTextSize(20f);
        lineChart.setDescriptionColor(Color.DKGRAY);
        lineChart.setBackgroundColor(Color.BLACK);
        lineChart.animateY(7000);
        lineChart.invalidate();

    }
    private List<ILineDataSet> getLineDataValues() {
        ArrayList<ILineDataSet> lineDataSets = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> M2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q1entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        for (int i =0; i< M1val.length;i++){
            entryArrayList.add(new Entry(M1val[i],i));
        }
        for (int i =0; i<M2val.length;i++){
            M2entryArrayList.add(new Entry(M2val[i],i));
        }
        for (int i =0; i<Q1val.length;i++){
            Q1entryArrayList.add(new Entry(Q1val[i],i));
        }
        for (int i =0; i<Q2val.length;i++){
            Q2entryArrayList.add(new Entry(Q2val[i],i));
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

        LineDataSet lineDataSetQ1= new LineDataSet(Q1entryArrayList, "Q1 kN");
        lineDataSetQ1.setColor(Color.GREEN);
        lineDataSetQ1.setCircleColor(Color.GREEN);
        lineDataSetQ1.setCircleRadius(7);
        lineDataSetQ1.setValueTextColor(Color.GREEN);

        LineDataSet lineDataSetQ2= new LineDataSet(Q2entryArrayList, "Q2 kN");
        lineDataSetQ2.setColor(Color.WHITE);
        lineDataSetQ2.setCircleColor(Color.WHITE);
        lineDataSetQ2.setCircleRadius(7);
        lineDataSetQ2.setValueTextColor(Color.WHITE);


        lineDataSets= new ArrayList<>();
        lineDataSets.add(lineDataSet);
        lineDataSets.add(lineDataSetM2);
        lineDataSets.add(lineDataSetQ1);
        lineDataSets.add(lineDataSetQ2);


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

