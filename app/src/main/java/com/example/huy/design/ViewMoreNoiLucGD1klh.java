package com.example.huy.design;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ViewMoreNoiLucGD1klh extends AppCompatActivity {
    private LineChart lineChart,lineChartV;
    private LineData lineData,lineDataV;
    double M11,M12,M13,M14,M15,M16,M17,M18,Q11,Q12,Q13,Q14,Q15,Q16,Q17,Q18;
    ///   float x=0;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float Q1val[]=new float[5];
    float Q2val[]=new float[5];
    Button btnSaveNoiLucGD1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc_gd1klh);
        btnSaveNoiLucGD1=(Button) findViewById(R.id.btnSaveNoiLucGD1) ;

        //Láy kết quả
        Intent ViewMoreNOILUCGD1bundleklh = getIntent();
        // lấy dữ liệu
        M11= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M11",0.0);
        M12= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M12",0.0);
        M13= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M13",0.0);
        M14= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M14",0.0);
        M15= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M15",0.0);
        M16= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M16",0.0);
        M17= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M17",0.0);
        M18= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("M18",0.0);

        Q11= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q11",0.0);
        Q12= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q12",0.0);
        Q13= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q13",0.0);
        Q14= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q14",0.0);
        Q15= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q15",0.0);
        Q16= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q16",0.0);
        Q17= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q17",0.0);
        Q18= ViewMoreNOILUCGD1bundleklh.getDoubleExtra("Q18",0.0);

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
        lineChart.setDescription("Biểu đồ Momen GD1");
        lineChart.setDescriptionTextSize(20f);
        lineChart.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChart.animateY(7000);
        lineChart.invalidate();
        lineChart.setDrawGridBackground(true);
        lineChart.setDrawBorders(true);
        lineChart.setDescriptionTextSize(14);

        lineChartV= (LineChart) findViewById(R.id.linechartV);
        lineDataV= new LineData(getXvaluesV(),getLineDataValuesV());
        lineChartV.setData(lineDataV);
        lineChartV.setDescription("Biểu đồ Lực cắt GD1");
        lineChartV.setDescriptionTextSize(20f);
        lineChartV.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV.animateY(7000);
        lineChartV.invalidate();
        lineChartV.setDrawGridBackground(true);
        lineChartV.setDrawBorders(true);
        lineChartV.setDescriptionTextSize(14);

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
    private List<ILineDataSet> getLineDataValuesV() {
        ArrayList<ILineDataSet> lineDataSetsV = null;
        ArrayList<Entry> Q1entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();

        for (int i =0; i<Q1val.length;i++){
            Q1entryArrayList.add(new Entry(Q1val[i],i));
        }
        for (int i =0; i<Q2val.length;i++){
            Q2entryArrayList.add(new Entry(Q2val[i],i));
        }
//

        LineDataSet lineDataSetQ1= new LineDataSet(Q1entryArrayList, "V TTGH CD1");
        lineDataSetQ1.setColor(Color.RED);
        lineDataSetQ1.setCircleColor(Color.RED);
        lineDataSetQ1.setCircleRadius(7);
        lineDataSetQ1.setValueTextColor(Color.RED);

        LineDataSet lineDataSetQ2= new LineDataSet(Q2entryArrayList, "V TTGH SD");
        lineDataSetQ2.setColor(Color.MAGENTA);
        lineDataSetQ2.setCircleColor(Color.MAGENTA);
        lineDataSetQ2.setCircleRadius(7);
        lineDataSetQ2.setValueTextColor(Color.MAGENTA);


        lineDataSetsV= new ArrayList<>();

        lineDataSetsV.add(lineDataSetQ1);
        lineDataSetsV.add(lineDataSetQ2);


        return lineDataSetsV;
    }

    private List<String> getXvaluesV() {
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
