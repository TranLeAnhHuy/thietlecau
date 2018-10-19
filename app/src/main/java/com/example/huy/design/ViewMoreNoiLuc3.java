package com.example.huy.design;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ViewMoreNoiLuc3 extends AppCompatActivity {
    private LineChart lineChartM3,lineChartV3;
    private LineData lineDataM3,lineDataV3;
    double M31,M32,M33,M34,M35,M36,M37,M38,Q31,Q32,Q33,Q34,Q35,Q36,Q37,Q38;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float Q1val[]=new float[5];
    float Q2val[]=new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc3);
        //Láy kết quả
        Intent ViewMoreNoiLuc3bundle = getIntent();
        // lấy dữ liệu
        M31= ViewMoreNoiLuc3bundle.getDoubleExtra("M31",0.0);
        M32= ViewMoreNoiLuc3bundle.getDoubleExtra("M32",0.0);
        M33= ViewMoreNoiLuc3bundle.getDoubleExtra("M33",0.0);
        M34= ViewMoreNoiLuc3bundle.getDoubleExtra("M34",0.0);
        M35= ViewMoreNoiLuc3bundle.getDoubleExtra("M35",0.0);
        M36= ViewMoreNoiLuc3bundle.getDoubleExtra("M36",0.0);
        M37= ViewMoreNoiLuc3bundle.getDoubleExtra("M37",0.0);
        M38= ViewMoreNoiLuc3bundle.getDoubleExtra("M38",0.0);

        Q31= ViewMoreNoiLuc3bundle.getDoubleExtra("Q31",0.0);
        Q32= ViewMoreNoiLuc3bundle.getDoubleExtra("Q32",0.0);
        Q33= ViewMoreNoiLuc3bundle.getDoubleExtra("Q33",0.0);
        Q34= ViewMoreNoiLuc3bundle.getDoubleExtra("Q34",0.0);
        Q35= ViewMoreNoiLuc3bundle.getDoubleExtra("Q35",0.0);
        Q36= ViewMoreNoiLuc3bundle.getDoubleExtra("Q36",0.0);
        Q37= ViewMoreNoiLuc3bundle.getDoubleExtra("Q37",0.0);
        Q38= ViewMoreNoiLuc3bundle.getDoubleExtra("Q38",0.0);
        M1val[0] = 0f;
        M1val[1] = (float)M31;
        M1val[2] = (float)M32;
        M1val[3] = (float)M33;
        M1val[4] = (float)M34;
        M2val[0] = 0f;
        M2val[1] = (float)M35;
        M2val[2] = (float)M36;
        M2val[3] = (float)M37;
        M2val[4] = (float)M38;

        Q1val[0]= (float)Q34;
        Q1val[1]= (float)Q33;
        Q1val[2]= (float)Q32;
        Q1val[3]= (float)Q31;
        Q1val[4]= 0f;
        Q2val[0]=(float)Q38;
        Q2val[1]=(float)Q37;
        Q2val[2]=(float)Q36;
        Q2val[3]=(float)Q35;
        Q2val[4]= 0f;

        lineChartM3= (LineChart) findViewById(R.id.linechartM3);
        lineDataM3= new LineData(getXvaluesM3(),getLineDataValuesM3());
        lineChartM3.setData(lineDataM3);
        lineChartM3.setDescription("Biểu đồ tổng hợp Momen GD1 và GD2");
        lineChartM3.setDescriptionTextSize(20f);
        lineChartM3.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartM3.animateY(7000);
        lineChartM3.invalidate();
        lineChartM3.setDrawGridBackground(true);
        lineChartM3.setDrawBorders(true);
        lineChartM3.setDescriptionTextSize(14);


        lineChartV3= (LineChart) findViewById(R.id.linechartV3);
        lineDataV3= new LineData(getXvaluesV3(),getLineDataValuesV3());
        lineChartV3.setData(lineDataV3);
        lineChartV3.setDescription("Biểu đồ tổng hợp lực cắt GD1 và GD2");
        lineChartV3.setDescriptionTextSize(20f);
        lineChartV3.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV3.animateY(7000);
        lineChartV3.invalidate();
        lineChartV3.setDrawGridBackground(true);
        lineChartV3.setDrawBorders(true);
        lineChartV3.setDescriptionTextSize(14);

    }

    private List<ILineDataSet> getLineDataValuesM3() {
        ArrayList<ILineDataSet> lineDataSetsM3 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> M2entryArrayList = new ArrayList<>();
//        ArrayList<Entry> Q1entryArrayList = new ArrayList<>();
//        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        for (int i =0; i< M1val.length;i++){
            entryArrayList.add(new Entry(M1val[i],i));
        }
        for (int i =0; i<M2val.length;i++){
            M2entryArrayList.add(new Entry(M2val[i],i));
        }
