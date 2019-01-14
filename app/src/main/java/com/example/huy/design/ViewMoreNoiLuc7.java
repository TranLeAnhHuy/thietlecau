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

public class ViewMoreNoiLuc7 extends AppCompatActivity {
    private LineChart lineChartM71,lineChartM72,lineChartV71,lineChartV72;
    private LineData lineDataM71,lineDataM72,lineDataV71,lineDataV72;
    double M71,M72,M73,M74,M75,M76,M77,M78,M79,M710,M711,M712,M713,M714,M715,M716,M717,M718,M719,M720,M721,M722,M723,M724;
    double Q71,Q72,Q73,Q74,Q75,Q76,Q77,Q78,Q79,Q710,Q711,Q712,Q713,Q714,Q715,Q716,Q717,Q718,Q719,Q720,Q721,Q722,Q723,Q724,Q725,Q726,Q727,Q728,Q729,Q730;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float M3val[]=new float[5];

    float M4val[]=new float[5];
    float M5val[]=new float[5];
    float M6val[]=new float[5];

    float Q1val[]=new float[5];
    float Q2val[]=new float[5];
    float Q3val[]=new float[5];

    float Q4val[]=new float[5];
    float Q5val[]=new float[5];
    float Q6val[]=new float[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc7);

        Intent ViewMoreNoiLuc7bundle = getIntent();
        // lấy dữ liệu
        M71= ViewMoreNoiLuc7bundle.getDoubleExtra("M71",0.0);
        M72= ViewMoreNoiLuc7bundle.getDoubleExtra("M72",0.0);
        M73= ViewMoreNoiLuc7bundle.getDoubleExtra("M73",0.0);
        M74= ViewMoreNoiLuc7bundle.getDoubleExtra("M74",0.0);
        M75= ViewMoreNoiLuc7bundle.getDoubleExtra("M75",0.0);
        M76= ViewMoreNoiLuc7bundle.getDoubleExtra("M76",0.0);
        M77= ViewMoreNoiLuc7bundle.getDoubleExtra("M77",0.0);
        M78= ViewMoreNoiLuc7bundle.getDoubleExtra("M78",0.0);
        M79= ViewMoreNoiLuc7bundle.getDoubleExtra("M79",0.0);
        M710= ViewMoreNoiLuc7bundle.getDoubleExtra("M710",0.0);
        M711= ViewMoreNoiLuc7bundle.getDoubleExtra("M711",0.0);
        M712= ViewMoreNoiLuc7bundle.getDoubleExtra("M712",0.0);
        M713= ViewMoreNoiLuc7bundle.getDoubleExtra("M713",0.0);
        M714= ViewMoreNoiLuc7bundle.getDoubleExtra("M714",0.0);
        M715= ViewMoreNoiLuc7bundle.getDoubleExtra("M715",0.0);
        M716= ViewMoreNoiLuc7bundle.getDoubleExtra("M716",0.0);
        M717= ViewMoreNoiLuc7bundle.getDoubleExtra("M717",0.0);
        M718= ViewMoreNoiLuc7bundle.getDoubleExtra("M718",0.0);
        M719= ViewMoreNoiLuc7bundle.getDoubleExtra("M719",0.0);
        M720= ViewMoreNoiLuc7bundle.getDoubleExtra("M720",0.0);
        M721= ViewMoreNoiLuc7bundle.getDoubleExtra("M721",0.0);
        M722= ViewMoreNoiLuc7bundle.getDoubleExtra("M722",0.0);
        M723= ViewMoreNoiLuc7bundle.getDoubleExtra("M723",0.0);
        M724= ViewMoreNoiLuc7bundle.getDoubleExtra("M724",0.0);

