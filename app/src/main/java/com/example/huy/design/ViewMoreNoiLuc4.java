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

public class ViewMoreNoiLuc4 extends AppCompatActivity {
    private LineChart lineChartM4,lineChartV41,lineChartV42;
    private LineData lineDataM4,lineDataV41,lineDataV42;
    double M41,M42,M43,M44,M45,M46,M47,M48,M49,M410,M411,M412,M413,M414,M415,M416;
    double Q41,Q42,Q43,Q44,Q45,Q46,Q47,Q48,Q49,Q410,Q411,Q412,Q413,Q414,Q415,Q416;
    double Q417,Q418,Q419,Q420,Q421,Q422,Q423,Q424,Q425,Q426,Q427,Q428,Q429,Q430;
    double Q431,Q432,Q433,Q434,Q435,Q436,Q437,Q438,Q439,Q440;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float M3val[]=new float[5];
    float M4val[]=new float[5];
    float Q1val[]=new float[5];
    float Q2val[]=new float[5];
    float Q3val[]=new float[5];
    float Q4val[]=new float[5];
    float Q5val[]=new float[5];
    float Q6val[]=new float[5];
    float Q7val[]=new float[5];
    float Q8val[]=new float[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_noi_luc4);
        //Láy kết quả
        Intent ViewMoreNoiLuc4bundle = getIntent();
        // lấy dữ liệu
        M41= ViewMoreNoiLuc4bundle.getDoubleExtra("M41",0.0);
        M42= ViewMoreNoiLuc4bundle.getDoubleExtra("M42",0.0);
        M43= ViewMoreNoiLuc4bundle.getDoubleExtra("M43",0.0);
        M44= ViewMoreNoiLuc4bundle.getDoubleExtra("M44",0.0);
        M45= ViewMoreNoiLuc4bundle.getDoubleExtra("M45",0.0);
        M46= ViewMoreNoiLuc4bundle.getDoubleExtra("M46",0.0);
        M47= ViewMoreNoiLuc4bundle.getDoubleExtra("M47",0.0);
        M48= ViewMoreNoiLuc4bundle.getDoubleExtra("M48",0.0);
        M49= ViewMoreNoiLuc4bundle.getDoubleExtra("M49",0.0);
        M410= ViewMoreNoiLuc4bundle.getDoubleExtra("M410",0.0);
        M411= ViewMoreNoiLuc4bundle.getDoubleExtra("M411",0.0);
        M412= ViewMoreNoiLuc4bundle.getDoubleExtra("M412",0.0);
        M413= ViewMoreNoiLuc4bundle.getDoubleExtra("M413",0.0);
        M414= ViewMoreNoiLuc4bundle.getDoubleExtra("M414",0.0);
        M415= ViewMoreNoiLuc4bundle.getDoubleExtra("M415",0.0);
        M416= ViewMoreNoiLuc4bundle.getDoubleExtra("M416",0.0);
        Q41= ViewMoreNoiLuc4bundle.getDoubleExtra("Q41",0.0);
        Q42= ViewMoreNoiLuc4bundle.getDoubleExtra("Q42",0.0);
        Q43= ViewMoreNoiLuc4bundle.getDoubleExtra("Q43",0.0);
        Q44= ViewMoreNoiLuc4bundle.getDoubleExtra("Q44",0.0);
        Q45= ViewMoreNoiLuc4bundle.getDoubleExtra("Q45",0.0);
        Q46= ViewMoreNoiLuc4bundle.getDoubleExtra("Q46",0.0);
        Q47= ViewMoreNoiLuc4bundle.getDoubleExtra("Q47",0.0);
        Q48= ViewMoreNoiLuc4bundle.getDoubleExtra("Q48",0.0);
        Q49= ViewMoreNoiLuc4bundle.getDoubleExtra("Q49",0.0);
        Q410= ViewMoreNoiLuc4bundle.getDoubleExtra("Q410",0.0);
        Q411= ViewMoreNoiLuc4bundle.getDoubleExtra("Q411",0.0);
        Q412= ViewMoreNoiLuc4bundle.getDoubleExtra("Q412",0.0);
        Q413= ViewMoreNoiLuc4bundle.getDoubleExtra("Q413",0.0);
        Q414= ViewMoreNoiLuc4bundle.getDoubleExtra("Q414",0.0);
        Q415= ViewMoreNoiLuc4bundle.getDoubleExtra("Q415",0.0);
        Q416= ViewMoreNoiLuc4bundle.getDoubleExtra("Q416",0.0);
        Q417= ViewMoreNoiLuc4bundle.getDoubleExtra("Q417",0.0);
        Q418= ViewMoreNoiLuc4bundle.getDoubleExtra("Q418",0.0);
        Q419= ViewMoreNoiLuc4bundle.getDoubleExtra("Q419",0.0);
        Q420= ViewMoreNoiLuc4bundle.getDoubleExtra("Q420",0.0);
        Q421= ViewMoreNoiLuc4bundle.getDoubleExtra("Q421",0.0);
        Q422= ViewMoreNoiLuc4bundle.getDoubleExtra("Q422",0.0);
        Q423= ViewMoreNoiLuc4bundle.getDoubleExtra("Q423",0.0);
        Q424= ViewMoreNoiLuc4bundle.getDoubleExtra("Q424",0.0);
        Q425= ViewMoreNoiLuc4bundle.getDoubleExtra("Q425",0.0);
        Q426= ViewMoreNoiLuc4bundle.getDoubleExtra("Q426",0.0);
        Q427= ViewMoreNoiLuc4bundle.getDoubleExtra("Q427",0.0);
        Q428= ViewMoreNoiLuc4bundle.getDoubleExtra("Q428",0.0);
        Q429= ViewMoreNoiLuc4bundle.getDoubleExtra("Q429",0.0);
        Q430= ViewMoreNoiLuc4bundle.getDoubleExtra("Q430",0.0);
        Q431= ViewMoreNoiLuc4bundle.getDoubleExtra("Q431",0.0);
        Q432= ViewMoreNoiLuc4bundle.getDoubleExtra("Q432",0.0);
        Q433= ViewMoreNoiLuc4bundle.getDoubleExtra("Q433",0.0);
        Q434= ViewMoreNoiLuc4bundle.getDoubleExtra("Q434",0.0);
        Q435= ViewMoreNoiLuc4bundle.getDoubleExtra("Q435",0.0);
        Q436= ViewMoreNoiLuc4bundle.getDoubleExtra("Q436",0.0);
        Q437= ViewMoreNoiLuc4bundle.getDoubleExtra("Q437",0.0);
        Q438= ViewMoreNoiLuc4bundle.getDoubleExtra("Q438",0.0);
        Q439= ViewMoreNoiLuc4bundle.getDoubleExtra("Q439",0.0);
        Q440= ViewMoreNoiLuc4bundle.getDoubleExtra("Q440",0.0);

