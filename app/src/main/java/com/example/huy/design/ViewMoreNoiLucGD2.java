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

public class ViewMoreNoiLucGD2 extends AppCompatActivity {
    private LineChart lineChart,lineChartQ;
    private LineData lineData,lineDataQ;
    // Nội lực giai đoạn 2
    double M21, M22, M23, M24, M25, M26, M27, M28, Q21, Q22, Q23, Q24, Q25, Q26, Q27, Q28;
    float M1val[] = new float[5];
    float M2val[] = new float[5];
    float Q1val[] = new float[5];
    float Q2val[] = new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc_gd2);
        //Láy kết quả
        Intent ViewMoreNOILUCGD2bundle = getIntent();
        // lấy dữ liệu
        M21 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M21", 0.0);
        M22 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M22", 0.0);
        M23 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M23", 0.0);
        M24 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M24", 0.0);
        M25 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M25", 0.0);
        M26 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M26", 0.0);
        M27 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M27", 0.0);
        M28 = ViewMoreNOILUCGD2bundle.getDoubleExtra("M28", 0.0);

        Q21 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q21", 0.0);
        Q22 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q22", 0.0);
        Q23 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q23", 0.0);
        Q24 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q24", 0.0);
        Q25 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q25", 0.0);
        Q26 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q26", 0.0);
        Q27 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q27", 0.0);
        Q28 = ViewMoreNOILUCGD2bundle.getDoubleExtra("Q28", 0.0);

        M1val[0] = 0f;
        M1val[1] = (float) M21;
        M1val[2] = (float) M22;
        M1val[3] = (float) M23;
        M1val[4] = (float) M24;
        M2val[0] = 0f;
        M2val[1] = (float) M25;
        M2val[2] = (float) M26;
        M2val[3] = (float) M27;
        M2val[4] = (float) M28;

        Q1val[0] = (float) Q24;
        Q1val[1] = (float) Q23;
        Q1val[2] = (float) Q22;
        Q1val[3] = (float) Q21;
        Q1val[4] = 0f;
        Q2val[0] = (float) Q28;
        Q2val[1] = (float) Q27;
        Q2val[2] = (float) Q26;
        Q2val[3] = (float) Q25;
        Q2val[4] = 0f;


        lineChart = (LineChart) findViewById(R.id.linechartNoiLucGD2);
        lineData = new LineData(getXvalues(), getLineDataValues());
        lineChart.setData(lineData);
        lineChart.setDescription("Biểu đồ Momen GD2 ");
        lineChart.setDescriptionTextSize(20f);
        lineChart.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChart.animateY(7000);
        lineChart.invalidate();
        lineChart.setDrawGridBackground(true);
        lineChart.setDrawBorders(true);
        lineChart.setDescriptionTextSize(14);

        lineChartQ = (LineChart) findViewById(R.id.linechartV);
        lineDataQ = new LineData(getXvaluesQ(), getLineDataValuesQ());
        lineChartQ.setData(lineDataQ);
        lineChartQ.setDescription("Biểu đồ Lực cắt GD2 ");
        lineChartQ.setDescriptionTextSize(20f);
        lineChartQ.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartQ.animateY(7000);
        lineChartQ.invalidate();
        lineChartQ.setDrawGridBackground(true);
        lineChartQ.setDrawBorders(true);
        lineChartQ.setDescriptionTextSize(14);

    }
    private List<ILineDataSet> getLineDataValues() {
        ArrayList<ILineDataSet> lineDataSets = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> M2entryArrayList = new ArrayList<>();

        for (int i = 0; i < M1val.length; i++) {
            entryArrayList.add(new Entry(M1val[i], i));
        }
        for (int i = 0; i < M2val.length; i++) {
            M2entryArrayList.add(new Entry(M2val[i], i));
        }

        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "M TTGH CD1");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(7);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2 = new LineDataSet(M2entryArrayList, "M TTGH SD");
        lineDataSetM2.setColor(Color.BLACK);
        lineDataSetM2.setCircleColor(Color.BLACK);
        lineDataSetM2.setCircleRadius(7);
        lineDataSetM2.setValueTextColor(Color.BLACK);


        lineDataSets = new ArrayList<>();
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
    private List<ILineDataSet> getLineDataValuesQ() {
        ArrayList<ILineDataSet> lineDataSetsQ = null;
        ArrayList<Entry> Q1entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();

        for (int i = 0; i < Q1val.length; i++) {
            Q1entryArrayList.add(new Entry(Q1val[i], i));
        }
        for (int i = 0; i < Q2val.length; i++) {
            Q2entryArrayList.add(new Entry(Q2val[i], i));
        }
//
        LineDataSet lineDataSetQ1 = new LineDataSet(Q1entryArrayList, "V TTGH CD1");
        lineDataSetQ1.setColor(Color.RED);
        lineDataSetQ1.setCircleColor(Color.RED);
        lineDataSetQ1.setCircleRadius(7);
        lineDataSetQ1.setValueTextColor(Color.RED);

        LineDataSet lineDataSetQ2 = new LineDataSet(Q2entryArrayList, "V TTGH SD");
        lineDataSetQ2.setColor(Color.MAGENTA);
        lineDataSetQ2.setCircleColor(Color.MAGENTA);
        lineDataSetQ2.setCircleRadius(7);
        lineDataSetQ2.setValueTextColor(Color.MAGENTA);


        lineDataSetsQ = new ArrayList<>();
        lineDataSetsQ.add(lineDataSetQ1);
        lineDataSetsQ.add(lineDataSetQ2);


        return lineDataSetsQ;
    }

    private List<String> getXvaluesQ() {
        ArrayList<String> xvaluesQ = new ArrayList<>();
        xvaluesQ.add("0");
        xvaluesQ.add("L/8");
        xvaluesQ.add("L/4");
        xvaluesQ.add("3L/8");
        xvaluesQ.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvaluesQ;
    }
}