        Q71= ViewMoreNoiLuc7bundle.getDoubleExtra("Q71",0.0);
        Q72= ViewMoreNoiLuc7bundle.getDoubleExtra("Q72",0.0);
        Q73= ViewMoreNoiLuc7bundle.getDoubleExtra("Q73",0.0);
        Q74= ViewMoreNoiLuc7bundle.getDoubleExtra("Q74",0.0);
        Q75= ViewMoreNoiLuc7bundle.getDoubleExtra("Q75",0.0);
        Q76= ViewMoreNoiLuc7bundle.getDoubleExtra("Q76",0.0);
        Q77= ViewMoreNoiLuc7bundle.getDoubleExtra("Q77",0.0);
        Q78= ViewMoreNoiLuc7bundle.getDoubleExtra("Q78",0.0);
        Q79= ViewMoreNoiLuc7bundle.getDoubleExtra("Q79",0.0);
        Q710= ViewMoreNoiLuc7bundle.getDoubleExtra("Q710",0.0);
        Q711= ViewMoreNoiLuc7bundle.getDoubleExtra("Q711",0.0);
        Q712= ViewMoreNoiLuc7bundle.getDoubleExtra("Q712",0.0);
        Q713= ViewMoreNoiLuc7bundle.getDoubleExtra("Q713",0.0);
        Q714= ViewMoreNoiLuc7bundle.getDoubleExtra("Q714",0.0);
        Q715= ViewMoreNoiLuc7bundle.getDoubleExtra("Q715",0.0);
        Q716= ViewMoreNoiLuc7bundle.getDoubleExtra("Q716",0.0);
        Q717= ViewMoreNoiLuc7bundle.getDoubleExtra("Q717",0.0);
        Q718= ViewMoreNoiLuc7bundle.getDoubleExtra("Q718",0.0);
        Q719= ViewMoreNoiLuc7bundle.getDoubleExtra("Q719",0.0);
        Q720= ViewMoreNoiLuc7bundle.getDoubleExtra("Q720",0.0);
        Q721= ViewMoreNoiLuc7bundle.getDoubleExtra("Q721",0.0);
        Q722= ViewMoreNoiLuc7bundle.getDoubleExtra("Q722",0.0);
        Q723= ViewMoreNoiLuc7bundle.getDoubleExtra("Q723",0.0);
        Q724= ViewMoreNoiLuc7bundle.getDoubleExtra("Q724",0.0);
        Q725= ViewMoreNoiLuc7bundle.getDoubleExtra("Q725",0.0);
        Q726= ViewMoreNoiLuc7bundle.getDoubleExtra("Q726",0.0);
        Q727= ViewMoreNoiLuc7bundle.getDoubleExtra("Q727",0.0);
        Q728= ViewMoreNoiLuc7bundle.getDoubleExtra("Q728",0.0);
        Q729= ViewMoreNoiLuc7bundle.getDoubleExtra("Q729",0.0);
        Q730= ViewMoreNoiLuc7bundle.getDoubleExtra("Q730",0.0);
        //TTGH CĐ1-dầm trong
        M1val[0] = 0f;
        M1val[1] = (float)M71;
        M1val[2] = (float)M72;
        M1val[3] = (float)M73;
        M1val[4] = (float)M74;
        //TTGH CĐ1-dầm ngoài
        M2val[0] = 0f;
        M2val[1] = (float)M75;
        M2val[2] = (float)M76;
        M2val[3] = (float)M77;
        M2val[4] = (float)M78;
        //sử dụng dầm trong
        M3val[0] = 0f;
        M3val[1] = (float)M79;
        M3val[2] = (float)M710;
        M3val[3] = (float)M711;
        M3val[4] = (float)M712;

        //sd dầm ngoài
        M4val[0] = 0f;
        M4val[1] = (float)M713;
        M4val[2] = (float)M714;
        M4val[3] = (float)M715;
        M4val[4] = (float)M716;

        //mỏi dầm trong
        M5val[0] = 0f;
        M5val[1] = (float)M717;
        M5val[2] = (float)M718;
        M5val[3] = (float)M719;
        M5val[4] = (float)M720;
        // mỏi dầm ngoài
        M6val[0] = 0f;
        M6val[1] = (float)M721;
        M6val[2] = (float)M722;
        M6val[3] = (float)M723;
        M6val[4] = (float)M724;