        //TTGH CĐ1-dầm trong
        M1val[0] = 0f;
        M1val[1] = (float)M41;
        M1val[2] = (float)M42;
        M1val[3] = (float)M43;
        M1val[4] = (float)M44;
        //TTGH CĐ1-dầm ngoài
        M2val[0] = 0f;
        M2val[1] = (float)M45;
        M2val[2] = (float)M46;
        M2val[3] = (float)M47;
        M2val[4] = (float)M48;
//TTGH SD-dầm trong
        M3val[0] = 0f;
        M3val[1] = (float)M49;
        M3val[2] = (float)M410;
        M3val[3] = (float)M411;
        M3val[4] = (float)M412;

//TTGH SD-dầm ngoài
        M4val[0] = 0f;
        M4val[1] = (float)M413;
        M4val[2] = (float)M414;
        M4val[3] = (float)M415;
        M4val[4] = (float)M416;

        // LỰC CẮT DƯƠNG
        // dầm trong CD1
        Q1val[0]= (float)Q41;
        Q1val[1]=(float)Q42;
        Q1val[2]=(float)Q43;
        Q1val[3]=(float)Q44;
        Q1val[4]=(float)Q45;
        //DẦM TRONG SỬ DỤNG
        Q2val[0]=(float)Q46;
        Q2val[1]=(float)Q47;
        Q2val[2]=(float)Q48;
        Q2val[3]=(float)Q49;
        Q2val[4]=(float)Q410;
        //dầm ngoài CD1
        Q3val[0]=(float)Q411;
        Q3val[1]=(float)Q412;
        Q3val[2]=(float)Q413;
        Q3val[3]=(float)Q414;
        Q3val[4]=(float)Q415;
        //dầm ngoài sử dụng
        Q4val[0]=(float)Q416;
        Q4val[1]=(float)Q417;
        Q4val[2]=(float)Q418;
        Q4val[3]=(float)Q419;
        Q4val[4]=(float)Q420;


        // lực cắt âm
        //// dầm trong cd1
        Q5val[0]=(float)Q421;
        Q5val[1]=(float)Q422;
        Q5val[2]=(float)Q423;
        Q5val[3]=(float)Q424;
        Q5val[4]=(float)Q425;
        ///dầm trong sử dụng
        Q6val[0]=(float)Q426;
        Q6val[1]=(float)Q427;
        Q6val[2]=(float)Q428;
        Q6val[3]=(float)Q429;
        Q6val[4]=(float)Q430;
        ///dầm ngoài sử dung
        Q7val[0]=(float)Q431;
        Q7val[1]=(float)Q432;
        Q7val[2]=(float)Q433;
        Q7val[3]=(float)Q434;
        Q7val[4]=(float)Q435;
        ////dầm ngoài cd1
        Q8val[0]=(float)Q436;
        Q8val[1]=(float)Q437;
        Q8val[2]=(float)Q438;
        Q8val[3]=(float)Q439;
        Q8val[4]=(float)Q440;