//        for (int i =0; i<Q1val.length;i++){
//            Q1entryArrayList.add(new Entry(Q1val[i],i));
//        }
//        for (int i =0; i<Q2val.length;i++){
//            Q2entryArrayList.add(new Entry(Q2val[i],i));
//        }
//
        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "M TTGH CD1");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(7);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2= new LineDataSet(M2entryArrayList, "M TTGH SD");
        lineDataSetM2.setColor(Color.BLACK);
        lineDataSetM2.setCircleColor(Color.BLACK);
        lineDataSetM2.setCircleRadius(7);
        lineDataSetM2.setValueTextColor(Color.BLACK);

//        LineDataSet lineDataSetQ1= new LineDataSet(Q1entryArrayList, "V TTGH CD1");
//        lineDataSetQ1.setColor(Color.RED);
//        lineDataSetQ1.setCircleColor(Color.RED);
//        lineDataSetQ1.setCircleRadius(7);
//        lineDataSetQ1.setValueTextColor(Color.RED);
//
//        LineDataSet lineDataSetQ2= new LineDataSet(Q2entryArrayList, "V TTGH SD");
//        lineDataSetQ2.setColor(Color.MAGENTA);
//        lineDataSetQ2.setCircleColor(Color.MAGENTA);
//        lineDataSetQ2.setCircleRadius(7);
//        lineDataSetQ2.setValueTextColor(Color.MAGENTA);


        lineDataSetsM3= new ArrayList<>();
        lineDataSetsM3.add(lineDataSet);
        lineDataSetsM3.add(lineDataSetM2);
//        lineDataSets.add(lineDataSetQ1);
//        lineDataSets.add(lineDataSetQ2);


        return lineDataSetsM3;
    }

    private List<String> getXvaluesM3() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }

    private List<ILineDataSet> getLineDataValuesV3() {
        ArrayList<ILineDataSet> lineDataSetsV3 = null;

        ArrayList<Entry> Q1entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();

        for (int i =0; i<Q1val.length;i++){
            Q1entryArrayList.add(new Entry(Q1val[i],i));
        }
        for (int i =0; i<Q2val.length;i++){
            Q2entryArrayList.add(new Entry(Q2val[i],i));
        }



        LineDataSet lineDataSetQ1= new LineDataSet(Q1entryArrayList, "V TTGH CD1");
        lineDataSetQ1.setColor(Color.RED);
        lineDataSetQ1.setCircleColor(Color.RED);
        lineDataSetQ1.setCircleRadius(4);
        lineDataSetQ1.setValueTextColor(Color.RED);

        LineDataSet lineDataSetQ2= new LineDataSet(Q2entryArrayList, "V TTGH SD");
        lineDataSetQ2.setColor(Color.MAGENTA);
        lineDataSetQ2.setCircleColor(Color.MAGENTA);
        lineDataSetQ2.setCircleRadius(4);
        lineDataSetQ2.setValueTextColor(Color.MAGENTA);


        lineDataSetsV3= new ArrayList<>();
               lineDataSetsV3.add(lineDataSetQ1);
        lineDataSetsV3.add(lineDataSetQ2);


        return lineDataSetsV3;
    }

    private List<String> getXvaluesV3() {
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