        //cd1 dầm trong
        Q1val[0] = (float)Q71;
        Q1val[1] = (float)Q72;
        Q1val[2] = (float)Q73;
        Q1val[3] = (float)Q74;
        Q1val[4] = (float)Q75;
        // cd1 dầm ngoài
        Q2val[0] = (float)Q76;
        Q2val[1] = (float)Q77;
        Q2val[2] = (float)Q78;
        Q2val[3] = (float)Q79;
        Q2val[4] = (float)Q710;
        //sủ dụng dầm trong
        Q3val[0] = (float)Q711;
        Q3val[1] = (float)Q712;
        Q3val[2] = (float)Q713;
        Q3val[3] = (float)Q714;
        Q3val[4] = (float)Q715;
        // sử dụng dầm ngoài
        Q4val[0] = (float)Q716;
        Q4val[1] = (float)Q717;
        Q4val[2] = (float)Q718;
        Q4val[3] = (float)Q719;
        Q4val[4] = (float)Q720;
        //mỏi dầm trong
        Q5val[0] = (float)Q721;
        Q5val[1] = (float)Q722;
        Q5val[2] = (float)Q723;
        Q5val[3] = (float)Q724;
        Q5val[4] = (float)Q725;
        // mỏi dầm ngoài
        Q6val[0] = (float)Q726;
        Q6val[1] = (float)Q727;
        Q6val[2] = (float)Q728;
        Q6val[3] = (float)Q729;
        Q6val[4] = (float)Q730;
        lineChartM71= (LineChart) findViewById(R.id.linechartM71);
        lineDataM71= new LineData(getXvaluesM71(),getLineDataValuesM71());
        lineChartM71.setData(lineDataM71);
        lineChartM71.setDescription("Biểu đồ tổng hợp Momen dầm trong");
        lineChartM71.setDescriptionTextSize(20f);
        lineChartM71.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartM71.animateY(7000);
        lineChartM71.invalidate();
        lineChartM71.setDrawGridBackground(true);
        lineChartM71.setDrawBorders(true);
        lineChartM71.setDescriptionTextSize(14);
        lineChartM71.getAxisRight().setEnabled(false);

        lineChartM72= (LineChart) findViewById(R.id.linechartM72);
        lineDataM72= new LineData(getXvaluesM72(),getLineDataValuesM72());
        lineChartM72.setData(lineDataM72);
        lineChartM72.setDescription("Biểu đồ tổng hợp Momen dầm ngoài");
        lineChartM72.setDescriptionTextSize(20f);
        lineChartM72.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartM72.animateY(7000);
        lineChartM72.invalidate();
        lineChartM72.setDrawGridBackground(true);
        lineChartM72.setDrawBorders(true);
        lineChartM72.setDescriptionTextSize(14);
        lineChartM72.getAxisRight().setEnabled(false);

        lineChartV71= (LineChart) findViewById(R.id.linechartV71);
        lineDataV71= new LineData(getXvaluesV71(),getLineDataValuesV71());
        lineChartV71.setData(lineDataV71);
        lineChartV71.setDescription("Biểu đồ tổng hợp Lực cắt dầm trong");
        lineChartV71.setDescriptionTextSize(20f);
        lineChartV71.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV71.animateY(7000);
        lineChartV71.invalidate();
        lineChartV71.setDrawGridBackground(true);
        lineChartV71.setDrawBorders(true);
        lineChartV71.setDescriptionTextSize(14);
        lineChartV71.getAxisRight().setEnabled(false);