        lineChartM4= (LineChart) findViewById(R.id.linechartM4);
        lineDataM4= new LineData(getXvaluesM4(),getLineDataValuesM4());
        lineChartM4.setData(lineDataM4);
        lineChartM4.setDescription("Biểu đồ Momen do Hoạt tải gây ra");
        lineChartM4.setDescriptionTextSize(20f);
        lineChartM4.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartM4.animateY(7000);
        lineChartM4.invalidate();
        lineChartM4.setDrawGridBackground(true);
        lineChartM4.setDrawBorders(true);
        lineChartM4.setDescriptionTextSize(14);

        lineChartV41= (LineChart) findViewById(R.id.linechartV41);
        lineDataV41= new LineData(getXvaluesV41(),getLineDataValuesV41());
        lineChartV41.setData(lineDataV41);
        lineChartV41.setDescription("Biểu đồ Lực cắt dương do Hoạt tải gây ra");
        lineChartV41.setDescriptionTextSize(20f);
        lineChartV41.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV41.animateY(7000);
        lineChartV41.invalidate();
        lineChartV41.setDrawGridBackground(true);
        lineChartV41.setDrawBorders(true);
        lineChartV41.setDescriptionTextSize(14);


        lineChartV42= (LineChart) findViewById(R.id.linechartV42);
        lineDataV42= new LineData(getXvaluesV42(),getLineDataValuesV42());
        lineChartV42.setData(lineDataV42);
        lineChartV42.setDescription("Biểu đồ Lực cắt âm do Hoạt tải gây ra");
        lineChartV42.setDescriptionTextSize(20f);
        lineChartV42.setDescriptionColor(Color.DKGRAY);
        // lineChart.setBackgroundColor(Color.BLACK);
        lineChartV42.animateY(7000);
        lineChartV42.invalidate();
        lineChartV42.setDrawGridBackground(true);
        lineChartV42.setDrawBorders(true);
        lineChartV42.setDescriptionTextSize(14);
    }
    private List<ILineDataSet> getLineDataValuesV42() {
        ArrayList<ILineDataSet> lineDataSetsV42 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q4entryArrayList = new ArrayList<>();

        for (int i =0; i< Q5val.length;i++){
            entryArrayList.add(new Entry(Q5val[i],i));
        }
        for (int i =0; i<Q6val.length;i++){
            Q2entryArrayList.add(new Entry(Q6val[i],i));
        }
        for (int i =0; i<Q7val.length;i++){
            Q3entryArrayList.add(new Entry(Q7val[i],i));
        }
        for (int i =0; i<Q8val.length;i++){
            Q4entryArrayList.add(new Entry(Q8val[i],i));
        }

        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "V DT TTCD1");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "V DT TTSD");
        lineDataSetM2.setColor(Color.BLACK);
        lineDataSetM2.setCircleColor(Color.BLACK);
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.BLACK);


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "V DN TTSD");
        lineDataSetM3.setColor(Color.MAGENTA);
        lineDataSetM3.setCircleColor(Color.MAGENTA);
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.MAGENTA);


        LineDataSet lineDataSetM4= new LineDataSet(Q4entryArrayList, "V DN TTCD1");
        lineDataSetM4.setColor(Color.RED);
        lineDataSetM4.setCircleColor(Color.RED);
        lineDataSetM4.setCircleRadius(4);
        lineDataSetM4.setValueTextSize(11f);
        lineDataSetM4.setValueTextColor(Color.RED);



        lineDataSetsV42= new ArrayList<>();
        lineDataSetsV42.add(lineDataSet);
        lineDataSetsV42.add(lineDataSetM2);
        lineDataSetsV42.add(lineDataSetM3);
        lineDataSetsV42.add(lineDataSetM4);

        return lineDataSetsV42;
    }

    private List<String> getXvaluesV42() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }

    private List<ILineDataSet> getLineDataValuesV41() {
        ArrayList<ILineDataSet> lineDataSetsV41 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q2entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q3entryArrayList = new ArrayList<>();
        ArrayList<Entry> Q4entryArrayList = new ArrayList<>();

        for (int i =0; i< Q1val.length;i++){
            entryArrayList.add(new Entry(Q1val[i],i));
        }
        for (int i =0; i<Q2val.length;i++){
            Q2entryArrayList.add(new Entry(Q2val[i],i));
        }
        for (int i =0; i<Q3val.length;i++){
            Q3entryArrayList.add(new Entry(Q3val[i],i));
        }
        for (int i =0; i<Q4val.length;i++){
            Q4entryArrayList.add(new Entry(Q4val[i],i));
        }

        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "V DT TTCD1");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2= new LineDataSet(Q2entryArrayList, "V DT TTSD");
        lineDataSetM2.setColor(Color.BLACK);
        lineDataSetM2.setCircleColor(Color.BLACK);
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.BLACK);


        LineDataSet lineDataSetM3= new LineDataSet(Q3entryArrayList, "V DN TTCD1");
        lineDataSetM3.setColor(Color.MAGENTA);
        lineDataSetM3.setCircleColor(Color.MAGENTA);
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.MAGENTA);


        LineDataSet lineDataSetM4= new LineDataSet(Q4entryArrayList, "V DN TTSD");
        lineDataSetM4.setColor(Color.RED);
        lineDataSetM4.setCircleColor(Color.RED);
        lineDataSetM4.setCircleRadius(4);
        lineDataSetM4.setValueTextSize(11f);
        lineDataSetM4.setValueTextColor(Color.RED);



        lineDataSetsV41= new ArrayList<>();
        lineDataSetsV41.add(lineDataSet);
        lineDataSetsV41.add(lineDataSetM2);
        lineDataSetsV41.add(lineDataSetM3);
        lineDataSetsV41.add(lineDataSetM4);

        return lineDataSetsV41;
    }

    private List<String> getXvaluesV41() {
        ArrayList<String> xvalues = new ArrayList<>();
        xvalues.add("0");
        xvalues.add("L/8");
        xvalues.add("L/4");
        xvalues.add("3L/8");
        xvalues.add("L/2");
        //xvalues.set(Color.BLUE);
        return xvalues;
    }


    private List<ILineDataSet> getLineDataValuesM4() {
        ArrayList<ILineDataSet> lineDataSetsM4 = null;
        ArrayList<Entry> entryArrayList = new ArrayList<>();
        ArrayList<Entry> M2entryArrayList = new ArrayList<>();
        ArrayList<Entry> M3entryArrayList = new ArrayList<>();
        ArrayList<Entry> M4entryArrayList = new ArrayList<>();

        for (int i =0; i< M1val.length;i++){
            entryArrayList.add(new Entry(M1val[i],i));
        }
        for (int i =0; i<M2val.length;i++){
            M2entryArrayList.add(new Entry(M2val[i],i));
        }
        for (int i =0; i<M3val.length;i++){
            M3entryArrayList.add(new Entry(M3val[i],i));
        }
        for (int i =0; i<M4val.length;i++){
            M4entryArrayList.add(new Entry(M4val[i],i));
        }

        LineDataSet lineDataSet= new LineDataSet(entryArrayList, "M DT TTCD1");
        lineDataSet.setColor(Color.BLUE);
        lineDataSet.setCircleColor(Color.BLUE);
        lineDataSet.setCircleRadius(4);
        lineDataSet.setValueTextSize(11f);
        lineDataSet.setValueTextColor(Color.BLUE);


        LineDataSet lineDataSetM2= new LineDataSet(M2entryArrayList, "M DN TTCD1");
        lineDataSetM2.setColor(Color.BLACK);
        lineDataSetM2.setCircleColor(Color.BLACK);
        lineDataSetM2.setCircleRadius(4);
        lineDataSetM2.setValueTextSize(11f);
        lineDataSetM2.setValueTextColor(Color.BLACK);


        LineDataSet lineDataSetM3= new LineDataSet(M3entryArrayList, "M DT TTSD");
        lineDataSetM3.setColor(Color.MAGENTA);
        lineDataSetM3.setCircleColor(Color.MAGENTA);
        lineDataSetM3.setCircleRadius(4);
        lineDataSetM3.setValueTextSize(11f);
        lineDataSetM3.setValueTextColor(Color.MAGENTA);


        LineDataSet lineDataSetM4= new LineDataSet(M4entryArrayList, "M DN TTSD");
        lineDataSetM4.setColor(Color.RED);
        lineDataSetM4.setCircleColor(Color.RED);
        lineDataSetM4.setCircleRadius(4);
        lineDataSetM4.setValueTextSize(11f);
        lineDataSetM4.setValueTextColor(Color.RED);



        lineDataSetsM4= new ArrayList<>();
        lineDataSetsM4.add(lineDataSet);
        lineDataSetsM4.add(lineDataSetM2);
        lineDataSetsM4.add(lineDataSetM3);
        lineDataSetsM4.add(lineDataSetM4);

        return lineDataSetsM4;
    }

    private List<String> getXvaluesM4() {
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
