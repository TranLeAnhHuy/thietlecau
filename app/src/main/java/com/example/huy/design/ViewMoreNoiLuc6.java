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

public class ViewMoreNoiLuc6 extends AppCompatActivity {

    private LineChart lineChartM6;
    private LineData lineDataM6;
    double M61,M62,M63,M64,Q61,Q62,Q63,Q64,Q65,Q66,Q67,Q68,Q69,Q610;
    float Mval[]=new float[5];
    float Vval[]=new float[5];
    float V_val[]=new float[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc6);
        Intent ViewMoreNoiLuc6bundle = getIntent();
        // lấy dữ liệu
        M61= ViewMoreNoiLuc6bundle.getDoubleExtra("M61",0.0);
        M62= ViewMoreNoiLuc6bundle.getDoubleExtra("M62",0.0);
        M63= ViewMoreNoiLuc6bundle.getDoubleExtra("M63",0.0);
        M64= ViewMoreNoiLuc6bundle.getDoubleExtra("M64",0.0);
        Q61= ViewMoreNoiLuc6bundle.getDoubleExtra("Q61",0.0);
        Q62= ViewMoreNoiLuc6bundle.getDoubleExtra("Q62",0.0);
        Q63= ViewMoreNoiLuc6bundle.getDoubleExtra("Q63",0.0);
        Q64= ViewMoreNoiLuc6bundle.getDoubleExtra("Q64",0.0);
        Q65= ViewMoreNoiLuc6bundle.getDoubleExtra("Q65",0.0);
        Q66= ViewMoreNoiLuc6bundle.getDoubleExtra("Q66",0.0);
        Q67= ViewMoreNoiLuc6bundle.getDoubleExtra("Q67",0.0);
        Q68= ViewMoreNoiLuc6bundle.getDoubleExtra("Q68",0.0);
        Q69= ViewMoreNoiLuc6bundle.getDoubleExtra("Q69",0.0);
        Q610= ViewMoreNoiLuc6bundle.getDoubleExtra("Q610",0.0);
        //TTGH CĐ1-dầm trong
        Mval[0] = 0f;
        Mval[1] = (float)M61;
        Mval[2] = (float)M62;
        Mval[3] = (float)M63;
        Mval[4] = (float)M64;
        Vval[0]= (float)Q61;
        Vval[1]=(float)Q62;
        Vval[2]=(float)Q63;
        Vval[3]=(float)Q64;
        Vval[4]=(float)Q65;
        V_val[0]=- (float)Q66;
        V_val[1]=-(float)Q67;
        V_val[2]=-(float)Q68;
        V_val[3]=-(float)Q69;
        V_val[4]=-(float)Q610;
        lineChartM6= (LineChart) findViewById(R.id.linechartMV6);
        lineDataM6= new LineData(getXvaluesM6(),getLineDataValuesM6());
        lineChartM6.setData(lineDataM6);
        lineChartM6.setDescription("Biểu đồ Nội lực ở trạng thái mỏi");
        lineChartM6.setDescriptionTextSize(20f);
        lineChartM6.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartM6.animateY(7000);
        lineChartM6.invalidate();
        lineChartM6.setDrawGridBackground(true);
        lineChartM6.setDrawBorders(true);
        lineChartM6.setDescriptionTextSize(14);
        lineChartM6.getAxisRight().setEnabled(false);

    }
    private List<ILineDataSet> getLineDataValuesM6() {
        ArrayList<ILineDataSet> lineDataSetsM6 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> QentryArrayList = new ArrayList<>();
        ArrayList<Entry> Q_entryArrayList = new ArrayList<>();


        for (int i =0; i< Mval.length;i++){
            entryArrayList.add(new Entry(Mval[i],i));
        }
        for (int i =0; i<Vval.length;i++){
            QentryArrayList.add(new Entry(Vval[i],i));
        }
        for (int i =0; i<V_val.length;i++){
            Q_entryArrayList.add(new Entry(V_val[i],i));
        }



        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "Momen kN.m");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetV= new LineDataSet(QentryArrayList, "Lực cắt dương kN");
        lineDataSetV.setColor(Color.RED);
        lineDataSetV.setCircleColor(Color.RED);
        lineDataSetV.setCircleRadius(4);
        lineDataSetV.setValueTextSize(11f);
        lineDataSetV.setValueTextColor(Color.RED);

        LineDataSet lineDataSetV__= new LineDataSet(Q_entryArrayList, "Lực cắt âm kN");
        lineDataSetV__.setColor(Color.MAGENTA);
        lineDataSetV__.setCircleColor(Color.MAGENTA);
        lineDataSetV__.setCircleRadius(4);
        lineDataSetV__.setValueTextSize(11f);
        lineDataSetV__.setValueTextColor(Color.MAGENTA);






        lineDataSetsM6= new ArrayList<>();
        lineDataSetsM6.add(lineDataSet);
        lineDataSetsM6.add(lineDataSetV);
        lineDataSetsM6.add(lineDataSetV__);

        return lineDataSetsM6;
    }

    private List<String> getXvaluesM6() {
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