        lineChartV72= (LineChart) findViewById(R.id.linechartV72);
        lineDataV72= new LineData(getXvaluesV72(),getLineDataValuesV72());
        lineChartV72.setData(lineDataV72);
        lineChartV72.setDescription("Biểu đồ tổng hợp Lực cắt dầm ngoài");
        lineChartV72.setDescriptionTextSize(20f);
        lineChartV72.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV72.animateY(7000);
        lineChartV72.invalidate();
        lineChartV72.setDrawGridBackground(true);
        lineChartV72.setDrawBorders(true);
        lineChartV72.setDescriptionTextSize(14);
        lineChartV72.getAxisRight().setEnabled(false);

    }

    private List<ILineDataSet> getLineDataValuesV72() {
        ArrayList<ILineDataSet> lineDataSetsV72 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();


        for (int i =0; i< Q2val.length;i++){
            entryArrayList.add(new Entry(Q2val[i],i));
        }
        for (int i =0; i<Q4val.length;i++){
            Q2entryArrayList.add(new Entry(Q4val[i],i));
        }
        for (int i =0; i<Q6val.length;i++){
            Q3entryArrayList.add(new Entry(Q6val[i],i));
        }


        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "V DN TTCD1");
        lineDataSet.setColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.parseColor("#8e24aa"));


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "V DN TTSD");
        lineDataSetM2.setColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.parseColor("#FFF4C908"));


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "V DN TT MỎI");
        lineDataSetM3.setColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.parseColor("#FFEF0667"));


        lineDataSetsV72= new ArrayList<>();
        lineDataSetsV72.add(lineDataSet);
        lineDataSetsV72.add(lineDataSetM2);
        lineDataSetsV72.add(lineDataSetM3);

        return lineDataSetsV72;
    }

    private List<String> getXvaluesV72() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }
    private List<ILineDataSet> getLineDataValuesV71() {
        ArrayList<ILineDataSet> lineDataSetsV71 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();


        for (int i =0; i< Q1val.length;i++){
            entryArrayList.add(new Entry(Q1val[i],i));
        }
        for (int i =0; i<Q3val.length;i++){
            Q2entryArrayList.add(new Entry(Q3val[i],i));
        }
        for (int i =0; i<Q5val.length;i++){
            Q3entryArrayList.add(new Entry(Q5val[i],i));
        }


        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "V DT TTCD1");
        lineDataSet.setColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.parseColor("#8e24aa"));


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "V DT TTSD");
        lineDataSetM2.setColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.parseColor("#FFF4C908"));


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "V DT TT MỎI");
        lineDataSetM3.setColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.parseColor("#FFEF0667"));


        lineDataSetsV71= new ArrayList<>();
        lineDataSetsV71.add(lineDataSet);
        lineDataSetsV71.add(lineDataSetM2);
        lineDataSetsV71.add(lineDataSetM3);

        return lineDataSetsV71;
    }

    private List<String> getXvaluesV71() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }

    private List<ILineDataSet> getLineDataValuesM72() {
        ArrayList<ILineDataSet> lineDataSetsM72 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();


        for (int i =0; i< M2val.length;i++){
            entryArrayList.add(new Entry(M2val[i],i));
        }
        for (int i =0; i<M4val.length;i++){
            Q2entryArrayList.add(new Entry(M4val[i],i));
        }
        for (int i =0; i<M6val.length;i++){
            Q3entryArrayList.add(new Entry(M6val[i],i));
        }


        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "M DN TTCD1");
        lineDataSet.setColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.parseColor("#8e24aa"));


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "M DN TTSD");
        lineDataSetM2.setColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.parseColor("#FFF4C908"));


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "M DN TT MỎI");
        lineDataSetM3.setColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.parseColor("#FFEF0667"));


        lineDataSetsM72= new ArrayList<>();
        lineDataSetsM72.add(lineDataSet);
        lineDataSetsM72.add(lineDataSetM2);
        lineDataSetsM72.add(lineDataSetM3);

        return lineDataSetsM72;
    }

    private List<String> getXvaluesM72() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }
    private List<ILineDataSet> getLineDataValuesM71() {
        ArrayList<ILineDataSet> lineDataSetsM71 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();


        for (int i =0; i< M1val.length;i++){
            entryArrayList.add(new Entry(M1val[i],i));
        }
        for (int i =0; i<M3val.length;i++){
            Q2entryArrayList.add(new Entry(M3val[i],i));
        }
        for (int i =0; i<M5val.length;i++){
            Q3entryArrayList.add(new Entry(M5val[i],i));
        }


        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "M DT TTCD1");
        lineDataSet.setColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleColor(Color.parseColor("#8e24aa"));
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.parseColor("#8e24aa"));


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "M DT TTSD");
        lineDataSetM2.setColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleColor(Color.parseColor("#FFF4C908"));
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.parseColor("#FFF4C908"));


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "M DT TT MỎI");
        lineDataSetM3.setColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleColor(Color.parseColor("#FFEF0667"));
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.parseColor("#FFEF0667"));


        lineDataSetsM71= new ArrayList<>();
        lineDataSetsM71.add(lineDataSet);
        lineDataSetsM71.add(lineDataSetM2);
        lineDataSetsM71.add(lineDataSetM3);

        return lineDataSetsM71;
    }

    private List<String> getXvaluesM71() {
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
